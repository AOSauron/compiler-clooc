import org.antlr.runtime.tree.*;
import java.util.LinkedList;
import java.util.List;
import java.util.HashMap;
import java.io.File;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.IOException;

/*
 * Générateur de code assembleur à partir de l'AST et de la TDS. Ouvre un fichier source .asm et le remplit de ce code.
 * @author : Guillaume Garcia
 * Pour Clooc - PCL 2017 - TELECOM Nancy
 */

public class AsmGenerator {

  private File file;
  private FileWriter fileWriter;
  private PrintWriter printWriter;
  private String asmname;
  private String tab;
  private String nline;
  private String path;
  private boolean optiond;
  private CommonTree ast;
  private NodeTDS tds;

  public AsmGenerator(CommonTree ast, NodeTDS tds) {
    this.ast = ast;
    this.tds = tds;
    tab = "\t";
    nline = "\n";
    optiond = false;
  }


  /*
   * Ouvre un fichier .asm source pour y générer du code assembleur.
   * Ce fichier pourra ensuite être compilé en binaire par le jar microPIUP.jar d'A. Parodi
   */
  public void openFile(File loocfile) {

    int index = -1;
    String purename;

    try {
      purename = loocfile.getName();
      // Si le fichier a une extension on la tronque (on tronque la dernière extension.)
      if ((index = loocfile.getName().lastIndexOf(".")) != -1) {
        purename = loocfile.getName().substring(0, loocfile.getName().lastIndexOf("."));
      }
    }
    // Si aucun de nom de fichier n'est renseigné on en prend un par défaut.
    catch (NullPointerException e) {
      purename = "NoName";
    }

    // On ajoute l'extension .asm
    asmname = purename + ".asm";

    // Option -d
    if (optiond) {
      // Append au path le caractère / si il n'existe pas déjà
      if (!path.substring(path.length()-1).equals("/")) {
        path = path + "/";
      }
      asmname = path + asmname;
    }

    try {
      // Ouverture du fichier
      file = new File(asmname);
      fileWriter = new FileWriter(file);
      printWriter = new PrintWriter(fileWriter);
    }
    catch (IOException ioe) {
      System.out.println("IOException - Erreur lors de l'ouverture du fichier soure " + asmname + " pour la génération de code assembleur");
      System.exit(1);
    }

    return;
  }


  /*
   * Retourne le fichier source .asm (type File)
   */
  public File getFile() {
    return file;
  }


  /*
   * Permet de propager l'option -d
   */
  public void setOption(boolean flag) {
    this.optiond = flag;
  }


  /*
   * Set le chemin où produire les fichiers assembleurs (source.asm et exec.iup)
   */
  public void setPath(String path) {
    this.path = path;
  }


  /*
   * Fermeture du fichier et des writer.
   */
  public void closeFile() throws IOException {

    // Ajout de l'exit 0 à la fin du fichier
    printWriter.print(tab + "TRP #64");

    try {
      fileWriter.flush();
      fileWriter.close();
      printWriter.close();
      return;
    }
    catch (IOException ioe) {
      System.out.println("IOException - Erreur lors de la fermeture du fichier soure " + asmname + " après la génération du code assembleur");
      System.exit(1);
    }
  }


  /*
   * Lance la procédure de génération de code dans le fichier source .asm
   */
  public void initGen() {

    // Directives de préassemblage
    String sp = "SP EQU R15"; // Alias du stack pointer
    String org = "ORG 0x2000"; // Charge le programme d'assemblage à l'adresse 0x2000
    String start = "START 0x2000"; // Lance le programme à l'adresse 0x2000
    String newline = "NEWLINE RSW 1\n" + tab + "LDW R0, #0x0a00\n" + tab + "STW R0, @NEWLINE"; // Le caractère de retour à la ligne est desormais stocké dans l'etiquette NEWLINE
    printWriter.print(sp + nline);
    printWriter.print(org);
    printWriter.print(start);
    printWriter.print(nline + newline);

    // Reste du progamme
    exploreAndGen(ast, tds);

  }


  /*
   * Parcourt de nouveau l'arbre syntaxique ainsi que la TDS si aucune erreur sémantique/syntaxique
   * Produit directement le code assembleur dans le fichier source .asm
   */
  public void exploreAndGen(CommonTree treeToConvert, NodeTDS tdsNode) {

    //Récupère la TDS du node passé en paramètre.
    HashMap<String,LinkedList> table = tdsNode.getTable();
    int nbchlid = treeToConvert.getChildCount();
    String nodename = treeToConvert.getText();
    LinkedList infos = null;
    String varname = null;
    String type = null;
    String instruction = null;
    CommonTree subtree = null;

    switch (nodename) {

      case "VARDEC":

        varname = treeToConvert.getChild(0).getText();
        type = treeToConvert.getChild(1).getText();

        // Les string seront déclarées à l'affectation ou lors d'un READ. (OK puisque controle sem passé avant)
        if (type.equals("INT")) {
          instruction = varname + " RSW 1";
        }
        else if (type.equals("NEW")) {
          // A FAIRE
        }

        printWriter.print(instruction);
        break;

      case "AFFECT":

        varname = treeToConvert.getChild(0).getText();
        infos = table.get(varname);
        type = infos.getFirst().toString();
        subtree = (CommonTree) treeToConvert.getChild(1);

        if (type.equals("INT")){
          if (subtree.getChildCount() == 0) {
            instruction = tab + "LDW R0, #" + subtree.getText() + nline + "STW R0, @" + varname;
          }
          else { // Cas d'une opération arithmétique ou logique : résultat stocké dans R1 par calculatorInstr()
            instruction = tab + calculatorInstr((CommonTree) subtree) + nline + "STW R1, @" +varname;
          }
        }
        else if (type.equals("STRING")) {
          instruction = varname + " STRING " + subtree.getText();
        }
        else { // Cas d'un type classe
          //A FAIRE
        }

        printWriter.print(instruction);
        break;

      case "WRITE":
        break;

      case "READ":
        break;

      case "FOR":
        // METTRE UNE CONDITION SUR LES BORNES, SI BORNE INF > BORNE SUP ON JUMP DIRECTEMENT A LA SUITE SANS RENTRER DASN LA BOUCLE
        break;

      default:
        if (nbchlid==0) break; // Condition d'arrêt de la récursion
        // Exploration plus profonde
        for (int k=0; k<=nbchlid-1; k++) {
          exploreAndGen((CommonTree) treeToConvert.getChild(k), tdsNode);
        }
        break;
    }
    return;
  }


  /*
   * Convertit des instructions arithmétiques ou logiques en instructions assembleur.
   * Par défaut, range le résultat dans R1
   */
  public String calculatorInstr(CommonTree treeCalc) {

    String treename = treeCalc.getText();
    String instruction = "";
    String memberA = "";
    String memberB = "";
    int member1;
    int member2;
    int nboperand = treeCalc.getChildCount();

    // Condition d'arrêt de la récursion (feuille)
    if (nboperand == 0) {
      return treename;
    }

    // Opérations unaires
    else if (nboperand == 1) {

      switch (treename) {
        case "-":
          memberA = calculatorInstr((CommonTree) treeCalc.getChild(0));
          try {
            Integer.parseInt(memberA);
            instruction = "LDW R1, #" + memberA;
          }
          catch (Exception e) {
            instruction = "LDW R1, @" + memberA;
          }
          instruction = instruction + nline;
          instruction = instruction + tab + "NEG R1, R1";
          break;
        default:
          System.out.println("Pas de tel opérateur : " + treename);
          break;
      }

      return instruction;
    }

    // Opérations binaires
    else if (nboperand == 2) {

      switch (treename) {
        case "+":
          memberA = calculatorInstr((CommonTree) treeCalc.getChild(0));
          memberB = calculatorInstr((CommonTree) treeCalc.getChild(1));

          // Cas d'un int pur
          try {
            member1 = Integer.parseInt(treeCalc.getText());
            //memberA = member1.toString();
            memberA = "LDW R1, #" + memberA;
            return memberA;
          }
          // Cas d'une variable nommée
          catch (Exception e) {
            memberA = "LDW R1, #" + treename;
            return memberA;
          }

          //break;
        case "-":
          break;
        case "*":
          break;
        default:
          System.out.println("Pas de tel opérateur : " + treename);
          break;
      }


    }

    return "";

  }


  /*
   * Convertit une chaine de caractère en son image hexadécimale
   */
  public String toHexString(String sample) {

    int c = 0; // Equivalent à un char
    char s = ' '; // Séparateur
    StringBuffer buff = new StringBuffer(sample.length());

    for (int k = 0; k < sample.length(); k++) {
      c = sample.charAt(k);
      buff.append(Integer.toHexString(c));
    }
    return buff.toString();
  }


  /*
   * Convertit un int en son image hexadécimale (sous format string)
   * Taille maximale : 65535
   */
  public String toHexString(int sample) {

    String result;
    result = Integer.toHexString(sample);
    result = "0x" + result;

    return result;
  }

}

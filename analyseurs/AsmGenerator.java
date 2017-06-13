import org.antlr.runtime.tree.*;
import java.util.LinkedList;
import java.util.ArrayList;
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
  private HashMap<String,Integer> offsetIntegers = new HashMap<String,Integer>();
  private int currentOffset;
  private int nbStringCste;
  private int nbRead;


  public AsmGenerator(CommonTree ast, NodeTDS tds) {
    this.ast = ast;
    this.tds = tds;
    tab = "\t";
    nline = "\n";
    optiond = false;

    currentOffset = 0;
    nbStringCste = 0;
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
   * Retourne le nom complet du fichier source a sm
   */
  public String getPathname() {
    return asmname;
  }

  /*
   * Fermeture du fichier et des writer.
   */
  public void closeFile() throws IOException {

    // Ajout de l'exit 0 à la fin du fichier
    printWriter.print(tab + "LDW WR, #EXIT_EXC\n");
    printWriter.print(tab + "TRP WR\n");

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
    String exit = "EXIT_EXC EQU 64";
    String reads = "READ_EXC EQU 65";
    String writes = "WRITE_EXC EQU 66";
    String stackad = "STACK_ADRS EQU 0x1000"; // Base de pile
    String loadad = "LOAD_ADRS EQU 0xF000"; // Adresse de chargement de l'exécutable
    String nils = "NIL EQU 0"; // fin de liste, contenu initla de BP
    String sp = "SP EQU R15"; // Alias du stack pointer
    String wr = "WR EQU R14"; // Working register
    String bp = "BP EQU R13"; // Base pointer
    String org = "ORG LOAD_ADRS"; // Charge le programme d'assemblage à l'adresse 0x2000
    String definitions = "INT_SIZE EQU 2";  // Un entier fait 2 octets
    String start = "START main_"; // Lance le programme à l'adresse 0x2000
    String newline = "NEWLINE RSW 1\n" + tab + "LDW R3, #0x0a00\n" + tab + "STW R3, @NEWLINE"; // Le caractère de retour à la ligne est desormais stocké dans l'etiquette NEWLINE
    String ldwstack = "main_" + tab + "LDW SP, #STACK_ADRS"; // charge SP avec STACK_ADRS
    String ldnil = tab + "LDQ NIL, BP"; // charge BP avec NIL=0
    String spsave = "\tADQ -2, SP\n \tSTW BP, (SP)\n \tLDW BP, SP\n";

    printWriter.print(exit + nline);
    printWriter.print(reads + nline);
    printWriter.print(writes + nline);
    printWriter.print(loadad + nline);
    printWriter.print(nils + nline);
    printWriter.print(stackad + nline + nline);
    printWriter.print(sp + nline);
    printWriter.print(wr + nline);
    printWriter.print(bp + nline);
    printWriter.print(definitions + nline + nline);
    printWriter.print(org + nline);
    printWriter.print(start + nline + nline);

    basicFunc();

    printWriter.print(ldwstack + nline);
    printWriter.print(ldnil + nline);
    printWriter.print("\tLDQ 0, R1\n");
    printWriter.print(spsave);
    printWriter.print("\tSUB SP, R1, SP\n\n");
    printWriter.print(newline + nline + nline);


    // Reste du progamme
    exploreAndGen(ast, tds);

  }

  /*
   * Ecrit les fonctions natives write et read par défaut (lib chargée par défaut)
   */
  public void basicFunc() {

    /*
     * Fonction WRITE
     */
     printWriter.print("write_\tLDQ 0, R1\n\tADQ -2, SP\n\tSTW BP, (SP)\n\tLDW BP, SP\n\tSUB SP, R1, SP\n\n"); // 0 : taille données locales
     printWriter.print("\tLDW R0, BP\n\tADQ 4, R0\n\tLDW R0, (R0)\n\n"); // Déplacement de 4 du paramètre
     printWriter.print("\tLDW WR, #WRITE_EXC\n\tTRP WR\n\n"); // print String
     printWriter.print("\tLDW R0, #NEWLINE\n\tLDW WR, #WRITE_EXC\n\tTRP WR\n\n"); // Print Carriage return
     printWriter.print("\tLDW SP, BP\n\tLDW BP, (SP)\n\tADQ 2, SP\n\tLDW WR, (SP)\n\tADQ 2, SP\n\tJEA (WR)\n\n"); //Return

    /*
     * Fonction READ
     */
     printWriter.print("read_\tLDQ 0, R1\n\tADQ -2, SP\n\tSTW BP, (SP)\n\tLDW BP, SP\n\tSUB SP, R1, SP\n\n"); // 0 : taille données locales
     printWriter.print("\tLDW R0, BP\n\tADQ 4, R0\n\tLDW R0, (R0)\n\n");
     printWriter.print("\tLDW WR, #READ_EXC\n\tTRP WR\n\n");
     printWriter.print("\tLDW SP, BP\n\tLDW BP, (SP)\n\tADQ 2, SP\n\tLDW WR, (SP)\n\tADQ 2, SP\n\tJEA (WR)\n\n"); //Return
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
          //instruction = varname + " RSW 1\n";
          instruction = tab + "ADQ -INT_SIZE, SP\n";
          currentOffset -= 2;
          offsetIntegers.put(varname, new Integer(currentOffset));
        }
        else if (type.equals("NEW")) {
          // A FAIRE
        }

        if (instruction != null) {
          printWriter.print(instruction);
        }
        break;

      case "AFFECT":

        varname = treeToConvert.getChild(0).getText();
        infos = table.get(varname);
        type = infos.getFirst().toString();
        subtree = (CommonTree) treeToConvert.getChild(1);

        if (type.equals("INT")){
          if (subtree.getChildCount() == 0) {
            instruction = tab + "LDW R0, #" + subtree.getText() + nline + "STW R0, @" + varname + "\n";
          }
          else { // Cas d'une opération arithmétique ou logique : résultat stocké dans R1 par calculatorInstr()
            instruction = tab + calculatorInstr((CommonTree) subtree) + nline + "STW R1, @" + varname + "\n";
          }
        }
        else if (type.equals("STRING")) {
          instruction = varname + " STRING " + subtree.getText() + "\n";
        }
        else { // Cas d'un type classe
          //A FAIRE
        }

        if (instruction != null) {
          printWriter.print(instruction);
        }
        break;

      case "WRITE":
        CommonTree toBePrinted = (CommonTree) treeToConvert.getChild(0);
        String childNodeName = toBePrinted.getText();
        if (childNodeName.equals("STRING_AFF")) {
          childNodeName = ((CommonTree) toBePrinted.getChild(0)).getText();
        }
        if (childNodeName.charAt(0) == '\"') {
          instruction = "STRING" + nbStringCste + " string " + childNodeName + nline;
          instruction = instruction + "\tLDW R1, #STRING" + nbStringCste + nline + tab + "STW R1, -(SP)\n" + "\tJSR @write_\n\n";
          nbStringCste++;
          printWriter.print(instruction);
        }
        break;

      case "READ":
        // TODO : associer le READINTx à la variable read y;
        instruction = "READINT" + nbRead + " RSB 4" + nline; //Buff de 4 bytes
        instruction = instruction + "\tLDW R1, #READINT" + nbRead + nline + tab + "STW R1, -(SP)\n" + "\tJSR @read_\n\n";
        nbRead++;
        printWriter.print(instruction);
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

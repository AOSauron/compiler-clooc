import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import org.antlr.stringtemplate.*;
import java.io.InputStream;
import java.io.FileInputStream;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;

/*
 * Compilateur Clooc. Classe Main.
 * Analyse lexicalement, syntaxiquement puis sémantiquement un programme looc passé en paramètre.
 * Produit un AST au format png, et génére du code source assembleur microPIUP.
 * @author : Guillaume Garcia
 * Clooc - PCL 2017 - TELECOM Nancy
 */

public class Clooc {
    public static void main(String[] args) throws Exception {

        int nargs;
        int index;
        String opt;
        String purename;
        String purenamepng;
        File file;
        File loocfile = null;
        FileWriter fileWriter = null;
        PrintWriter printWriter = null;
        String path_table;
        String full_tree_simple;
        String filename = "";
        boolean AST = false;
        boolean analyse = false;
        boolean warnings = false;
        boolean src = false;
        boolean verbose = false;
        InputStream in = null;
        TreeParser tablor = null;
        CommonTree tree = null;

        nargs = args.length;
        index = -1;

        // Parse les options
        if (nargs == 0) {
          System.out.println("Clooc - Compilateur Looc - v1.5");
          System.out.println("");
          System.out.println("Usage : java -jar clooc.jar fichier     ->  Compilation classique, analyse et produit de l'assembleur exécutable microPIUP.");
          System.out.println("        java -jar clooc.jar -W fichier  ->  Affiche les warnings lors de la compilation.");
          System.out.println("        java -jar clooc.jar -v fichier  ->  Mode verbeux : Affiche la Table Des Symboles et autres messages lors de la compilation.");
          System.out.println("        java -jar clooc.jar -s fichier  ->  Compilation classique mais produit de l'assembleur source microPIUP/ASM.");
          System.out.println("        java -jar clooc.jar -a fichier  ->  Effectue seulement les analyses syntaxique et lexicale.");
          System.out.println("        java -jar clooc.jar -T fichier  ->  Effectue les analyses syntaxique et lexicale et produit l'AST sous format DOT puis PNG.");
          System.out.println("");
          System.out.println("Les options -W et -v peuvent être combinées : -Wv ou -vW .");
          System.out.println("");
          System.out.println("Auteurs : G.Garcia - G.Zambaux - L.Hinsberger - N.Dubois - @TNCY-2016\n");
          System.exit(1);
        }
        else if (nargs > 2) {
          System.out.println("Erreur : trop d'arguments.");
        }
        else if (nargs == 2) {
          opt = args[0];
          switch (opt) {
            case "-T":
              AST = true;
              break;
            case "-W":
              warnings = true;
              break;
            case "-a":
              analyse = true;
              break;
            case "-s":
              src = true;
              break;
            case "-v":
              verbose = true;
              break;
            case "-vW":
              verbose = true;
              warnings = true;
              break;
            case "-Wv":
              verbose = true;
              warnings = true;
              break;
            default:
              System.out.println("Erreur : option illégale.");
              System.exit(1);
          }
        }

        //Ouvre le fichier passé en paramètre
        try {
          if (AST || src || warnings || analyse || verbose) {
            filename = args[1];
            loocfile = new File(filename);
            in = new FileInputStream(new File(filename));
          }
          else {
            filename = args[0];
            loocfile = new File(filename);
            in = new FileInputStream(new File(filename));
          }
        }
        catch (FileNotFoundException fie) {
          if (filename.equals("-T") || filename.equals("-v") || filename.equals("-W") || filename.equals("-vW") || filename.equals("-Wv") || filename.equals("-a") || filename.equals("-s")) {
            System.out.println("Arguements attendus après options.");
          } else {
            System.out.println("Le fichier " + filename + " n'existe pas.");
          }
          System.exit(1);
        }

        //Création des analyseurs syntaxique et léxical
        ANTLRInputStream input = new ANTLRInputStream(in);
        LoocLexer lexer = new LoocLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        LoocParser parser = new LoocParser(tokens);

        if (analyse) {
          //Simple parsing du code : option -a
          parser.program();
          return;
        }
        else {
          // Sinon récupération de l'arbre brut + analyse lexicale et syntaxique
          if (verbose) System.out.println(" Etape 1 - Analyse lexicale et syntaxique. Génération de l'AST.");
          tree = (CommonTree) parser.program().getTree();
        }

        // Cette partie concerne donc tout sauf l'option -a
        if (AST) {
          // Ouverture du .dot : option -T
          try {
            purename = loocfile.getName();
            // Si le fichier a une extension on la tronque (on tronque la dernière extension.)
            if ((index = loocfile.getName().lastIndexOf(".")) != -1) {
              purename = loocfile.getName().substring(0, loocfile.getName().lastIndexOf("."));
            }
          }
          catch (NullPointerException e) {
            purename = "NoName";
          }
          System.out.println("Création de l'AST format DOT...");
          purenamepng = purename + ".ast.png";
          purename = purename + ".ast.dot";
          file = new File(purename);
          fileWriter = new FileWriter(file);
          printWriter = new PrintWriter(fileWriter);

          //Génération de l'arbre en DOT
          DOTTreeGenerator gen = new DOTTreeGenerator();
          StringTemplate st = gen.toDOT(tree);
          printWriter.print(st);
          fileWriter.flush();
          fileWriter.close();
          System.out.println("Fin de la construction. L'AST a été produit dans le fichier " + purename + " au format DOT.");
          Runtime runtime = Runtime.getRuntime();
          System.out.println("Exportation de l'arbre au format PNG ...");
          try {
            runtime.exec(new String[] {"dot", "-Tpng", purename, "-o", purenamepng, "&>", "/dev/null"});
          }
          catch (IOException e) {
            System.out.println("Le programme dot (graphviz) ne semble pas être installé. Lancez `sudo apt-get install graphviz` .");
            System.exit(1);
          }
          System.out.println("Affichage de l'arbre.");
          try {
            runtime.exec(new String[] {"eog", purenamepng, "&>", "/dev/null", "&"});
          }
          catch (IOException e) {
            System.out.println("Le programme eog (ImageViewer for Gnome) ne semble pas être installé. Lancez `sudo apt-get install eog` .");
            System.exit(1);
          }
          return;
        }

        //Création de la TDS/contrôles sémantiques.
        if (verbose) System.out.println(" Etape 2 - Analyse sémantique\n");
        tablor = new TreeParser(tree);
        tablor.init(warnings);

        //Affichage des TDS : option -v
        if (verbose) {
          tablor.prettyprintTDS();
        }

        if (verbose) System.out.println(" Etape 3 - Génération de code source ASM/microPIUP");
        //Génération de code en Assembleur microPIUP
        tablor.getAsmGen().openFile(loocfile);

        //Compilation du fichier source :
        if (!src) {
          if (verbose) System.out.println(" Etape 4 - Compilation du code source assmebleur en exécutable ASM/microPIUP");
        }
    }
}

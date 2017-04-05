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
        File asmfile = null;
        FileWriter fileWriter = null;
        PrintWriter printWriter = null;
        String asmfilename = "";
        String filename = "";
        String pathtoasm = "";
        boolean AST = false;
        boolean analyse = false;
        boolean warnings = false;
        boolean src = false;
        boolean verbose = false;
        boolean dir = false;
        InputStream in = null;
        TreeParser tablor = null;
        CommonTree tree = null;
        NodeTDS tds = null;
        AsmGenerator asmgen = null;

        nargs = args.length;
        index = -1;

        // Parse les options
        if (nargs == 0) {
          System.out.println("Clooc - Compilateur Looc - v1.5");
          System.out.println("");
          System.out.println("Usage : java -jar clooc.jar fichier               ->  Compilation classique, analyse et produit de l'assembleur exécutable microPIUP.");
          System.out.println("        java -jar clooc.jar -d fichier dest/dir/  ->  Compilation classique, le fichier assembleur est produit dans un dossier indiqué.");
          System.out.println("        java -jar clooc.jar -W fichier            ->  Affiche les warnings lors de la compilation.");
          System.out.println("        java -jar clooc.jar -v fichier            ->  Mode verbeux : Affiche la Table Des Symboles et autres lors de la compilation.");
          System.out.println("        java -jar clooc.jar -s fichier            ->  Compilation classique mais produit de l'assembleur source microPIUP/ASM.");
          System.out.println("        java -jar clooc.jar -a fichier            ->  Effectue seulement les analyses syntaxique et lexicale.");
          System.out.println("        java -jar clooc.jar -T fichier            ->  Effectue analyses syntaxique/lexicale et produit l'AST sous format DOT puis PNG.");
          System.out.println("");
          System.out.println("Les options -W, -v, -s et -d peuvent être combinées (d toujours à la fin).");
          System.out.println("");
          System.out.println("Auteurs : G.Garcia - G.Zambaux - L.Hinsberger - N.Dubois - @TNCY-2017\n");
          System.exit(1);
        }
        else if (nargs > 3) {
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
            case "-Wvs":
              verbose = true;
              warnings = true;
              src = true;
              break;
            case "-Wsv":
              verbose = true;
              warnings = true;
              src = true;
              break;
            case "-sWv":
              verbose = true;
              warnings = true;
              src = true;
              break;
            case "-svW":
              verbose = true;
              warnings = true;
              src = true;
              break;
            case "-vsW":
              verbose = true;
              warnings = true;
              src = true;
              break;
            case "-vWs":
              verbose = true;
              warnings = true;
              src = true;
              break;
            case "-vs":
              verbose = true;
              src = true;
              break;
            case "-sv":
              verbose = true;
              src = true;
              break;
            case "-sW":
              src = true;
              warnings = true;
              break;
            case "-Ws":
              src = true;
              warnings = true;
              break;
            default:
              System.out.println("Erreur : options illégales.");
              System.exit(1);
          }
        }
        else if (nargs == 3) {
          opt = args[0];
          switch (opt) {
            case "-d":
              dir = true;
              break;
            case "-Wd":
              warnings = true;
              dir = true;
              break;
            case "-vd":
              verbose = true;
              dir = true;
              break;
            case "-sd":
              dir = true;
              src = true;
              break;
            case "-Wvsd":
              verbose = true;
              warnings = true;
              src = true;
              dir = true;
              break;
            case "-Wsvd":
              verbose = true;
              warnings = true;
              src = true;
              dir = true;
              break;
            case "-sWvd":
              verbose = true;
              warnings = true;
              src = true;
              dir = true;
              break;
            case "-svWd":
              verbose = true;
              warnings = true;
              src = true;
              dir = true;
              break;
            case "-vsWd":
              verbose = true;
              warnings = true;
              src = true;
              dir = true;
              break;
            case "-vWsd":
              verbose = true;
              warnings = true;
              src = true;
              dir = true;
              break;
            case "-vsd":
              verbose = true;
              src = true;
              dir = true;
              break;
            case "-svd":
              verbose = true;
              src = true;
              dir = true;
              break;
            case "-sWd":
              src = true;
              warnings = true;
              dir = true;
              break;
            case "-Wsd":
              src = true;
              warnings = true;
              dir = true;
              break;
            case "-vWd":
              verbose = true;
              warnings = true;
              dir = true;
              break;
            case "-Wvd":
              verbose = true;
              warnings = true;
              dir = true;
              break;
            default:
              System.out.println("Erreur : options illégales, pour l'option -d il faut indiquer un dossier de destination");
              System.exit(1);
          }
        }

        //Ouvre le fichier passé en paramètre
        try {
          if (AST || src || warnings || analyse || verbose || dir) {
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

        // Vérifie le 3e argument si option -d
        if (dir) {
          try {
            pathtoasm = args[2];
            asmfile = new File(pathtoasm);
          }
          catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Arguements attendus attendus après option -d : dossier de destination.");
            System.exit(1);
          }
          if (!asmfile.exists() || !asmfile.isDirectory()) {
            System.out.println("Le dossier " + pathtoasm + " n'existe pas, ou alors il s'agit d'un fichier.");
            System.exit(1);
          }
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

          // Récupération de la sortie de l'analyse syntaxique/lexicale
          ByteArrayOutputStream baos = new ByteArrayOutputStream();
          PrintStream ps = new PrintStream(baos);
          PrintStream old =System.err;
          System.setErr(ps);
          tree = (CommonTree) parser.program().getTree();
          System.err.flush();
          System.setErr(old);
          String synlexerrors = baos.toString();

          // On print les erreurs récupérées si il y en a et on arrete le compilateur pour empecher la construction de l'AST/analyse semantique.
          if (synlexerrors.length() != 0) {
            System.err.println(synlexerrors);
            System.exit(1);
          }
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
            System.err.println("Le programme dot (graphviz) ne semble pas être installé. Lancez `sudo apt-get install graphviz` .");
            System.exit(1);
          }
          System.out.println("Affichage de l'arbre.");
          try {
            runtime.exec(new String[] {"eog", purenamepng, "&>", "/dev/null", "&"});
          }
          catch (IOException e) {
            System.err.println("Le programme eog (ImageViewer for Gnome) ne semble pas être installé. Lancez `sudo apt-get install eog` .");
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

        // Génération de code en Assembleur microPIUP si aucune erreur sémantique n'est détectée
        if (tablor.getNbError() == 0) { /*
          tds = tablor.getTDS();
          asmgen = new AsmGenerator(tree, tds);

          // Set du préfixe path
          if (dir) {
            asmgen.setOption(true);
            asmgen.setPath(pathtoasm);
          }

          // Ouverture du ficheir .asm
          asmgen.openFile(loocfile);

          // Génération de code
          asmgen.initGen();

          // Fermeture du fichier
          asmgen.closeFile(); */
        }
        else if (tablor.getNbError() > 0) {
          System.err.println(tablor.getNbError() + " erreurs dans le fichier " + filename + ".");
          System.exit(1);
        }

        //Compilation du fichier source :
        if (!src) {
          if (verbose) System.out.println(" Etape 4 - Compilation du code source assmebleur en exécutable ASM/microPIUP");
        }
    }
}

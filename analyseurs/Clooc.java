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

/*
 * Compilateur Clooc. Classe Main.
 * @author : Guillaume Garcia
 * Clooc - PCL 2017 - TELECOM Nancy
 */


public class Clooc {
    public static void main(String[] args) throws Exception {

        boolean AST=false;
        InputStream in;
        File file;
        FileWriter fileWriter;
        PrintWriter printWriter;
        String path_table;
        String full_tree_simple;

        //Flag pour construction AST
        if (args[0].equals("-T")) {
          AST=true;
        }

        //Ouvre le fichier passé en paramètre
        try {
          if (AST) {
            in = new FileInputStream(new File(args[1]));
            System.out.println("Construction de l'AST au format DOT ...");
          }
          else {
            in = new FileInputStream(new File(args[0]));
          }

          //Création des analyseurs syntaxique et léxical
          ANTLRInputStream input = new ANTLRInputStream(in);
          LoocLexer lexer = new LoocLexer(input);
          CommonTokenStream tokens = new CommonTokenStream(lexer);
          LoocParser parser = new LoocParser(tokens);

          if (AST) {
            //Récupération de l'arbre brut
            CommonTree tree = (CommonTree) parser.program().getTree();

            //Création de la TDS/contrôles sémantiques.
            TreeParser tablor = new TreeParser(tree);
            tablor.init();

            //Affichage des TDS
            tablor.prettyprint();

            //Génération de l'arbre en DOT
            DOTTreeGenerator gen = new DOTTreeGenerator();
            StringTemplate st = gen.toDOT(tree);
            file = new File(args[2]);
            fileWriter = new FileWriter(file);
            printWriter = new PrintWriter(fileWriter);
            printWriter.print(st);
            fileWriter.flush();
            fileWriter.close();
            System.out.println("Fin de la construction. L'AST a été produit dans le fichier " + args[2] + " au format DOT. Vous pouvez l'afficher avec graphviz (ZGRViewer est recommandé).");
          }
          else {
            //Simple parsing du code
            parser.program();
          }
        }
        catch (ArrayIndexOutOfBoundsException e) {
          System.out.println("Passez un fichier en paramètre / ou spécifiez un nom pour l'output de la construction de l'AST (usuellement <name>.dot)");
          return;
        }
        catch (IOException ex) {
          ex.printStackTrace();
        }
    }
}

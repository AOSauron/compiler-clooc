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

public class Clooc {
    public static void main(String[] args) throws Exception {

        //System.setOut(new PrintStream(new FileOutputStream("test.txt")));
        boolean AST=false;
        InputStream in;
        File file;
        FileWriter fileWriter;
        PrintWriter printWriter;
        PrintStream old;
        PrintStream ps;
        ByteArrayOutputStream baos;

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
            //System.out.println("Analyse du programme " + args[0] + " ...");
          }

          ANTLRInputStream input = new ANTLRInputStream(in);
          LoocLexer lexer = new LoocLexer(input);
          CommonTokenStream tokens = new CommonTokenStream(lexer);
          LoocParser parser = new LoocParser(tokens);

          if (AST) {
            CommonTree tree = (CommonTree) parser.program().getTree();
            DOTTreeGenerator gen = new DOTTreeGenerator();
            StringTemplate st = gen.toDOT(tree);
            //System.out.println(st);
            file = new File(args[2]);
            fileWriter = new FileWriter(file);
            printWriter = new PrintWriter(fileWriter);
            printWriter.print(st);
            fileWriter.flush();
            fileWriter.close();
            System.out.println("Fin de la construction. L'AST a été produit dans le fichier " + args[2] + " au format DOT. Vous pouvez l'afficher avec graphviz (ZGRViewer est recommandé).");
          }
          else {
            parser.program();
            //System.out.println("Fin de vérification. Si aucun message d'erreur, le programme est validé (looc).");
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

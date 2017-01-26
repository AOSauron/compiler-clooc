import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import org.antlr.stringtemplate.*;
import java.io.InputStream;
import java.io.FileInputStream;
import java.io.File;

public class Clooc {
    public static void main(String[] args) throws Exception {
        //Ouvre le fichier passé en paramètre
        try {
          InputStream in = new FileInputStream(new File(args[0]));
          ANTLRInputStream input = new ANTLRInputStream(in);
          LoocLexer lexer = new LoocLexer(input);
          CommonTokenStream tokens = new CommonTokenStream(lexer);
          LoocParser parser = new LoocParser(tokens);

          CommonTree tree = (CommonTree) parser.program().getTree();
          DOTTreeGenerator gen = new DOTTreeGenerator();
          StringTemplate st = gen.toDOT(tree);
          System.out.println(st);
          /*
          LoocParser.program_return result = parser.program();
          Tree t = (Tree) result.getTree();
          System.out.println(t.toStringTree());
        //  parser.program();*/
        }
        catch (ArrayIndexOutOfBoundsException e) {
          System.out.println("Passez un fichier en paremètre");
          return;
        }
    }
}

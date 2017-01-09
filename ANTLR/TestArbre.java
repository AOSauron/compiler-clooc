import org.antlr.runtime.*;

public class TestArbre {
    public static void main(String[] args) throws Exception {
        ANTLRInputStream input = new ANTLRInputStream(System.in);
        Arbre_ListeLexer lexer = new Arbre_ListeLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        Arbre_ListeParser parser = new Arbre_ListeParser(tokens);
        parser.prog();
    }
}

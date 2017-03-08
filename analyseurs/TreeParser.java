import org.antlr.runtime.tree.*;
import java.util.LinkedList;
import java.util.HashMap;

public class TreeParser {

  private CommonTree ast;
  private HashMap<String,LinkedList> table;

  public TreeParser(CommonTree ast) {
    this.ast=ast;
  }

  public void init() {
    System.out.println("Tree to parse : " + this.ast.toStringTree());
    table = new HashMap<String,LinkedList>();
    explorer(ast);
  }

  public void explorer(CommonTree tree) {

    int nbchlid = tree.getChildCount();
    System.out.println("TDS " + table.toString());

    // VARDEC
    if (tree.getText().equals("VARDEC")) {
      LinkedList infos = new LinkedList();
      infos.add(tree.getChild(1));
      infos.add(null);
      table.put(tree.getChild(0).getText(),infos);
      //System.out.println("TDS " + table.toString());
    }

    // AFFECT
    if (tree.getText().equals("AFFECT")) {
      LinkedList infos = table.get(tree.getChild(0).getText());
      Object value;
      if (infos.getFirst().equals("INT")) {
        value = Integer.parseInt(tree.getChild(1).getText());
      } else  {
        value = tree.getChild(1).getText();
      }
      infos.set(1, value);
      //System.out.println("AFFECT " + table.toString());
    }

    if (nbchlid==0) {
      //System.out.println("Fin de l'arbre : " + tree.getParent() +" = "+ tree.getText());
      return;
    }
    else {
      for (int k=0; k<=nbchlid-1; k++) {
        explorer((CommonTree) tree.getChild(k));
      }
    }
  }
}

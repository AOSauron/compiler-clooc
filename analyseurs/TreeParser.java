import org.antlr.runtime.tree.*;
import java.util.LinkedList;
import java.util.HashMap;

public class TreeParser {

  private CommonTree ast;
  private HashMap<String,LinkedList> table;

  public TreeParser(CommonTree ast) {
    this.ast=ast;
  }

  /*
   * Lance l'exploration de tout l'arbre !
   */
  public void init() {
    System.out.println("Tree to parse : " + this.ast.toStringTree());
    table = new HashMap<String,LinkedList>();
    explorer(ast);
  }

  /*
   * Explorateur récursif de sous-arbre. Effectue des contrôles sémantiques !
   */
  public void explorer(CommonTree tree) {

    int nbchlid = tree.getChildCount();
    System.out.println("TDS " + table.toString());

    // VARDEC
    if (tree.getText().equals("VARDEC")) {
      LinkedList infos = new LinkedList();
      infos.add(tree.getChild(1));
      infos.add(null);
      table.put(tree.getChild(0).getText(),infos);
    }

    // FOR
    if (tree.getText().equals("FOR")) {
      // On récupère les infos sur l'indice
      LinkedList index = table.get(tree.getChild(0).getText());

      // Récupère la valeur de l'indice avant FOR
      Object backup;
      try {
        backup = (int) index.get(1);
      }
      catch (NullPointerException ne) {
        backup = null;
      }

      // Calcul des bornes
      int min = calculator((CommonTree) tree.getChild(1));
      int max = calculator((CommonTree) tree.getChild(2));

      // Boucle FOR en elle-même
      for (int i = min ; i <= max ; i++) {
        index.set(1, i);
        explorer((CommonTree) tree.getChild(3));
      }

      // On reset la valeur de l'indice à celle d'avant la boucle
      index.set(1, backup);

      //On return pour éviter de reboucler sur les fils déjà parcourus...
      return;
    }

    // AFFECT
    if (tree.getText().equals("AFFECT")) {
      LinkedList infos = table.get(tree.getChild(0).getText());
      Object value;
      int nbchlidnode = tree.getChild(1).getChildCount();

      // Cas d'un int, on parse directement en int
      if (infos.getFirst().toString().equals("INT")) {
        if (nbchlidnode > 0) {
          //Cas d'une expression arithm/logique
          value = calculator((CommonTree) tree.getChild(1));
        } else {
          //Cas d'un int simple
          value = (int) Integer.parseInt(tree.getChild(1).getText());
        }
      }
      // Les autres cas, on parse en String.
      else  {
        value = tree.getChild(1).getText();
      }
      infos.set(1, value);
    }

    //Condition d'arrêt de la récursion
    if (nbchlid==0) {
      return;
    }
    else {
      for (int k=0; k<=nbchlid-1; k++) {
        explorer((CommonTree) tree.getChild(k));
      }
    }
  }

  /*
   * Calulette récursive du compilateur, résoud les expressions arithmétiques/logiques.
   */
  public int calculator(CommonTree expr) {
    int res;
    res = 0; // A virer plus tard !

    // Arrêt de la récursion : test d'abord si c'est un entier, ensuite s'il s'agit d'une variable de la TDS
    if (expr.getChildCount()==0) {
      try {
        res = Integer.parseInt(expr.getText());
        return res;
      }
      catch (Exception e) {
       LinkedList infos = table.get(expr.getText());
       res = (int) infos.get(1);
      }
    }

    //Cas de l'opérateur unaire -
    if (expr.getText().equals("-")) {
      res = - calculator((CommonTree) expr.getChild(0));
    }
    // Logique ==     :   1 = true; 0 = false
    if (expr.getText().equals("==")) {
      res =  (calculator((CommonTree) expr.getChild(0)) == calculator((CommonTree) expr.getChild(1))) ? 1 : 0 ;
    }
    // Logique >=     :   1 = true; 0 = false
    if (expr.getText().equals(">=")) {
      res =  (calculator((CommonTree) expr.getChild(0)) >= calculator((CommonTree) expr.getChild(1))) ? 1 : 0 ;
    }
    // Logique <=     :   1 = true; 0 = false
    if (expr.getText().equals("<=")) {
      res =  (calculator((CommonTree) expr.getChild(0)) <= calculator((CommonTree) expr.getChild(1))) ? 1 : 0 ;
    }
    // Logique >     :   1 = true; 0 = false
    if (expr.getText().equals(">")) {
      res =  (calculator((CommonTree) expr.getChild(0)) > calculator((CommonTree) expr.getChild(1))) ? 1 : 0 ;
    }
    // Logique <     :   1 = true; 0 = false
    if (expr.getText().equals("<")) {
      res =  (calculator((CommonTree) expr.getChild(0)) < calculator((CommonTree) expr.getChild(1))) ? 1 : 0 ;
    }
    // Logique !=     :   1 = true; 0 = false
    if (expr.getText().equals("!=")) {
      res =  (calculator((CommonTree) expr.getChild(0)) != calculator((CommonTree) expr.getChild(1))) ? 1 : 0 ;
    }
    //Arithmétique +
    if (expr.getText().equals("+")) {
      res =  (calculator((CommonTree) expr.getChild(0)) + calculator((CommonTree) expr.getChild(1)));
    }
    //Arithmétique -
    if (expr.getText().equals("-")) {
      res =  (calculator((CommonTree) expr.getChild(0)) - calculator((CommonTree) expr.getChild(1)));
    }
    //Arithmétique *
    if (expr.getText().equals("*")) {
      res =  (calculator((CommonTree) expr.getChild(0)) * calculator((CommonTree) expr.getChild(1)));
    }

    return res;
  }
}

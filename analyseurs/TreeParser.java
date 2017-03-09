import org.antlr.runtime.tree.*;
import java.util.LinkedList;
import java.util.HashMap;
import java.util.Iterator;

/*
 * Parseur d'AST : le parcours et crée les TDS nécessaires. Les remplit en conséquence.
 * @author : Guillaume Garcia
 * Pour Clooc - PCL 2017 - TELECOM Nancy
 */

public class TreeParser {

  private int countanoblock;
  private CommonTree ast;
  private HashMap<String,LinkedList> tableroot;

  public TreeParser(CommonTree ast) {
    this.ast=ast;
  }


  /*
   * Lance l'exploration de tout l'arbre !
   *
   */
  public void init() {
    System.out.println("Tree to parse : " + this.ast.toStringTree());
    System.out.println("");
    tableroot = new HashMap<String,LinkedList>();
    countanoblock = 0;
    explorer(ast, tableroot);
  }


  /*
   * Affiche dans la sortie standard toutes les TDS produites par init()
   *
   */
  public void printTDS() {
    prettyprint(tableroot, "root");
  }


  /*
   * Explorateur récursif de sous-arbre. Effectue des contrôles sémantiques !
   *
   */
  public void explorer(CommonTree tree, HashMap<String,LinkedList> table) {

    int nbchlid = tree.getChildCount();
    String node = tree.getText();

    System.out.println("TDS partielle :" + table.toString());

    /*
     * VARDEC
     */
    if (node.equals("VARDEC")) {
      LinkedList infos = new LinkedList();
      infos.add(tree.getChild(1));
      infos.add(null);
      table.put(tree.getChild(0).getText(),infos);
      return;
    }

    /*
     * FOR
     */
    if (node.equals("FOR")) {
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
      int min = calculator((CommonTree) tree.getChild(1), table);
      int max = calculator((CommonTree) tree.getChild(2), table);
      // Controle : vérifier que max >= min

      // Boucle FOR en elle-même
      for (int i = min ; i <= max ; i++) {
        index.set(1, i);
        explorer((CommonTree) tree.getChild(3), table);
      }

      // On reset la valeur de l'indice à celle d'avant la boucle
      index.set(1, backup);

      // On return pour éviter de reboucler sur les fils déjà parcourus...
      return;
    }

    /*
     * IF
     */
    if (node.equals("IF")) {
      // On récupère la valeur de retour du calcul logique de la condition
      int cond = calculator((CommonTree) tree.getChild(0), table);

      // On effectue le IF en lui-même
      if (cond > 0) {
        explorer((CommonTree) tree.getChild(1), table);
      }

      // On return pour éviter de reboucler sur les fils déjà parcourus...
      return;
    }

    /*
     * AFFECT
     */
    if (node.equals("AFFECT")) {
      LinkedList infos = table.get(tree.getChild(0).getText());
      Object value;
      int nbchlidnode = tree.getChild(1).getChildCount();

      // Cas d'un int, on parse directement en int
      if (infos.getFirst().toString().equals("INT")) {
        if (nbchlidnode > 0) {
          // Cas d'une expression arithm/logique
          value = calculator((CommonTree) tree.getChild(1), table);
        } else {
          // Cas d'un int simple
          value = (int) Integer.parseInt(tree.getChild(1).getText());
        }
      }
      // Les autres cas, on parse en String.
      else if (nbchlidnode > 0) { //Cas d'un New : Crée une TDS pour chaque new ?
        value = tree.getChild(1).getChild(0).getText();
      }
      else {
        value = tree.getChild(1).getText();
      }
      infos.set(1, value);

      // On break maintenant pour éviter des appels récursifs inutiles.
      return;
    }


    /*
     * CLASS
     */
    if (node.equals("CLASS")) {
      int nbchlidnode = tree.getChildCount();
      String classname = tree.getChild(0).getText();
      String classinher;
      CommonTree block;
      int nbchlidofblock;

      // Cas d'une classe de base
      if (nbchlidnode == 2) {
        block = (CommonTree) tree.getChild(1);
      }
      // Cas d'une classe qui hérite d'une autre
      else if (nbchlidnode == 3) {
        classinher = tree.getChild(1).getText();

        // CONTROLE SEMANTIQUE : UNE CLASSE NE PEUT PAS HERITER D'ELLE-MEME
        if (classinher.equals(classname)) {
          System.out.println("Erreur : une classe ne peut pas hériter d'elle-même. classe : " + classname);
          System.exit(0);
        }

        block = (CommonTree) tree.getChild(2);
      }
      else {
        System.out.println("Erreur dans l'AST ... class_decl : " + classname);
        block = null;
        System.exit(0);
      }

      nbchlidofblock = block.getChildCount();

      // Création d'une sous-TDS (nouvel espace de noms)
      LinkedList infos = new LinkedList();
      HashMap<String,LinkedList> soustable = new HashMap<String,LinkedList>();

      // Remplie la sous-TDS en explorant le corps de la classe
      if (nbchlidofblock > 0) {
        explorer((CommonTree) block, soustable);
      }

      // Ajouter la sous-TDS à la TDS parente
      infos.add("CLASS"); // Type d'entrée
      infos.add(soustable);
      table.put(classname,infos);
      return;
    }

    /*
     * METHODEC
     */
    if (node.equals("METHODDEC")) {
      int nbchlidnode = tree.getChildCount();
      String methodname = tree.getChild(0).getText();
      String type = "NULL";
      CommonTree methodargs;
      CommonTree block = null;
      int nbchlidofblock;
      LinkedList args = new LinkedList();

      // Cas d'une méthode sans argument et sans type de retour
      if (nbchlidnode == 2) {
        block = (CommonTree) tree.getChild(1);
        type = "void";
      }

      // Cas d'une méthode sans argument et avec type de retour
      if (nbchlidnode == 3 && !(tree.getChild(1).getText().equals("METHODARGS"))) {
        block = (CommonTree) tree.getChild(2);
        type = tree.getChild(1).getText();
      }

      // Cas d'une méthode avec argument et sans type de retour
      if (nbchlidnode == 3 && tree.getChild(1).getText().equals("METHODARGS")) {
        block = (CommonTree) tree.getChild(2);
        methodargs = (CommonTree) tree.getChild(1);
        type = "void";
        args = parsemethodargs((CommonTree) methodargs);
      }

      // Cas d'une méthode avec argument et avec type de retour
      if (nbchlidnode == 4) {
        block = (CommonTree) tree.getChild(3);
        methodargs = (CommonTree) tree.getChild(1);
        type = tree.getChild(2).getText();
        args = parsemethodargs((CommonTree) methodargs);
      }

      nbchlidofblock = block.getChildCount();

      // Création d'une sous-TDS (nouvel espace de noms)
      LinkedList infos = new LinkedList();
      HashMap<String,LinkedList> soustable = new HashMap<String,LinkedList>();

      // Remplie la sous-TDS en explorant le corps de la méthode
      if (nbchlidofblock > 0) {
        explorer((CommonTree) block, soustable);
      }

      // Ajouter la sous-TDS à la TDS parente
      infos.add("METHOD"); // Type d'objet
      infos.add(soustable); // Sous-TDS
      infos.add(args); // Arguements éventuels
      infos.add(type); // Type de retour
      table.put(methodname,infos);
      return;
    }

    /*
     * ANONYMOUSBLOCK
     */
    if (node.equals("ANONYMOUSBLOCK")) {
      countanoblock += 1;
      int nbchlidnode = tree.getChildCount();
      String anoname = "ANOBLOCK-" + countanoblock;

      // Création d'une sous-TDS (nouvel espace de noms)
      LinkedList infos = new LinkedList();
      HashMap<String,LinkedList> soustable = new HashMap<String,LinkedList>();

      // Remplie la sous-TDS en explorant le bloc anonyme
      if (nbchlidnode > 0) {
        for (int k=0; k<=nbchlidnode-1; k++) {
          explorer((CommonTree) tree.getChild(k), soustable);
        }
      }

      // Ajouter la sous-TDS à la TDS parente
      infos.add("ANOBLOCK"); // Type d'entrée
      infos.add(soustable);
      table.put(anoname,infos);
      return;
    }

    //Condition d'arrêt de la récursion + Parcours des autres noeuds
    if (nbchlid==0) {
      return;
    }
    else {
      for (int k=0; k<=nbchlid-1; k++) {
        explorer((CommonTree) tree.getChild(k), table);
      }
    }
  }


  /*
   * Calulette récursive du compilateur, résoud les expressions arithmétiques/logiques.
   *
   */
  public int calculator(CommonTree expr, HashMap<String,LinkedList> table) {
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
    if (expr.getText().equals("-") && expr.getChildCount() == 1) {
      res = - calculator((CommonTree) expr.getChild(0), table);
    }
    // Logique ==     :   1 = true; 0 = false
    if (expr.getText().equals("==")) {
      res =  (calculator((CommonTree) expr.getChild(0), table) == calculator((CommonTree) expr.getChild(1), table)) ? 1 : 0 ;
    }
    // Logique >=     :   1 = true; 0 = false
    if (expr.getText().equals(">=")) {
      res =  (calculator((CommonTree) expr.getChild(0), table) >= calculator((CommonTree) expr.getChild(1), table)) ? 1 : 0 ;
    }
    // Logique <=     :   1 = true; 0 = false
    if (expr.getText().equals("<=")) {
      res =  (calculator((CommonTree) expr.getChild(0), table) <= calculator((CommonTree) expr.getChild(1), table)) ? 1 : 0 ;
    }
    // Logique >     :   1 = true; 0 = false
    if (expr.getText().equals(">")) {
      res =  (calculator((CommonTree) expr.getChild(0), table) > calculator((CommonTree) expr.getChild(1), table)) ? 1 : 0 ;
    }
    // Logique <     :   1 = true; 0 = false
    if (expr.getText().equals("<")) {
      res =  (calculator((CommonTree) expr.getChild(0), table) < calculator((CommonTree) expr.getChild(1), table)) ? 1 : 0 ;
    }
    // Logique !=     :   1 = true; 0 = false
    if (expr.getText().equals("!=")) {
      res =  (calculator((CommonTree) expr.getChild(0), table) != calculator((CommonTree) expr.getChild(1), table)) ? 1 : 0 ;
    }
    //Arithmétique +
    if (expr.getText().equals("+")) {
      res =  (calculator((CommonTree) expr.getChild(0), table) + calculator((CommonTree) expr.getChild(1), table));
    }
    //Arithmétique - (différencié de l'opérateur unaire - en comptant les fils)
    if (expr.getText().equals("-") && expr.getChildCount() > 1) {
      res =  (calculator((CommonTree) expr.getChild(0), table) - calculator((CommonTree) expr.getChild(1), table));
    }
    //Arithmétique *
    if (expr.getText().equals("*")) {
      res =  (calculator((CommonTree) expr.getChild(0), table) * calculator((CommonTree) expr.getChild(1), table));
    }

    return res;
  }


  /*
   * Parse les sous-arbres METHODARGS et retourne une LinkedList d'arguements.
   *
   */
   public LinkedList parsemethodargs(CommonTree args) {
     LinkedList arglist = new LinkedList();
     int nbarg = args.getChildCount();
     String type;
     String idf;

     for (int i = 0 ; i <= nbarg-1 ; i++) {
       LinkedList argument = new LinkedList();
       idf = args.getChild(i).getChild(0).getText();
       type = args.getChild(i).getChild(1).getText();
       argument.add(idf);
       argument.add(type);
       arglist.add(argument);
     }

     return arglist;
   }


  /*
   * Pretty printer de TDS.
   *
   */
   public void prettyprint(HashMap<String,LinkedList> table, String name) {
     System.out.println("");
     System.out.println("============================ TDS : " + name + " ==============================");
     HashMap<String,HashMap<String,LinkedList>> listtds= new HashMap<String,HashMap<String,LinkedList>>();
     Iterator it = (Iterator) table.keySet().iterator();
     while (it.hasNext()) {
       String key = (String) it.next();
       LinkedList infos = table.get(key);
       String type = infos.get(0).toString();
       String valeur;
       if (infos.get(1) instanceof HashMap) {
         HashMap<String,LinkedList> soustable = (HashMap<String,LinkedList>) infos.get(1);
         if (type.equals("METHOD")) {
           String returntype = infos.get(3).toString();
           LinkedList args = (LinkedList) infos.get(2);
           System.out.println("Idf : " + key + " || Type : " + type + " || Type de retour : " + returntype + " || Arguments : " + args + " ||");
         } else System.out.println("Idf : " + key + " || Type : " + type + " ||");
         listtds.put(key, soustable);
       }
       else {
         try {
           valeur = infos.get(1).toString();
         }
         catch (NullPointerException ne) {
           valeur = "null";
         }
         System.out.println("Idf : " + key + " || Type : " + type + " || Valeur : " + valeur + " ||");
       }
     }
     System.out.println("======================================================================");
     System.out.println("");

     Iterator iter = (Iterator) listtds.keySet().iterator();
     while (iter.hasNext()) {
       String tdsname = (String) iter.next();
       HashMap<String,LinkedList> soustds = listtds.get(tdsname);
       prettyprint(soustds, tdsname);
     }
   }
}

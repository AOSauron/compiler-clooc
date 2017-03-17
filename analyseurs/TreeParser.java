import org.antlr.runtime.tree.*;
import java.util.LinkedList;
import java.util.List;
import java.util.HashMap;
import java.util.Iterator;

/*
 * Parseur d'AST : le parcours et crée les TDS nécessaires. Les remplit en conséquence.
 * Va générer également du code en assembleur, en faisant appel à un générateur ASM maison.
 * @author : Guillaume Garcia
 * Pour Clooc - PCL 2017 - TELECOM Nancy
 */

public class TreeParser {

  private int countanoblock;
  private int countfor;
  private int countif;
  private boolean warn;
  private CommonTree ast;
  private HashMap<String,LinkedList> tableroot;
  private NodeTDS root;
  private AsmGenerator asmgen;

  public TreeParser(CommonTree ast) {
    this.ast=ast;
    warn = false;
  }


  /*
   * Print la table du noeud passé en paramètre ainsi que celle des ses fils.
   *
   */
  public void init(boolean warnings) {

    warn = warnings;
    asmgen = new AsmGenerator();
    tableroot = new HashMap<String,LinkedList>();
    root = new NodeTDS(null);

    root.setId("root");
    root.setTable(tableroot);
    countanoblock = 0;

    explorer(ast, root);
  }


  /*
   * Lance le print de toutes les TDS
   *
   */
   public void prettyprintTDS() {
     System.out.println("");
     System.out.println(" **** Début de la Table Des Symboles **** ");
     System.out.println("");
     printTDS(root);
     System.out.println("");
     System.out.println(" **** Fin de la Table Des Symboles **** ");
     System.out.println("");
   }


  /*
   * Affiche dans la sortie standard toutes les TDS produites par init()
   *
   */
  public void printTDS(NodeTDS rootnode) {

    List<NodeTDS> children = rootnode.getChildren();
    NodeTDS child;
    int size;

    // Print la TDS
    rootnode.printNode();

    // On arrête la récursion sur les noeuds qui n'ont pas de fils.
    if (children.isEmpty()) {
      return;
    }

    // On parcours les fils.
    size = children.size();
    for (int i = 0; i < size; i++) {
      child = children.get(i);
      printTDS(child);
    }
  }


  /*
   * Retourne la TDS root
   *
   */
   public HashMap<String,LinkedList> getTable() {
     return tableroot;
   }


  /*
   * Retourne l'AsmGenerator du TreeParser.
   *
   */
  public AsmGenerator getAsmGen() {
    return asmgen;
  }


  /*
   * Explorateur récursif de sous-arbre. Effectue des contrôles sémantiques !
   *
   */
  public void explorer(CommonTree tree, NodeTDS node) {

    //Récupère la TDS du node passé en paramètre.
    HashMap<String,LinkedList> table = node.getTable();
    int nbchlid = tree.getChildCount();
    String nodename = tree.getText();

    /*
     * VARDEC
     */
    if (nodename.equals("VARDEC")) {

      LinkedList infos = new LinkedList();

      infos.add(tree.getChild(1));
      infos.add(null);

      table.put(tree.getChild(0).getText(),infos);

      return;

    }

    /*
     * FOR
     */

    if (nodename.equals("FOR")) {

      countfor++;
      String forname = "FOR-" +countfor;
      CommonTree min;
      CommonTree max;
      String index;

      index = tree.getChild(0).toString();
      min = (CommonTree) tree.getChild(1);
      max = (CommonTree) tree.getChild(2);

      // CONTROLE SEMTANTIQUE : La borne sup ne peut pas être inférieure (stricte) à la borne inf
      try {
        int mini = calculator((CommonTree) min, table);
        int maxi = calculator((CommonTree) max, table);
        if (maxi < mini) {
          System.out.println("Erreur : - Boucle For - Les bornes de l'indice " + index + " ne sont pas correctes" );
          System.exit(1);
        }
      }
      catch (NoSuchIdfException e) {
        // ALLER CHERCHER L'IDF DANS LES TDS PARENTES.
      }

      // Création d'une sous-TDS (nouvel espace de noms)
      LinkedList infos = new LinkedList();
      HashMap<String,LinkedList> soustable = new HashMap<String,LinkedList>();
      NodeTDS child = new NodeTDS(node);

      // Ajouter la sous-TDS à la TDS parente
      child.setId(forname);
      child.setTable(soustable);
      node.addChild(child);

      //Explore le block do
      explorer((CommonTree) tree.getChild(3), child);

      infos.add("FOR"); // Type d'entrée
      infos.add(index); // Condition (sous-arbre)
      infos.add(min); // Borne inf
      infos.add(max); //Borne sup

      table.put(forname, infos);

      return;
    }

    /*
     * IF & ELSE
     */
    if (nodename.equals("IF")) {

      countif++;
      String ifname = "IF-" + countif;
      String elsename = "ELSE-" + countif;
      int nbchlidnode = tree.getChildCount();
      CommonTree cond;

      //Récupère la condition dans un arbre.
      cond = (CommonTree) tree.getChild(0);

      // Création d'une sous-TDS (nouvel espace de noms)
      LinkedList infos = new LinkedList();
      HashMap<String,LinkedList> soustableif = new HashMap<String,LinkedList>();
      HashMap<String,LinkedList> soustableelse = new HashMap<String,LinkedList>();
      NodeTDS childthen = new NodeTDS(node);
      NodeTDS childelse = new NodeTDS(node);

      // Ajouter la sous-TDS à la TDS parente
      childthen.setId(ifname);
      childelse.setId(elsename);
      childthen.setTable(soustableif);
      childelse.setTable(soustableelse); // Vide si pas de else
      node.addChild(childthen);
      node.addChild(childelse);

      //Explore le block THEN
      explorer((CommonTree) tree.getChild(1), childthen);

      //On explore le block ELSE si il existe
      if (nbchlidnode == 3) {
        explorer((CommonTree) tree.getChild(3), childelse);
      }

      infos.add("IF"); // Type d'entrée
      infos.add(cond); // Condition (sous-arbre)

      table.put(ifname,infos);

      return;
    }

    /*
     * AFFECT
     */
    if (nodename.equals("AFFECT")) {

      Object value = null;
      LinkedList infos = null;
      int nbchlidnode = tree.getChild(1).getChildCount();

      // CONTROLE SEMANTIQUE : VERIFIE QU'UN IDF EXISTE BIEN POUR LUI FAIRE UN AFFECT
      try {
        infos = table.get(tree.getChild(0).getText());
      }
      catch (NullPointerException ne) {
        System.out.println("Erreur : référence indéfinie vers la variable " + tree.getChild(0));
        System.exit(1);
      }

      // Cas d'un int, on parse directement en int
      if (infos.getFirst().toString().equals("INT")) {
        // Cas d'une expression arithm/logique
        try {
          value = (int) calculator((CommonTree) tree.getChild(1), table);
        }
        // CONTROLE SEMANTIQUE : VERIFIE QU'UN IDF EXISTE BIEN DANS LE MEMBRE DE DROITE
        catch (NoSuchIdfException e) {
          System.out.println("Erreur : référence indéfinie vers la variable " + tree.getChild(0));
        }
        // Cas d'une variable abstraite qui sera définie à l'exécution
        catch (NullPointerException ne) {
          value = (CommonTree) tree.getChild(1);
        }
      }

      // Les autres cas, on parse en String.
      else if (nbchlidnode > 0) { // Cas d'un New : Crée une TDS pour chaque new ?
        value = (String) tree.getChild(1).getChild(0).getText();
      }
      else {
        value = (String) tree.getChild(1).getText();
      }

      infos.set(1, value);

      return;
    }


    /*
     * CLASS
     */
    if (nodename.equals("CLASS")) {

      int nbchlidnode = tree.getChildCount();
      String classname = tree.getChild(0).getText();
      String classinher = "";
      CommonTree block;
      int nbchlidofblock;

      // Création d'une sous-TDS (nouvel espace de noms)
      LinkedList infos = new LinkedList();
      HashMap<String,LinkedList> soustable = new HashMap<String,LinkedList>();
      NodeTDS child = new NodeTDS(node);

      // Cas d'une classe de base
      if (nbchlidnode == 2) {
        block = (CommonTree) tree.getChild(1);
      }

      // Cas d'une classe qui hérite d'une autre
      else if (nbchlidnode == 3) {

        // Récupère le nom de la classe mère, servira pour retrouver sa TDS via cet id plus bas
        classinher = tree.getChild(1).getText();  // Ceci est un IDENTIFICATEUR !

        // CONTROLE SEMANTIQUE : UNE CLASSE NE PEUT PAS HERITER D'ELLE-MEME
        if (classinher.equals(classname)) {
          System.out.println("Erreur : une classe ne peut pas heriter d'elle-même : " + classname + " inherit " + classname);
          System.exit(1);
        }

        // Récupérer la TDS de la classe mère (forcément dans les child de root, vu la grammaire, donc frère ce ce noeud, donc ici node=root)
        NodeTDS motherclass;

        // CONTROLE SEMTANTIQUE : VERIFIER QUE LA CLASSE PARENTE EXISTE
        try {
          // Récupération effective
          motherclass = node.getChild(classinher);

          // Ajoute comme parent la classe mère à ce nouveau noeud créé (linkage statique)
          child.addParent(motherclass);
        }
        catch (NoSuchIdfException e) {
          System.out.println("Erreur : référence indéfinie à la classe mère " + classinher + " dans la déclaration de la classe " + classname);
          System.exit(1);
        }

        // Récupère le bloc à traiter plus bas
        block = (CommonTree) tree.getChild(2);
      }
      else {
        System.out.println("Erreur dans l'AST ... class_decl : " + classname);
        block = null;
        System.exit(1);
      }

      nbchlidofblock = block.getChildCount();

      // Ajouter la sous-TDS à la TDS parente
      child.setId(classname);
      child.setTable(soustable);
      node.addChild(child);

      // Remplie la sous-TDS en explorant le corps de la classe s'il est non vide
      if (nbchlidofblock > 0) {
        explorer((CommonTree) block, child);
      }

      // CONTROLE SEMANTIQUE : On déclenche un warning si une classe vide est déclarée.
      else {
        if (warn) System.out.println("Warning : la classe " + classname + " est vide.");
      }

      infos.add("CLASS"); // Type d'entrée
      infos.add(classinher); // Vide si pas d'inherit

      table.put(classname,infos);

      return;
    }

    /*
     * METHODEC
     */
    if (nodename.equals("METHODDEC")) {

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
      else if (nbchlidnode == 3 && !(tree.getChild(1).getText().equals("METHODARGS"))) {
        block = (CommonTree) tree.getChild(2);
        type = tree.getChild(1).getText();
      }

      // Cas d'une méthode avec argument et sans type de retour
      else if (nbchlidnode == 3 && tree.getChild(1).getText().equals("METHODARGS")) {
        block = (CommonTree) tree.getChild(2);
        methodargs = (CommonTree) tree.getChild(1);
        type = "void";
        args = parsemethodargs((CommonTree) methodargs);
      }

      // Cas d'une méthode avec argument et avec type de retour
      else if (nbchlidnode == 4) {
        block = (CommonTree) tree.getChild(3);
        methodargs = (CommonTree) tree.getChild(1);
        type = tree.getChild(2).getText();
        args = parsemethodargs((CommonTree) methodargs);
      }

      nbchlidofblock = block.getChildCount();

      // Création d'une sous-TDS (nouvel espace de noms)
      LinkedList infos = new LinkedList();
      HashMap<String,LinkedList> soustable = new HashMap<String,LinkedList>();
      NodeTDS child = new NodeTDS(node);

      // Ajouter la sous-TDS à la TDS parente
      child.setId(methodname);
      child.setTable(soustable);
      node.addChild(child);

      // Remplie la sous-TDS en explorant le corps de la méthode
      if (nbchlidofblock > 0) {
        explorer((CommonTree) block, child);
      }

      infos.add("METHOD"); // Type d'objet
      infos.add(args); // Arguements éventuels
      infos.add(type); // Type de retour éventuel (void si vide)

      table.put(methodname,infos);

      return;
    }

    /*
     * ANONYMOUSBLOCK
     */
    if (nodename.equals("ANONYMOUSBLOCK")) {

      countanoblock++;
      int nbchlidnode = tree.getChildCount();
      String anoname = "ANOBLOCK-" + countanoblock;

      // Création d'une sous-TDS (nouvel espace de noms)
      LinkedList infos = new LinkedList();
      HashMap<String,LinkedList> soustable = new HashMap<String,LinkedList>();
      NodeTDS child = new NodeTDS(node);

      // Ajouter la sous-TDS à la TDS parente
      child.setId(anoname);
      child.setTable(soustable);
      node.addChild(child);

      // Remplie la sous-TDS en explorant le bloc anonyme
      if (nbchlidnode > 0) {
        for (int k=0; k<=nbchlidnode-1; k++) {
          explorer((CommonTree) tree.getChild(k), child);
        }
      }

      infos.add("ANOBLOCK"); // Type d'entrée

      table.put(anoname,infos);

      return;
    }

    //Condition d'arrêt de la récursion + Parcours des autres noeuds
    if (nbchlid==0) {
      return;
    }
    else {
      for (int k=0; k<=nbchlid-1; k++) {
        explorer((CommonTree) tree.getChild(k), node);
      }
    }
  }


  /*
   * Calulette récursive du compilateur, résoud les expressions arithmétiques/logiques.
   *
   */
  public int calculator(CommonTree expr, HashMap<String,LinkedList> table) throws NoSuchIdfException {
    int res;
    LinkedList infos;
    res = 0; // A virer plus tard !

    // Arrêt de la récursion : test d'abord si c'est un entier, ensuite s'il s'agit d'une variable de la TDS
    if (expr.getChildCount()==0) {
      try {
        res = Integer.parseInt(expr.getText());
        return res;
      }
      catch (Exception e) {
        try {
          infos = table.get(expr.getText());
        }
        // CONTROLE SEMANTIQUE : VERIFIER QU'UN IDF EXISTE DANS UN EXPRESSION CALCULATOIRE
        catch (NullPointerException ne) {
          System.out.println("Erreur : référence indéfinie vers la variable : " + expr.getText());
          throw new NoSuchIdfException("Cet IDF n'existe pas.");
        }
        // Récupère le contenu de la variable,
        try {
          res = (int) infos.get(1);
        }
        // CONTROLE SEMANTIQUE : Lance un Warning si le contenu de la variable est null.
        catch (NullPointerException nea) {
            if (warn) System.out.println("Warning : la variable " + expr.getText() + " peut ne pas avoir été initialisée.");
        }
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
   * Test si l'arbre exploré peut être parsé en int immédiatement.
   *
   */
   public Boolean isCalulableInt(CommonTree tocalc, HashMap<String,LinkedList> table) {
     int res = 0;

     if (tocalc.getChildCount()==0) {
       try {
         res = Integer.parseInt(tocalc.getText());
         return true;
       }
       catch (Exception e) {
         try {
           LinkedList infos = table.get(tocalc.getText());
           res = (int) infos.get(1);
           return true;
         }
         catch (NullPointerException ne) {
           return false;
         }
       }
     }
     else {
       try {
         res = calculator((CommonTree) tocalc, table);
         return true;
       }
       catch (NoSuchIdfException nidf) {
         return false;
       }
     }
   }
}

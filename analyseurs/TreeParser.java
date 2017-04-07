import org.antlr.runtime.tree.*;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Iterator;

/*
 * Parseur d'AST : le parcours et crée les TDS nécessaires. Les remplit en conséquence.
 * Effectue les contrôle sémantiques, génère les erreurs et warnings.
 * @author : Guillaume Garcia
 * Pour Clooc - PCL 2017 - TELECOM Nancy
 */

public class TreeParser implements ITreeParser {

  private int countanoblock;
  private int countfor;
  private int countif;
  private boolean warn;
  private CommonTree ast;
  private HashMap<String,LinkedList> tableroot;
  private NodeTDS root;
  private static int nbError;


  public TreeParser(CommonTree ast) {
    this.ast=ast;
    warn = false;
    nbError = 0;
  }


  /*
   * Print la table du noeud passé en paramètre ainsi que celle des ses fils.
   *
   */
  public void init(boolean warnings) {

    warn = warnings;
    tableroot = new HashMap<String,LinkedList>();
    root = new NodeTDS(null);

    root.setId("root");
    root.setTable(tableroot);
    countanoblock = 0;

    explorerspec(ast); // Parcours rapide pour quelques contrôles sémantiques
    explorer(ast, root); // Parcours lourd, construit TDS

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
   * Retourne le nombre d'erreurs sémantiques détectées
   *
   */
  public int getNbError() {
    return nbError;
  }


  /*
   * Retourne la TDS (à appeller après avoir effectuer un init())
   *
   */
  public NodeTDS getTDS() {
    return root;
  }


  /*
   * Explore l'arbre sur chaque noeud et effectue quelques contrôles sémantiques.
   *
   */
  public void explorerspec(CommonTree tree) {

    int nbchlid = tree.getChildCount();
    String nodename = tree.getText();

    /*
     * THIS
     */
    if (nodename.equals("THIS")) {

      try {
        searchParent((CommonTree) tree, "CLASS");
      }
      // CONTROLE SEMANTIQUE : Vérifie qu'un this n'est pas appelé en dehors d'une classe
      catch(NoSuchNodeException e) {
        System.err.println("ligne "  + tree.getLine() + " : Erreur : this n'est pas utilisé dans une classe. ");
        nbError++;
      }
    }

    /*
     * SUPER
     */
     if (nodename.equals("SUPER")) {

       CommonTree parent;

       try{
         parent = (CommonTree) searchParent((CommonTree) tree, "CLASS");
         // CONTROLE SEMANTIQUE : Vérifie qu'un super est appelé seulement dans des classes héritières.
         if (parent.getChildCount() == 2) {
           System.err.println("ligne "  + tree.getLine() + " : Erreur : super n'est pas appelé dans une classe fille. ");
           nbError++;
         }
       }
       // CONTROLE SEMANTIQUE : Vérifie qu'un super n'est pas appelé en dehors d'une classe
       catch(NoSuchNodeException e) {
         System.err.println("ligne "  + tree.getLine() + " : Erreur : super n'est pas utilisé dans une classe. ");
         nbError++;
       }
     }

    //Condition d'arrêt de la récursion + Parcours des autres noeuds
    if (nbchlid==0) {
      return;
    }
    else {
      for (int k=0; k<=nbchlid-1; k++) {
        explorerspec((CommonTree) tree.getChild(k));
      }
    }
  }

  /*
   * Explorateur récursif de sous-arbre. Effectue des contrôles sémantiques !
   * Range les données dans la TDS du node passé en paramètre.
   */
  public void explorer(CommonTree tree, NodeTDS node) {

    //Récupère la TDS du node passé en paramètre.
    HashMap<String,LinkedList> table = node.getTable();
    HashMap<String,LinkedList> tablefound = null;
    int nbchlid = tree.getChildCount();
    String nodename = tree.getText();
    NodeTDS nodefound = null;

    /*
     * VARDEC
     */
    if (nodename.equals("VARDEC")) {

      LinkedList infos = new LinkedList();
      //NodeTDS nodefound = null;
      String type = null;

      // CONTROLE SEMANTIQUE : Vérifie qu'une variable ne redéfinit pas un argument , une méthode ou une autre variable
      try {
        nodefound = findSymbol(node, tree.getChild(0).getText());
        tablefound = nodefound.getTable();
        type = ((CommonTree)tablefound.get(tree.getChild(0).getText()).get(0)).getText();
        if (!type.equals("CLASS")) {
          System.err.println("ligne "  + tree.getLine() + " : Erreur : Le nom de " + tree.getChild(0) + " redéfinit une méthode ou une variable. ");
          nbError++;
          return;
        }
      } catch(NoSuchIdfException e) {

      }

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
      String type;
      NodeTDS nodeindex = null;

      // BORNE INF
      min = (CommonTree) tree.getChild(1);
      try {
        type = calculator((CommonTree) min, node);
        // CONTROLE SEMANTIQUE : vérifier que le type de l'expression inf est bien un INT
        if (!type.equals("INT")) {
          System.err.println("ligne "  + tree.getLine() + " : Erreur : La borne inférieure de la boucle for n'est pas un entier. ");
          nbError++;
        }
      }
      // CONTROLE SEMANTIQUE : Idf non déclaré utilisé dans l'expression de la borne inf.
      catch (NoSuchIdfException e) {
        System.err.println("ligne "  + tree.getLine() + " : Erreur : La borne inférieure de la boucle for n'est pas déclarée. ");
        nbError++;
      }
      // CONTROLE SEMANTIQUE : Problème de concordance de type dans les expressions de la borne inf.
      catch (MismatchTypeException ex) {
        System.err.println("ligne "  + tree.getLine() + " : Erreur : Problème de concordance de type dans l'expression de la borne inférieure de la boucle for. ");
        nbError++;
      }

      // BORNE SUP
      max = (CommonTree) tree.getChild(2);
      try {
        type = calculator((CommonTree) max, node);
        // CONTROLE SEMANTIQUE : vérifier que le type de l'expression inf est bien un INT
        if (!type.equals("INT")) {
          System.err.println("ligne "  + tree.getLine() + " : Erreur : La borne supérieure de la boucle for n'est pas un entier. ");
          nbError++;
        }
      }
      // CONTROLE SEMANTIQUE : Idf non déclaré utilisé dans l'expression de la borne sup.
      catch (NoSuchIdfException e) {
        System.err.println("ligne "  + tree.getLine() + " : Erreur : La borne supérieure de la boucle for n'est pas déclarée. ");
        nbError++;
      }
      // CONTROLE SEMANTIQUE : Problème de concordance de type dans les expressions de la borne sup.
      catch (MismatchTypeException ex) {
        System.err.println("ligne "  + tree.getLine() + " : Erreur : Problème de concordance de type dans l'expression de la borne supérieure de la boucle for. ");
        nbError++;
      }

      // INDEX
      index = tree.getChild(0).toString();
      try {
        nodeindex = findSymbol(node, index);
      }

      // CONTROLE SEMANTIQUE : Vérifie que l'indice a été déclaré au préalable
      catch (NoSuchIdfException e) {
        System.err.println("ligne "  + tree.getLine() + " : Erreur : Référence indéfinie vers la variable " + index + " (indice de la boucle for).");
        nbError++;
        return; // On returne pour éviter les vérif ultérieures que demande le type de l'index
      }
      // CONTROLE SEMANTIQUE : Vérifie que l'index est un INT
      try {
        checkType(nodeindex, index, "INT");
      }
      catch (MismatchTypeException ex) {
        System.err.println("ligne "  + tree.getLine() + " : Erreur : L'indice " + index + " de la boucle for n'est pas un entier.");
        nbError++;
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
        explorer((CommonTree) tree.getChild(2), childelse);
      }

      // CONTROLE SEMANTIQUE : VERIFIE QU'IL N'Y A PAS DE VARIABLES NON DEFINIES DANS LA CONDITION ET QUE PAS DE MISMATCH DE TYPES
      String type = null;
      try {
        type = calculator(cond, node);
      } catch(MismatchTypeException e){ // Mismatch de type dans les expressions calc string*int
        System.err.println("ligne "  + tree.getLine() + " : Erreur : Problème de concordance de types dans l'expression calculatoire de la condition. ");
        nbError++;
        return;
      } catch(NoSuchIdfException f) { // Variable non déclarée
        System.err.println("ligne "  + tree.getLine() + " : Erreur : Une variable n'est pas définie dans la condition. ");
        nbError++;
        return;
      }
      // CONTROLE SEMANTIQUE : VERIFIE QUE LA CONDITION EST UN ENTIER OU NIL
      if (!type.equals("INT") && !type.equals("nil")) {
        System.err.println("ligne "  + tree.getLine() + " : Erreur : Une variable n'est ni un eniter ni nil. ");
        nbError++;
        return;
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

      NodeTDS nodeleft = null;
      CommonTree memberleft = (CommonTree) tree.getChild(0);
      CommonTree memberright = (CommonTree) tree.getChild(1);
      String memberleftname = memberleft.getText();
      String typeleft = null;
      boolean isDeclared = true;

      // CONTROLE SÉMANTIQUE : VERIFIE QU'UN IDF EXISTE BIEN POUR LUI FAIRE UN AFFECT (GAUCHE)
      try {
        nodeleft = findSymbol(node, memberleftname);
        typeleft = ((CommonTree)((LinkedList)nodeleft.getTable().get(memberleftname)).get(0)).getText();
      }
      catch (NoSuchIdfException ne) {
        System.err.println("ligne "  + tree.getLine() + " : Erreur : référence indéfinie vers la variable " + memberleftname);
        nbError++;
        isDeclared = false;
      }

      // CONTROLE SÉMANTIQUE : VERIFIE L'EXPRESSION DE DROITE (DROITE)
      String typeright = null;
      try {
        typeright = calculator(memberright, node);
      } catch(MismatchTypeException e) {
        System.err.println("ligne "  + tree.getLine() + " : Erreur : problème de cohérence dans l'expression calculatoire du membre droit de l'affectation.");
        nbError++;
      } catch(NoSuchIdfException f) {
        System.err.println("ligne "  + tree.getLine() + " : Erreur : Une variable dans l'expression du membre droit de l'affectation n'est pas déclarée.");
        nbError++;
      }
      /*if (isDeclared) {
        // CONTROLE SEMANTIQUE : VERIFIE LA COHÉRENCE DES TYPES DANS L'AFFECTATION
        if (!typeleft.equals(typeright)) {
          System.err.println("ligne "  + tree.getLine() + " : Erreur : les types des membres de l'affectation sont incohérents.");
          nbError++;
        }
      }*/

      // On regarde s'il y a des appels de méthodes dans l'affectation, et si oui, on explore
      for (int i=0; i<tree.getChildCount(); i++) {
        if (tree.getChild(i).getText().equals("METHODCALLING")) {
          NodeTDS childmethcall = new NodeTDS(node);
          HashMap<String,LinkedList> soustablemethcall = new HashMap<String,LinkedList>();

          // Ajouter la sous-TDS à la TDS parente
          childmethcall.setId(tree.getChild(i).getChild(0).getText());
          childmethcall.setTable(soustablemethcall);
          node.addChild(childmethcall);

          //Explore le block
          explorer((CommonTree) tree.getChild(i), childmethcall);
        }
      }
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

      // CONTROLE SÉMANTIQUE : VÉRIFIE QUE LA CLASSE CONSIDÉRÉE N'EST PAS DÉJÀ DÉFINIE
      try {
        root.getChild(classname);
        System.err.println("ligne "  + tree.getLine() + " : Erreur : redéfinition de la classe " + classname);
        nbError++;
        // On ne parcourt pas la classe si elle est déjà définie
        return;
      } catch (NoSuchIdfException e) {
        // Rien on continue
      }

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

        // CONTROLE SÉMANTIQUE : UNE CLASSE NE PEUT PAS HERITER D'ELLE-MEME
        if (classinher.equals(classname)) {
          System.err.println("ligne "  + tree.getLine() + " : Erreur : une classe ne peut pas heriter d'elle-même : " + classname + " inherit " + classname);
          nbError++;
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
          System.err.println("ligne "  + tree.getLine() + " : Erreur : référence indéfinie à la classe mère " + classinher + " dans la déclaration de la classe " + classname);
          nbError++;
        }

        // Récupère le bloc à traiter plus bas
        block = (CommonTree) tree.getChild(2);
      }
      else {
        System.err.println("Erreur dans l'AST ... class_decl : " + classname);
        block = null;
        System.exit(1);
      }

      nbchlidofblock = block.getChildCount();

      // Ajouter la sous-TDS à la TDS parente
      child.setId(classname);
      child.setTable(soustable);
      node.addChild(child);

      // AJOUT PREALABLE POUR LES NEW CLASS INTERNES
      infos.add("CLASS"); // Type d'entrée
      infos.add(classinher); // Vide si pas d'inherit
      table.put(classname,infos);

      // Remplie la sous-TDS en explorant le corps de la classe s'il est non vide
      if (nbchlidofblock > 0) {
        explorer((CommonTree) block, child);
      }

      // CONTROLE SÉMANTIQUE : On déclenche un warning si une classe vide est déclarée.
      else {
        if (warn) System.out.println("ligne " + tree.getLine() + " : Warning : la classe " + classname + " est vide.");
      }

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
      NodeTDS nodeFound = null;

      // CONTROLE SEMANTIQUE : VERIFIE QUE LE NOM DE LA METHODE N'EST PAS UTILISÉ POUR UNE AUTRE METHODE, UN ARGUMENT OU UNE VARIABLE
      try{
        nodefound = findSymbol(node, methodname);
        tablefound = nodefound.getTable();
        tablefound.get(tree.getChild(0));
        System.err.println("ligne "  + tree.getLine() + " : Erreur : Le nom de méthode " + tree.getChild(0).getText() + " redéfinit un symbole ");
        nbError++;
      } catch (NoSuchIdfException e){
        // On continue
      }

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

        // CONTROLE SEMANTIQUE : VERIFIE QUE DANS MÉTHODE DEUX ARGUMENTS N'ONT PAS MÊME NOM
        for (int i = 0 ; i<args.size(); i++) {
          for (int j = i+1; j<args.size(); j++) {
            if (((String)((LinkedList)args.get(i)).get(0)).equals((String)((LinkedList)args.get(j)).get(0))) {
              System.err.println("ligne "  + tree.getLine() + " : Erreur : Deux arguments ont le même nom dans la méthode " + methodname +".");
              nbError++;
            }
          }
        }

        // CONTROLE SEMANTIQUE : VERIFIE QU'UN ARGUMENT N'A PAS LE NOM QUE LA MÉTHODE
        for (int i =0; i>args.size(); i++) {
          if (((String)((LinkedList)args.get(i)).get(0)).equals(methodname)){
            System.err.println("ligne "  + tree.getLine() + " : Erreur : Un argument de la méthode " + methodname + " a le même nom que la méthode.");
            nbError++;
          }
        }

      }

      // Cas d'une méthode avec argument et avec type de retour
      else if (nbchlidnode == 4) {
        block = (CommonTree) tree.getChild(3);
        methodargs = (CommonTree) tree.getChild(1);
        type = tree.getChild(2).getText();
        args = parsemethodargs((CommonTree) methodargs);
        String arg = null;

        // CONTROLE SEMANTIQUE : VERIFIE QUE DANS MÉTHODE DEUX ARGUMENTS N'ONT PAS MÊME NOM
        for (int i = 0 ; i<args.size(); i++) {
          for (int j = i+1; j<args.size(); j++) {
            if (((String)((LinkedList)args.get(i)).get(0)).equals((String)((LinkedList)args.get(j)).get(0))) {
              System.err.println("ligne "  + tree.getLine() + " : Erreur : Deux arguments ont le même nom dans la méthode " + methodname +".");
              nbError++;
            }
          }
        }

        // CONTROLE SEMANTIQUE : VERIFIE QU'UN ARGUMENT N'A PAS LE NOM DE LA MÉTHODE
        for (int i =0; i>args.size(); i++) {
          if (((String)((LinkedList)args.get(i)).get(0)).equals(methodname)) {
            System.err.println("ligne "  + tree.getLine() + " : Erreur : Un argument de la méthode " + methodname + " a le même nom que la méthode.");
            nbError++;
          }
        }

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
      // CONTROLE SEMANTIQUE : VERIFIE SI METHODE N'EST PAS VIDE
      else {
        if (warn) System.out.println("ligne " + tree.getLine() + " : Warning : La méthode " + methodname + " est vide.");
      }

      infos.add("METHOD"); // Type d'objet
      infos.add(args); // Arguements éventuels
      infos.add(type); // Type de retour éventuel (void si vide)

      table.put(methodname,infos);

      if (!(type.equals("void"))) {
        // CONTROLE SÉMANTIQUE : PLACEMENT DU RETURN DANS UNE METHODE TYPÉE
        if (!(find(block, "RETURN", 0))) {
          System.err.println("ligne "  + tree.getLine() + " : Erreur : il est possible que la méthode " + methodname + " ne retourne rien.");
          nbError++;
        }

        // CONTROLE SÉMANTIQUE : COHÉRENCE DES TYPES POUR UNE MÉTHODE

      } else {
        // CONTROLE SÉMANTIQUE : ABSENCE DE VALEUR RENVOYÉE POUR UNE MÉTHODE DE TYPE VOID
        try {
          CommonTree returnTree = searchChild(block, "RETURN");
          if (returnTree.getChildCount() > 0) {
            System.err.println("ligne "  + tree.getLine() + " : Erreur : La méthode " + methodname + " est de type void, elle n'est pas censée retourner quoique ce soit.");
            nbError++;
          }
        } catch (NoSuchNodeException e) {
          // Cas où la méthode de tupe void ne retourne rien
        }
      }

      return;
    }

    /*
     * METHODCALLING
     */
    if (nodename.equals("METHODCALLING")) {
      String methodname = tree.getChild(0).getText();
      int argumentnumber;
      if (tree.getChildCount() > 1) {
        argumentnumber = tree.getChild(1).getChildCount();
      } else {
        argumentnumber = 0;
      }

      // CONTROLE SÉMANTIQUE : VÉRIFIE QU'UNE MÉTHODE EST DÉFINIE DANS LA CLASSE DE L'APPELLANT
      try {
        String methodClass = findType((CommonTree) tree.getChild(0), node);
      } catch (NoSuchIdfException e) {
        System.err.println("ligne "  + tree.getLine() + " : Erreur : La méthode " + methodname + " n'est pas définie.");
        nbError++;
        return;
      }

      LinkedList<CommonTree> givenArguments = new LinkedList<CommonTree>(); //methodNode.getTable().get(methodname);

      for (int i=0; i<tree.getChildCount(); i++) {
        if (tree.getChild(i).getText().equals("METHODARGS")) {
          for (int j=0; j<tree.getChild(i).getChildCount(); j++) {
            givenArguments.add((CommonTree) tree.getChild(i).getChild(j));
          }
          break;
        }
      }

      CommonTree parent = (CommonTree) tree.getParent();
      String type = "";
      if (parent.getText().equals("METHODCALLING")) {
        try {
          type = findType((CommonTree) parent.getChild(0), node);
        } catch (NoSuchIdfException e) {
        }
      } else if (parent.getText().equals("DO")) {
        LinkedList infos = tableroot.get(parent.getChild(0).getText());
        type = infos.get(0).toString();
      } else if (parent.getText().equals("AFFECT")) {
        LinkedList infos = tableroot.get(parent.getChild(1).getText());
        type = infos.get(0).toString();
      } else if (parent.getText().equals("THIS")) {
        try {
          CommonTree classTree = searchParent(tree, "CLASS");
          type = classTree.getChild(0).getText();
        } catch (NoSuchNodeException e) {
          // Normalement, on a déjà vérifié que le this était bien dans une classe
        }
      } else if (parent.getText().equals("SUPER")) {
        try {
          CommonTree classTree = searchParent(tree, "CLASS");
          type = classTree.getChild(0).getText();
        } catch (NoSuchNodeException e) {
          // Normalement, on a déjà vérifié que le this était bien dans une classe
        }
      }

      HashMap<String,LinkedList> classTable = null;
      LinkedList requiredargs = null;
      int requiredargnum = 0;
      try {
        classTable = root.getChild(type).getTable();
        requiredargs = (LinkedList) classTable.get(tree.getChild(0).getText()).get(1);
        requiredargnum = requiredargs.size();
      } catch (NoSuchIdfException e) {
      }

      if (givenArguments.size() != requiredargnum) {
        // CONTROLE SÉMANTIQUE : VÉRIFIE LE NOMBRE D'ARGUMENTS D'UNE MÉTHODE
        System.err.println("ligne "  + tree.getLine() + " : Erreur : La méthode " + methodname + " prend " + requiredargnum + " arguments (" + givenArguments.size() + " donné(s)).");
        nbError++;
      }

      for (int i=0; i<tree.getChildCount(); i++) {
        if (tree.getChild(i).getText().equals("METHODCALLING")) {
          NodeTDS childmethcall = new NodeTDS(node);
          HashMap<String,LinkedList> soustablemethcall = new HashMap<String,LinkedList>();

          // Ajouter la sous-TDS à la TDS parente
          childmethcall.setId(methodname);
          childmethcall.setTable(soustablemethcall);
          node.addChild(childmethcall);

          //Explore le block
          explorer((CommonTree) tree.getChild(i), childmethcall);
        }
      }

      return;

    }

  /*
   * READ
   */
   // CONTROLE SEMANTIQUE : Vérifier le type des arguments de read
   if (nodename.equals("READ")) {
     String type = null;
     CommonTree readNb;
     readNb = (CommonTree) tree.getChild(0);
     try {
       type = calculator((CommonTree) readNb, node);
       if (!type.equals("INT")) {
         nbError++;
         System.err.println("ligne" + tree.getLine() + " : Erreur : L'argument de read n'est pas un entier.");
       }
     }
     catch(MismatchTypeException e) {
        System.err.println("ligne" + tree.getLine() + " : Erreur : Problème de concordance de type dans l'argument de read.");
        nbError++;
     }
     catch(NoSuchIdfException ne) {
       System.err.println("ligne" + tree.getLine() + " : Erreur : Une variable dans l'argument de read n'a pas été déclarée.");
       nbError++;
     }
     return;
   }

   /*
    * WRITE
    */
   // CONTROLE SEMANTIQUE : Vérifier le type des arguments de write
   if (nodename.equals("WRITE")) {
     String type = null;
      CommonTree writeValue;
      writeValue = (CommonTree) tree.getChild(0);
      try {
        type = calculator((CommonTree) writeValue, node);
        if (!type.equals("STRING") && !type.equals("INT")) {
          nbError++;
          System.err.println("ligne" + tree.getLine() + " : Erreur : L'argument de write n'est pas un entier ou une chaîne de caractères ");
        }
      }
      catch(MismatchTypeException e) {
        nbError++;
        System.err.println("ligne" + tree.getLine() + " : Erreur : Problème de concordance de type dans l'argument de write.");
      }
      catch(NoSuchIdfException ne) {
        nbError++;
        System.err.println("ligne" + tree.getLine() + " : Erreur : Une variable dans l'argument de write n'a pas été déclarée.");
      }
      return;
   }

   /*
    * RETURN
    */
   // CONTROLE SEMANTIQUE : Vérifie la cohérence des types sur un return
   /*if (nodename.equals("RETURN")) {
     String type;
      CommonTree returnExp;
      returnExp = (CommonTree) tree.getChild(0);
      CommonTree returnType;
      returnType = (CommonTree) tree.getParent();
      while (!returnType.getText().equals("METHODDEC")) {
        returnType = (CommonTree) returnType.getParent();
      }
      returnType = (CommonTree) returnType.getChild(1);
      try {
        type = calculator((CommonTree) returnExp, node);
        if(!type.equals(returnType.getText())) {
          nbError++;
          System.err.println("ligne" + tree.getLine() + " : Erreur : Le type de retour n'est pas celui de la méthode. ");
        }
      }
      catch(MismatchTypeException e) {
        nbError++;
        System.err.println("ligne" + tree.getLine() + " : Erreur : Problème de concordance de type dans l'expression du return. ");
      }
      catch(NoSuchIdfException ne) {
        nbError++;
        System.err.println("ligne" + tree.getLine() + " : Erreur : Une variable de l'expression de return n'a pas été déclarée.");
      }
      return;
    }*/

    //retour do

    /*if (nodename.equals("METHODCALLING")) {
      CommonTree metName;
      metName = (CommonTree) tree.getChild(0);
      metNameStr = metName.getText();
      NodeTDS methodNode = findSymbol(node,metNameStr);
      methodNode = (NodeTDS) methodNode.getParent();
      if(!methodNode.getChild(1).getText().equals("INT") && !methodNode.getChild(1).getText().equals("STRING") && !methodNode.getChild(2).getText().equals("INT") && !methodNode.getChild(2).getText().equals("STRING")) {
        if(!metName.getParent().getParent().getText().equals("DO")) {
          nbError++;
          System.err.println("methode sans type de retour pas appelée avec DO");
        }
      }
      */

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
      // CONTROLE SÉMANTIQUE : On déclenche un warning si une classe vide est déclarée.
      else {
        if (warn) System.out.println("ligne " + tree.getLine() + " : Warning : Le bloc anonyme est vide.");
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
   * Recherche un token dans un arbre et ses branches, selon divers modes.
   *
   */
  public boolean find(CommonTree block, String token, int mode) {
    int nbChildren = block.getChildCount();

    // Récupère les fils du noeud (arbre) courant
    for (int i=0; i<nbChildren;i++) {
      if (((CommonTree)block.getChild(i)).toString().equals(token)) {
        switch (mode) {
          case 0:
            return true;
          case 1:
            if (((CommonTree) block.getChild(0)).getChildCount() > 0) {
              return false;
            }
            break;
        }
      }
    }
    if (mode == 1) {
      return true;
    }

    // Parcours de ses fils
    for (int i=0; i<nbChildren;i++) {
      CommonTree child = (CommonTree) block.getChild(i);
      if ((token.equals("RETURN") && !(child.getText().equals("IF"))) || !(token.equals("RETURN"))) {
        return find((CommonTree) child, token, 1);
      }
    }

    return false;
  }


  /*
 * Retourne le type/la classe à laquelle appartient une méthode donnée par le noeud (qui correspond à METHODCALLING)
 */
public String findType(CommonTree tree, NodeTDS node) throws NoSuchIdfException {
  String className = "";
  CommonTree currentParent = (CommonTree) tree.getParent();
  List<CommonTree> parents = new ArrayList<CommonTree>();  // Liste des appels méthodes remontés

  // On remonte les appels méthodes jusqu'à tomber sur le premier appelant
  while (currentParent.getText().equals("METHODCALLING")) {
    parents.add(currentParent);
    currentParent = (CommonTree) currentParent.getParent();
  }

  String varName = "";
  if (currentParent.getText().equals("DO")) {
    varName = currentParent.getChild(0).getText();
    LinkedList infos = tableroot.get(varName);
    className = infos.get(0).toString();
  } else if (currentParent.getText().equals("AFFECT")) {
    varName = currentParent.getChild(1).getText();
    LinkedList infos = tableroot.get(varName);
    className = infos.get(0).toString();
  } else if (currentParent.getText().equals("THIS")) {
    try {
      CommonTree classTree = searchParent(tree, "CLASS");
      className = classTree.getChild(0).getText();
    } catch (NoSuchNodeException e) {
      // Normalement, on a déjà vérifié que le this était bien dans une classe
    }
  }
  // On redescent les appels méthodes en détermiant le type de l'objet obtenu à chaque fois
  try {
    for (int i=parents.size()-1; i>=0; i--) {
      className = findReturnType(className, parents.get(i).getChild(0).getText());
    }
  } catch (NoSuchIdfException e) {
    throw e;
  }
  return className;
}


  /*
   * Cherche une méthode dans une classe et renvoie son type de retour
   *
   */
  public String findReturnType(String className, String methodName) throws NoSuchIdfException {
    List<NodeTDS> rootChildren = root.getChildren();   // Liste des enfants de root
    //List<NodeTDS> classChildren;

    for (NodeTDS currentNode: rootChildren) {
      // On regarde si le noeud est le parent d'une classe
      if (currentNode.getId().equals(className)) {
        HashMap<String,LinkedList> classTable = currentNode.getTable();
        LinkedList method = classTable.get(methodName);
        if (method != null) {
          return method.get(2).toString();
        }
      }
    }

    throw new NoSuchIdfException(); // Cas où la méthode n'existe pas dans la classe demandée
  }

  /*
   * Check si le type du symbole passé en paramètre correspond au type voulu (typetocheck)
   *
   */
  public void checkType(NodeTDS node, String symbol, String typetocheck) throws MismatchTypeException {

    HashMap<String,LinkedList> table = node.getTable();
    LinkedList infos = null;
    String type = null;

    // Récup les infos
    infos = table.get(symbol);
    type = ((CommonTree)infos.get(0)).getText(); // Le type est toujours à cet emplacement normalement.

    // Verification :
    if (!type.equals(typetocheck)) {
      throw new MismatchTypeException();
    }
    else return;
  }

  /*
   * Cherche la définition d'un symbole (méthode, variable...). Retourne le noeud contenant la définition du symbole.
   * Lance une exception si aucune définition n'est trouvée.
   */
  public NodeTDS findSymbol(NodeTDS node, String symbolname) throws NoSuchIdfException {
    LinkedList infos = null;
    List<NodeTDS> parents = null;
    NodeTDS parent = null;

    // Cherche dans la TDS de ce niveau
    try {
      infos = node.getTable().get(symbolname);
      if (infos.isEmpty()) throw new NullPointerException(); // Si la liste est vide c'est qu'on a rien trouvé, on lance une NPE pour le catch d'après
    }
    catch (NullPointerException e) {
      try {
        parents = node.getParent();
        // On test dans chacun des parents : le premier parent ne sera pas la classe mère (c'est mieux, si jamais il y a surcharge ou redéfinition d'un symbole)
        for (NodeTDS n: parents) {
          try {
            parent = findSymbol(n, symbolname);
          }
          catch (NoSuchIdfException no) {
            // On laisse finir la boucle for
          }
        }
        // On lance la NSIE si aucun parent n'a été trouvé.
        if (parent != null) return parent;
        else throw new NoSuchIdfException();
      }
      // On arrive au root sans rien avoir trouvé, on throw une NPE
      catch (NullPointerException ne) {
        throw new NoSuchIdfException();
      }
    }
    // Si tout s'est bien passé on retoune le node
    return node;
  }


  /*
   * Parse les expressions arithmétiques et logiques, effectue les contrôles sémantiques sur les idf si présents.
   * Renvoie le type de l'expression (STRING, INT, OBJ), permettant le controle de type dans explorer()->AFFECT
   */
  public String calculator(CommonTree expr, NodeTDS node) throws MismatchTypeException, NoSuchIdfException {

    LinkedList infos;
    String nodename = expr.getText();
    String varname;
    String type = null;
    NodeTDS temp;
    HashMap<String,LinkedList> temptable;
    LinkedList tempinfo;

    /*
     * STRING_AFF
     */
    if (nodename.equals("STRING_AFF")) {
      type = "STRING";
      return type;
    }

    /*
     * NEW
     */
    if (nodename.equals("NEW")) {
      varname = expr.getChild(0).getText();

      // CONTROLE SEMANTIQUE : Verifie que la classe a été définie auparavant
      temptable = root.getTable();
      try {
        type = (String)((LinkedList)temptable.get(varname)).get(0);
        return type;
      }
      catch (NullPointerException ne) {
        throw new NoSuchIdfException();
      }

    }

    /*
     * THIS
     */
    if (nodename.equals("THIS")) {
      varname = expr.getChild(0).getChild(0);

      try {
        temp = findSymbol(node, varname);
        temptable = temp.getTable();
      }
      catch (NoSuchIdfException e) {
        throw new NoSuchIdfException();
      }

      return "";
    }

    /*
     * SUPER
     */
    if (nodename.equals("SUPER")) {
      varname = expr.getChild(0).getChild(0);

      try {
        temp = findSymbol(node, varname);
        temptable = temp.getTable();
      }
      catch (NoSuchIdfException e) {
        throw new NoSuchIdfException();
      }
      return "";
    }

    /*
     * INT_CSTE
     */
    try {
      Integer.parseInt(nodename);
      return "INT";
    } catch (Exception e) {
      /*
       * VAR
       */
      try  {
        temp = findSymbol(node, nodename);
      }
      catch (NoSuchIdfException e) {
        throw new NoSuchIdfException();
      }
      temptable = temp.getTable();
      try {
        type = ((CommonTree)((LinkedList)temptable.get(nodename)).get(0)).getText();
        return type;
      }
      catch (NullPointerException ne) {
        throw new NoSuchIdfException();
      }

    }

     //type = "INT";
  /*  if (nodename.equals("VAR")) {
      // CONTROLE SÉMANTIQUE : Vérifier que la variable a été déclarée.
      try {
        temp = findSymbol(node, varname);
      }
      catch (NoSuchIdfException e) {
        System.err.println("ligne "  + expr.getLine() + " : Erreur : référence indéfinie vers la variable " + varname);
        nbError++;
      }

      // Récupère les infos pour récupérer le type
      temptable = temp.getTable();
      tempinfo = temptable.get(varname);
      type = "";

    }*/

    //return type;
  }


  /*
   * Cherche un noeud dans les parents d'un arbre (AST)
   * Retourne le premier sous arbre dont le root est ce noeud
   */
  public CommonTree searchParent(CommonTree tree, String target) throws NoSuchNodeException {

    while (!tree.getParent().getText().equals(target)) {
      if (tree.getParent().getText().equals("PROGRAM")){
        throw new NoSuchNodeException();
      } else {
        tree = (CommonTree) tree.getParent();
      }
    }
    return (CommonTree) tree.getParent();

  }


  /*
   * Cherche un noeud dans les enfants d'un arbre (AST)
   * Retourne le premier sous arbre dont le root est ce noeud
   */
  public CommonTree searchChild(CommonTree tree, String target) throws NoSuchNodeException {

    CommonTree currentTree = tree;
    for (int i=0; i<tree.getChildCount(); i++) {

      for (int k=0; k<currentTree.getChildCount(); k++) {
        if (currentTree.getChild(k).getText().equals(target)) {
          return (CommonTree)currentTree.getChild(k);
        }
        for (int j=0; j<currentTree.getChild(k).getChildCount(); j++) {
          if (currentTree.getChild(k).getChild(j).getText().equals(target)) {
            return (CommonTree)currentTree.getChild(k).getChild(j);
          }
        }
      }
    }
    throw new NoSuchNodeException();

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
      /* try {
         //res = calculator((CommonTree) tocalc, table);
         return true;
       }
       catch (NoSuchIdfException nidf) {
         return false;
       }*/
       return true;
     }
   }
}

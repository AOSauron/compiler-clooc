import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.HashMap;

public class NodeTDS {

  private String id;
  private final List<NodeTDS> fils = new ArrayList<>();
  private final List<NodeTDS> parent = new ArrayList<>();
  private HashMap<String,LinkedList> table;

  public NodeTDS(NodeTDS parent) {
    this.parent.add(parent);
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public void setTable(HashMap<String,LinkedList> table) {
    this.table=table;
  }

  public HashMap<String,LinkedList> getTable() {
    return table;
  }

  public List<NodeTDS> getChildren() {
    return fils;
  }

  public List<NodeTDS> getParent() {
    return parent;
  }

  /*
   * Cherche le noeuds avec l'id ID et le renvoie
   */
   public NodeTDS getChild(String id) throws NoSuchIdfException {
     NodeTDS child;
     String idtocheck;
     List<NodeTDS> children;
     int size;

     // Vérifie que le noeud a des parents et récupère le nombre d'enfant
     try {
       children = this.getChildren();
       size = children.size();
     }
     catch (NullPointerException e) {
       throw new NoSuchIdfException();
     }

     for (int i = 0; i < size; i++) {
       child = children.get(i);
       idtocheck = child.getId();
       if (id.equals(idtocheck)) return child;
     }

     // Si le for n'a rien retourné c'est qu'il n'y a aucun fils correspondant à l'id fourni. Donc on throw une exception.
     throw new NoSuchIdfException();
   }

  /*
   * Ajoute un fils à ce noeud. (linkage statique simple)
   */
  public void addChild(NodeTDS fils) {
    this.fils.add(fils);
  }

  /*
   * Ajoute un parent à ce neoud (linkage dynamique? comme par ex un classe qui hérite d'une autre)
   */
   public void addParent(NodeTDS parent) {
     this.parent.add(parent);
   }

   /*
    * Retourne true si le noeud a un parent (minimum), false sinon (=root)
    */
    public Boolean hasParent(NodeTDS node) {
      try {
        node.getParent();
        return true;
      }
      catch (NullPointerException e) {
          return false;
      }
    }


  /*
   * Print le noeud courant ainsi que ses fils de façon récursive. Ne print pas les TDS vides
   */
   /*
  public void printTree() {
    System.out.println("");
    System.out.println("============================ TDS : " + id + " ==============================");
    Iterator it = (Iterator) table.keySet().iterator();

    while (it.hasNext()) {
      String key = (String) it.next();
      LinkedList infos = table.get(key);
      String type = infos.get(0).toString();
      String valeur;

      // Parsing selon le type
      if (type.equals("METHOD")) {
        String returntype = infos.get(3).toString();
        LinkedList args = (LinkedList) infos.get(2);
        System.out.println("Idf : " + key + " || Type : " + type + " || Type de retour : " + returntype + " || Arguments : " + args + " ||");
      } else if (type.equals("CLASS")) {
        String herit = infos.get(2).toString();
        System.out.println("Idf : " + key + " || Type : " + type + " || Herite de : " + herit + " ||");
      } else if (type.equals("IF")) {
        String keyelse = "ELSE-" + countif;
        String cond = ((CommonTree)infos.get(2)).toStringTree();
        listtds.put(keyelse, elsetable);
        System.out.println("Idf : " + key + " || Type : " + type + " || Condition : " + cond + " ||");
      } else if (type.equals("FOR")) {
        String index = (String) infos.get(2);
        String min = ((CommonTree)infos.get(3)).toStringTree();
        String max = ((CommonTree)infos.get(4)).toStringTree();
        System.out.println("Idf : " + key + " || Type : " + type + " || Index : " + index + " || Min : " + min + " || Max : " + max + " ||");
      } else {
        System.out.println("Idf : " + key + " || Type : " + type + " ||");
      }

      // Récup valeur
      try {
        valeur = infos.get(1).toString();
      }
      catch (NullPointerException ne) {
        valeur = "null";
      }
      System.out.println("Idf : " + key + " || Type : " + type + " || Valeur : " + valeur + " ||");
    }

    System.out.println("======================================================================");
    System.out.println("");

    Iterator iter = (Iterator) listtds.keySet().iterator();
    while (iter.hasNext()) {
      String tdsname = (String) iter.next();
      HashMap<String,LinkedList> soustds = listtds.get(tdsname);
      // On ne print que les TDS non vides
      if (!(soustds.isEmpty())) {
        prettyprint(soustds, tdsname);
      }
    }
  }*/
}

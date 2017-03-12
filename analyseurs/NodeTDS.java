import java.util.ArrayList;
import java.util.List;

public class NodeTDS {

  private String id;
  private final List<NodeTDS> fils = new ArrayList<>();
  private final NodeTDS parent;
  private HashMap<String,LinkedList> table;

  public NodeTDS(NodeTDS parent, HashMap<String,LinkedList> table) {
    this.parent = parent;
    this.table = table;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public List<NodeTDS> getChildren() {
    return fils;
  }

  public NodeTDS getParent() {
    return parent;
  }

  /*
   * Ajoute un fils à ce noeud.
   */
  public void addChild(NodeTDS fils) {
    this.fils.add(fils);
  }

  /*
   * Print le noeud courant ainsi que ses fils de façon récursive. Ne print pas les TDS vides
   */
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
  }
}

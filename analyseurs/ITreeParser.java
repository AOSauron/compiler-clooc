import org.antlr.runtime.tree.*;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Iterator;

/*
 * Interface du parseur d'AST. Regroupe les principales méthodes et leur description
 * Le parseur effectue les contrôle sémantiques, génère les erreurs et warnings.
 * @author : Guillaume Garcia
 * Pour Clooc - PCL 2017 - TELECOM Nancy
 */

 public interface ITreeParser {

   /*
    * Print la table du noeud passé en paramètre ainsi que celle des ses fils.
    */
   public void init(boolean warnings);

   /*
    * Lance le print de toutes les TDS
    */
   public void prettyprintTDS();

   /*
    * Affiche dans la sortie standard toutes les TDS produites par init()
    */
   public void printTDS(NodeTDS rootnode);

   /*
    * Retourne la TDS root
    */
   public HashMap<String,LinkedList> getTable();

   /*
    * Retourne le nombre d'erreurs sémantiques détectées
    */
   public int getNbError();

   /*
    * Retourne la TDS (à appeller après avoir effectuer un init())
    */
   public NodeTDS getTDS();

   /*
    * Explorateur récursif de sous-arbre. Effectue des contrôles sémantiques ! Explorateur lourd
    * Range les données dans la TDS du node passé en paramètre.
    */
   public void explorer(CommonTree tree, NodeTDS node);

   /*
    * Explore l'arbre sur chaque noeud et effectue quelques contrôles sémantiques. Explorateur léger
    */
   public void controleThisSuper(CommonTree tree);

   /*
    * Recherche un token dans un arbre et ses branches, selon divers modes.
    */
   public boolean find(CommonTree block, String token, int mode);

   /*
    * Retourne le type/la classe à laquelle appartient une méthode donnée par le noeud (qui correspond à METHODCALLING)
    */
   public String findType(CommonTree tree, NodeTDS node) throws NoSuchIdfException;

   /*
    * Cherche une méthode dans une classe et renvoie son type de retour
    */
   public String findReturnType(String className, String methodName) throws NoSuchIdfException;

   /*
    * Check si le type du symbole passé en paramètre correspond au type voulu (typetocheck)
    */
   public void checkType(NodeTDS node, String symbol, String typetocheck) throws MismatchTypeException;

   /*
    * Cherche la définition d'un symbole (méthode, variable...). Retourne le noeud contenant la définition du symbole.
    * Lance une exception si aucune définition n'est trouvée.
    */
   public NodeTDS findSymbol(NodeTDS node, String symbolname) throws NoSuchIdfException;

   /*
    * Parse les expressions arithmétiques et logiques, effectue les contrôles sémantiques sur les idf si présents.
    * Renvoie le type de l'expression (STRING, INT, OBJ), permettant le controle de type dans explorer()->AFFECT
    */
   public String calculator(CommonTree expr, NodeTDS node) throws NoSuchIdfException, MismatchTypeException;

   /*
    * Cherche un noeud dans les parents d'un arbre (AST)
    * Retourne le premier sous arbre dont le root est ce noeud
    */
   public CommonTree searchParent(CommonTree tree, String target) throws NoSuchNodeException;

   /*
    * Parse les sous-arbres METHODARGS et retourne une LinkedList d'arguements.
    */
   public LinkedList parsemethodargs(CommonTree args);

   /*
    * Vérifie si le tree passé en paramètre est une variable.
    */
   public Boolean isVariable(CommonTree variable);

   /*
    * Vérifie si la variable passée en paramètre est déjà initialisée dans la TDS (en tenant compte de sa portée)
    * Retourne sa valeur si c'est le cas (Sous la forme d'une string, à formater).
    */
   public String isInitialized(String variable, NodeTDS node) throws NotInitializedVariableException;

   /*
    * Vérifie si l'argument passé est un int pur, une chaine de caractère pure, ou autre chose.
    * Retourne le type du statement (INT ou STRING)
    */
   public String isIntOrString(CommonTree tocheck) throws NotPureStatementException;

 }

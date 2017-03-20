import org.antlr.runtime.tree.*;
import java.util.LinkedList;
import java.util.List;
import java.util.HashMap;
import java.io.File;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.IOException;

/*
 * Générateur de code assembleur. Ouvre un fichier source .asm et le remplit de ce code.
 * @author : Guillaume Garcia
 * Pour Clooc - PCL 2017 - TELECOM Nancy
 */

public class AsmGenerator {

  private File file;
  private FileWriter fileWriter;
  private PrintWriter printWriter;
  private String asmname;
  private String tab = "\t";
  private String path;
  private boolean optiond = false;

  public AsmGenerator() {

  }

  /*
   * Ouvre un fichier .asm source pour y générer du code assembleur.
   * Ce fichier pourra ensuite être compilé en binaire par le jar microPIUP.jar d'A. Parodi
   */
  public void openFile(File loocfile) {

    int index = -1;
    String purename;

    try {
      purename = loocfile.getName();
      // Si le fichier a une extension on la tronque (on tronque la dernière extension.)
      if ((index = loocfile.getName().lastIndexOf(".")) != -1) {
        purename = loocfile.getName().substring(0, loocfile.getName().lastIndexOf("."));
      }
    }
    // Si aucun de nom de fichier n'est renseigné on en prend un par défaut.
    catch (NullPointerException e) {
      purename = "NoName";
    }

    // On ajoute l'extension .asm
    asmname = purename + ".asm";

    // Option -d
    if (optiond) {
      // Append au path le caractère / si il n'existe pas déjà
      if (!path.substring(path.length()-1).equals("/")) {
        path = path + "/";
      }
      asmname = path + asmname;
    }

    try {
      // Ouverture du fichier
      file = new File(asmname);
      fileWriter = new FileWriter(file);
      printWriter = new PrintWriter(fileWriter);
    }
    catch (IOException ioe) {
      System.out.println("IOException - Erreur lors de l'ouverture du fichier soure " + asmname + " pour la génération de code assembleur");
      System.exit(1);
    }

    return;
  }

  /*
   * Retourne le fichier source .asm (type File)
   */
  public File getFile() {
    return file;
  }

  /*
   * Permet de propager l'option -d
   */
  public void setOtpion(boolean flag) {
    this.optiond = flag;
  }

  /*
   * Set le chemin où produire les fichiers assembleurs (source.asm et exec.iup)
   */
  public void setPath(String path) {
    this.path = path;
  }

  /*
   * Fermeture du fichier et des writer.
   */
  public void closeFile() throws IOException {
    try {
      fileWriter.flush();
      fileWriter.close();
      printWriter.close();
      return;
    }
    catch (IOException ioe) {
      System.out.println("IOException - Erreur lors de la fermeture du fichier soure " + asmname + " après la génération du code assembleur");
      System.exit(1);
    }
  }

  public String translate(CommonTree treeToConvert) {
    return "";
  }

  /*
   * Convertit une chaine de caractère en son image hexadécimale
   */
  public String toHexString(String sample) {

    int c = 0; // Equivalent à un char
    char s = ' '; // Séparateur
    StringBuffer buff = new StringBuffer(sample.length());

    for (int k = 0; k < sample.length(); k++) {
      c = sample.charAt(k);
      buff.append(Integer.toHexString(c));
    }

    return buff.toString();
  }

  /*
   * Convertit un int en son image hexadécimale (sous format string)
   * Taille maximale : 65535
   */
  public String toHexString(int sample) {

    String result;
    result = Integer.toHexString(sample);
    result = "0x" + result;

    return result;
  }

}

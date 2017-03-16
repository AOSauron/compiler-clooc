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

  public AsmGenerator() {

  }

  /*
   * Ouvre un fichier .asm source pour y générer du code assembleur.
   * Ce fichier pourra ensuite être compilé en binaire par le jar microPIUP.jar d'A. Parodi
   */
  public void openFile(File loocfile) throws IOException {

    int index = -1;
    String purename;

    try {
      purename = loocfilename.getName();
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
    asmname = "../assemblage/sources/" + purename + ".asm";

    // Ouverture du fichier
    file = new File(asmname);
    fileWriter = new FileWriter(file);
    printWriter = new PrintWriter(fileWriter);

    return;
  }

  public File getFile() {
    return file;
  }


  public void translate(CommonTree treeToConvert) {

  }

}

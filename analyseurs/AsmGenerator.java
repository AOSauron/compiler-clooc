import org.antlr.runtime.tree.*;
import java.util.LinkedList;
import java.util.List;
import java.util.HashMap;
import java.io.File;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.IOException;



public class AsmGenerator {

  private File file;
  private FileWriter fileWriter;
  private PrintWriter printWriter;

  public AsmGenerator() {

  }

  public void openFile(File loocfile) throws IOException {

    int index = -1;
    String purename;
    String asmname;

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


  public void translate(CommonTree treeToConvert) {

  }

}

import java.lang.Exception;
import java.io.IOException;

/*
 * Exception pour le compilateur : pas de tel noeud.
 * @author : Laure Hinsberger
 * Pour Clooc - PCL 2017 - TELECOM Nancy
 */

public class NoSuchNodeException extends Exception {

  public NoSuchNodeException() {
    super();
  }

  public NoSuchNodeException(String s) {
    super(s);
  }
}

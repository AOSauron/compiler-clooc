import java.lang.Exception;
import java.io.IOException;

/*
 * Exception pour le compilateur : pas de tel identificateur.
 * @author : Guillaume Garcia
 * Pour Clooc - PCL 2017 - TELECOM Nancy
 */

public class NoSuchIdfException extends Exception {

  public NoSuchIdfException() {
    super();
  }

  public NoSuchIdfException(String s) {
    super(s);
  }
}

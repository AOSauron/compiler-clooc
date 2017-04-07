import java.lang.Exception;
import java.io.IOException;

/*
 * Exception pour le compilateur : variable pas initialisée.
 * @author : Guillaume Garcia
 * Pour Clooc - PCL 2017 - TELECOM Nancy
 */

public class NotInitializedVariableException extends Exception {

  public NotInitializedVariableException() {
    super();
  }

  public NotInitializedVariableException(String s) {
    super(s);
  }
}

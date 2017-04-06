import java.lang.Exception;
import java.io.IOException;

/*
 * Exception pour le compilateur : problème de type dans les expression (arithémtiques ou autres).
 * @author : Guillaume Garcia
 * Pour Clooc - PCL 2017 - TELECOM Nancy
 */

public class MismatchTypeException extends Exception {

  public MismatchTypeException() {
    super();
  }

  public MismatchTypeException(String s) {
    super(s);
  }
}

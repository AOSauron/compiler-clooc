import java.lang.Exception;
import java.io.IOException;

/*
 * Exception pour le compilateur : L'expression n'est pas un INT pure ou une STRING pure.
 * @author : Guillaume Garcia
 * Pour Clooc - PCL 2017 - TELECOM Nancy
 */

public class NotPureStatementException extends Exception {

  public NotPureStatementException() {
    super();
  }

  public NotPureStatementException(String s) {
    super(s);
  }
}

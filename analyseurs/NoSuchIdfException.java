import java.lang.Exception;
import java.io.IOException;

public class NoSuchIdfException extends Exception {

  public NoSuchIdfException() {
    super();
  }

  public NoSuchIdfException(String s) {
    super(s);
  }
}

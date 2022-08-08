package co.com.testlulobank.exceptions;

public class ApisException extends AssertionError {
    public ApisException(String message, Throwable cause){
        super(message,cause);
    }
}

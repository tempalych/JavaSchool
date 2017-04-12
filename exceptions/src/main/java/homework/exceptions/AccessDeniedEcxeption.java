package homework.exceptions;

/**
 * Created by artem on 12.04.17.
 */
public class AccessDeniedEcxeption extends Exception{
    public AccessDeniedEcxeption() {
    }

    public AccessDeniedEcxeption(String message) {
        super(message);
    }

    public AccessDeniedEcxeption(String message, Throwable cause) {
        super(message, cause);
    }

    public AccessDeniedEcxeption(Throwable cause) {
        super(cause);
    }

    public AccessDeniedEcxeption(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}

package cn.qfys521.Utils.Exception;

public class NotThursdayException extends RuntimeException {
    static final long serialVersionUID = -3387516993124229948L;

    public NotThursdayException() {
    }

    public NotThursdayException(String message) {
        super(message);
    }

    public NotThursdayException(String message, Throwable cause) {
        super(message, cause);
    }

    public NotThursdayException(Throwable cause) {
        super(cause);
    }

    protected NotThursdayException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}

package cn.qfys521.Utils.Exception;

public class CrazyThursdayException extends RuntimeException {
    static final long serialVersionUID = -3387516993124229948L;

    public CrazyThursdayException() {
    }

    public CrazyThursdayException(String message) {
        super(message);
    }

    public CrazyThursdayException(String message, Throwable cause) {
        super(message, cause);
    }

    public CrazyThursdayException(Throwable cause) {
        super(cause);
    }

    protected CrazyThursdayException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}

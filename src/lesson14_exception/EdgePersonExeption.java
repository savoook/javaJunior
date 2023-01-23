package lesson14_exception;

public class EdgePersonExeption extends Exception {
    public EdgePersonExeption() {
    }

    public EdgePersonExeption(String message) {
        super(message);
    }

    public EdgePersonExeption(String message, Throwable cause) {
        super(message, cause);
    }

    public EdgePersonExeption(Throwable cause) {
        super(cause);
    }

    public EdgePersonExeption(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}

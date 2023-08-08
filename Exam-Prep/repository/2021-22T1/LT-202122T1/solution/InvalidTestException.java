public class InvalidTestException extends RuntimeException {
    public InvalidTestException(String message) {
        super(message);
    }

    public InvalidTestException(String message, Throwable cause) {
        super(message, cause);
    }
}

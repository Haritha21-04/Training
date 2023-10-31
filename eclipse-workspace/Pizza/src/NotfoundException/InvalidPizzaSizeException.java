package NotfoundException;

@SuppressWarnings("serial")
class InvalidPizzaSizeException extends Exception {
    public InvalidPizzaSizeException(String message) {
        super(message);
    }
}
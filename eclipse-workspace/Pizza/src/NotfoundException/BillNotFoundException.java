package NotfoundException;

@SuppressWarnings("serial")
class BillNotFoundException extends Exception {
    public BillNotFoundException(String message) {
        super(message);
    }
}

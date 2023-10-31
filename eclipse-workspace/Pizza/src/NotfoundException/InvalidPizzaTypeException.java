package NotfoundException;

class InvalidPizzaTypeException extends Exception {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InvalidPizzaTypeException(String message) {
        super(message);
    }
}
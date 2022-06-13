package exception;

public class RepeatedPositionException extends Exception {

	private static final long serialVersionUID = 1L;
	
	public RepeatedPositionException(String message) {
		super(message);
	}
}

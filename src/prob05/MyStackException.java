package prob05;

public class MyStackException extends Exception{
	private static final long serialVersionUID = 1L;
	private static final String EMPTY_POP = "stack is empty"; //default message
	
	public MyStackException() {
		super(EMPTY_POP);
	}
	
	public MyStackException(String message) {
		super(message);
	}
}

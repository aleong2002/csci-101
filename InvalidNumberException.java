package SuppPractice;
@SuppressWarnings("serial")

public class InvalidNumberException extends Exception {
	public InvalidNumberException() {
		super("Number not in range");
		
	}
}

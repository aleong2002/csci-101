package finalexam;

@SuppressWarnings("serial")
public class InvalidRadiusException extends Exception {

	public InvalidRadiusException() {
		super("Negative arguments not accepted.");
	}
}
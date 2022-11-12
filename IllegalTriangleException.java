package midterm2.java;

@SuppressWarnings("serial")

public class IllegalTriangleException extends Exception{
	public IllegalTriangleException() {
		super("Not a valid triangle");
	}
}

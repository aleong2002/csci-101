package finalexam;


public class NullPointer {
	public static void main(String[] args) {
		Integer num = null;
		
		try {
			System.out.println(num.toString());
		}
		
		catch (NullPointerException ex) {
			System.out.println("Exception: Null can't be printed");
		}
	}
}
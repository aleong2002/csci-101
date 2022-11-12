import java.util.Scanner;

public class CountLetters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String s = input.next();
		System.out.println("In the string " + s + " there are " + countLetters(s) + " letters");
	}
	public static int countLetters(String s) {
		int length = s.length(), c = 0;
		for (int i = 0; i < length; i++) {
			if (Character.isLetter(s.charAt(i))) {
				c++;
			}
		}
		return c;
	}
}

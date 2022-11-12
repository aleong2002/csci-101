import java.util.Scanner;

public class ASCII {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a character: ");
		String c = input.nextLine();
		int letter = (int) c.charAt(0);
		System.out.println("The ASCII code for the character is " + letter);
	}
}

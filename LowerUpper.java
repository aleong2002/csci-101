package hi.java;
import java.util.Scanner;

public class LowerUpper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Input a character: ");
		char x = input.nextLine().charAt(0);
		
		
		input.close();
		
		if (x >= 'a' && x <= 'z') {
			System.out.println("The character is lowercase");
		}
		else if (x >= 'A' && x <= 'Z') {
			System.out.println("The character is uppercase.");
		}
		else {
			System.out.println("The input is not a letter.");
		}
	}

}

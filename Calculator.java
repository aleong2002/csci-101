package finalexam;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		String[] months = {"January", "February", "March", "April",
				"May", "June","July", "August", "September", "October",
				"November", "December"};
		int[] dom = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		try {
			Scanner input = new Scanner(System.in);
			System.out.println("Enter a number 1 to 12: ");
			int num = input.nextInt() - 1;
			System.out.println(months[num] + " " + dom[num]);
		}
		
		catch (IndexOutOfBoundsException ex) {
			System.out.println("wrong number");
		}
		catch (InputMismatchException x) {
			System.out.println("not a number");
		}
	}
}

import java.util.Scanner;

public class TrialCases {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a decimal: ");
		String number = input.nextLine();
		
		if (number.charAt(0) >= '1' && number.charAt(0) <= '9') {
			System.out.println("valid");
		}
		else {
			System.out.println("not valid");
		}
	}

}


import java.util.Scanner;

public class CompoundInterest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Initial Principal Amount: ");

		double initialprincipal = input.nextDouble();
		
		while (initialprincipal <= 0) {
			System.out.println("Initial Principal Amount cannot be negative");
			System.out.println("Enter the Initial Principal Amount: ");
			initialprincipal = input.nextDouble();
		}
		
		System.out.println("Enter the Rate of Interest: ");
		double interestrate = input.nextDouble();
		while (interestrate <= 0) {
			System.out.println("Interest Rate cannot be negative");
			System.out.println("Enter the Rate of Interest: ");
			interestrate = input.nextDouble();
		}
		
		System.out.print("Enter the Number of Years: ");
		int year = input.nextInt();
		while (year <= 0) {
			System.out.println("Time cannot be negative");
			System.out.print("Enter the Number of Years: ");
			year = input.nextInt();
		}
		input.close();
		double exponent = Math.pow((1+(interestrate / 100)), year);
		double finalprincipal = initialprincipal * exponent;
		
		System.out.println("The Final Principal Amount after " + year + " years will be $" + finalprincipal);
	}

}

// different inputs and outputs:
// 1: 1200, 5, 2 with output = 1323.0
// 2: 15000.35, 7.5, 10 with output = 30916.194793517425 
// 3: 14020, 4, 3 with output = 15770.593280000001
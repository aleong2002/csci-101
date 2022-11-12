import java.util.Scanner;

public class CostOfShipping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter package weight: ");
		double weight = input.nextDouble();
		
		if (weight > 0 && weight <= 2) {
			System.out.println("It is $2.50 to ship this package");
		}
		else if (weight > 2 && weight <= 4 ) {
			System.out.println("It is $4.50 to ship this package");
		}
		else if (weight > 4 && weight <= 10 ) {
			System.out.println("It is $7.50 to ship this package");

		}
		else if (weight > 10 && weight  <= 20) {
			System.out.println("It is $10.50 to ship this package");

		}
		else {
			System.out.println("This package cannot be shipped");

		}
		
	}

}

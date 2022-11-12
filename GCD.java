import java.util.Scanner;


public class GCD {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 2 numbers: ");
		
		int num1 = input.nextInt(), num2 = input.nextInt(), min, gcd = 0;
		
		input.close();
		
		min = (num1 < num2) ? num1 : num2;
		
		
		for (int i = 1; i <= min; i++) {
			if (num1 % i == 0 && num2 % i == 0) {
				gcd = i;
			}
		}
		System.out.println("The GCD is " + gcd);
	}

}

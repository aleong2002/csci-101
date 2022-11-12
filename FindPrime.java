import java.util.Scanner;

public class FindPrime {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = input.nextInt();
		input.close();
		boolean prime = true;		
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				prime = false;
			}
		}
		if (num == 1) {
			System.out.println("Not a prime");
		}
		
		else if (prime) {
			System.out.println("Prime Number");
			
		}
		else {
			System.out.println("Not a prime");
		}
	}
}

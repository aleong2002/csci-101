package SuppPractice;
/* A positive integer is called a perfect number if it is equal to the sum of all of its
positive divisors, excluding itself. For example, 6 is the first perfect number
because 6 = 3 + 2 + 1. */
import java.util.*;

public class Num6 {
	public static void perfect(int n) throws InvalidNumberException{
		if (n < 0) {
			throw new InvalidNumberException();
		}
		else {
			
			int sum = 0;
			
			 if (n < 6) {
				System.out.println("not a perfect number");
			}
			
			else {
				for (int i = 1; i < n; i++) {
					if (n % i == 0) {
						sum += i;
					}
				}
				if (n == sum) {
					System.out.println("perfect");
				}
				else {
					System.out.println("not a perfect number");
				}
			}
		}
	}
	
	public static void main(String[] args) throws InvalidNumberException{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a positive number: ");
		try {
			int i = input.nextInt();
			perfect(i);
		}
		catch (InputMismatchException x) {
			System.out.println("Not a valid number");
		}
		catch (InvalidNumberException x) {
			System.out.println("Not a valid number");

		}
	}
}

package SuppPractice;
/* Write a program that reads an integer between 0 and 1000 and adds all the digits in
the integer. For example, if an integer is 932, the sum of all its digits is 14 */
import java.util.*;
public class Num1 {
	
	public static int addSum(int num) throws InvalidNumberException {
		if (num >= 1 && num <= 1000) {
			String x = String.valueOf(num);
			int sum = 0;
			for (int i = 0; i < x.length(); i++) {
				sum += Character.getNumericValue(x.charAt(i));
			}
			return sum;
		}
		else {
			throw new InvalidNumberException();
		}
		
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number 1 to 1000: ");
		try {
			int num = input.nextInt();
			System.out.println(addSum(num));
		}
		catch (InputMismatchException e) {
			System.out.println("Not a valid number");
		}
		catch (InvalidNumberException ex) {
			System.out.println("Number not in range");
		}
		 
	}
}


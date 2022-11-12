package hi.java;
import java.util.Scanner;

public class SortThree {

	public static void main(String[] args) {
		// (Sort three integers) Write a program that prompts 
		// the user to enter three integers
		// and display the integers in non-decreasing order.
		Scanner input = new Scanner(System.in);
		System.out.print("Enter three integers: ");
		int num1 = input.nextInt(), num2 = input.nextInt(), num3 = input.nextInt();
		
		if (num1 > num2 && num1 > num3) {
			if (num2 > num3) {
				System.out.println(num3 + ", " + num2 + ", " + num1);
			}
			else {
				System.out.println(num2 + ", " + num3 + ", " + num1);
			}
		}
		else if (num2 > num1 && num2 > num3) {
			if (num1 > num3) {
				System.out.println(num3 + ", " + num1 + ", " + num2);
			}
			else {
				System.out.println(num1 + ", " + num3 + ", " + num2);
			}
		}
		else {
			if (num1 > num2) {
				System.out.println(num2 + ", " + num1 + ", " + num3);
			}
			else {
				System.out.println(num1 + ", " + num2 + ", " + num3);
			}
		}
	}

}

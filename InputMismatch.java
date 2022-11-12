package finalexam;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatch {

	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		try {
			int n = input.nextInt();
			System.out.println("The number you entered is: " + n);
		}
		catch (InputMismatchException ex) {
			System.out.println("Exception: Can only except parameter of int type.");
		}
	
	}

}
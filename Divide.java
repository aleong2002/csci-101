package finalexam;

import java.util.Scanner;

public class Divide {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
    	System.out.println("Enter the first number: ");
        int a = input.nextInt();
        System.out.println("Enter the second number: ");
    	int b = input.nextInt();
    	
    	try {
    	System.out.print(a + " divided by " + b + " is: " + a/b);
    	}
    	
    	catch (ArithmeticException ex){
    		System.out.println("Exception: you cannot divide by a 0");
    	}
    }
}
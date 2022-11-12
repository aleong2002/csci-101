package hi.java;

import java.util.Scanner;

public class ComputeAverage {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Prompt for three numbers
		System.out.print("Enter three numbers: ");
		
		double num1 = input.nextDouble();
		double num2 = input.nextDouble();
		double num3 = input.nextDouble();
		
		input.close();
		
		double average = (num1 + num2 + num3) / 3;
		
		//print results
		System.out.println("The average of numbers " + num1 + " " + num2 + " and " + num3 + " is " + average);
	}
}

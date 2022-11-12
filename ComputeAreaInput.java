package hi.java;

import java.util.Scanner;

public class ComputeAreaInput {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a radius: ");
		double radius = input.nextDouble();
		final double PI = 3.14159; //permanent data that can't be changed
		// constants are capitalised
		
		input.close();
		double area = radius * radius * PI;
		
		System.out.println("The area for the circle of radius " + radius + " is " + area);
	}
}

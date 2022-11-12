package hi.java;

import java.util.Scanner;

public class FahrenheitToCelsius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a temperature in Fahrenheit: ");
		double fahrenheit = input.nextDouble();
		input.close();
		
		double celsius = (5.0 / 9) * (fahrenheit - 32);
		System.out.println("Fahrenheit " + fahrenheit + " is " + celsius + " in Celsius");
		
	}

}

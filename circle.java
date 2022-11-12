package hi.java;
import java.util.Scanner;


public class circle {
	public static void main(String[] args) {
		final double PI = 3.14;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a value of the radius: ");
		double radius = input.nextDouble();
		
		double circumference = 2 * PI * radius;
		System.out.println("The circumference of the " + "circle is: " + circumference);
	}
}

package SuppPractice;
/* Write a program that prompts the user to enter a point (x, y) and checks whether
the point is within the rectangle centered at (0, 0) with width 10 and height 5. */
import java.util.*;

public class Num3 {
	public static boolean check(double x, double y) {
		if (x >= -5 && x <= 5) {
			if ( y >= -2.5 && y <= 2.5) {
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		Scanner i1 = new Scanner(System.in);
		Scanner i2 = new Scanner(System.in);
		
		System.out.println("Enter x and y: ");
		try {
			double x = i1.nextDouble();
			double y = i2.nextDouble();
			System.out.println(check(x, y));
		}
		catch (InputMismatchException e) {
			System.out.println("Not a valid number");
		}
	}
}

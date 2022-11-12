package SuppPractice;
/*Write a program that prompts the user to enter three points (x1, y1), (x2, y2), (x3,
y3) of a triangle and displays its area and perimeter. Use the following relations
(Heron’s Formula):
S = (side1 + side2+ side3)/2
Area = √S(S-side1)(S-side2)(S-side3) */
import java.util.*;

public class Num2 {
	
	public static double area(double s1, double s2, double s3) throws InvalidNumberException {
		if (s1 < 0 || s2 < 0 || s3 < 0) {
			throw new InvalidNumberException();
		}
		else {
			double s = perim(s1, s2, s3) / 2;
			double a = s - s1, b = s - s2, c = s - s3;
			return Math.sqrt( s* a * b * c);
		}
	}
	public static double perim(double s1, double s2, double s3) throws InvalidNumberException {
		if (s1 < 0 || s2 < 0 || s3 < 0) {
			throw new InvalidNumberException();
		}
		else {
			return s1 + s2 + s3;
		}
	}
	
	public static void main(String[] args) throws InvalidNumberException{
		Scanner input1 = new Scanner(System.in);
		Scanner input2 = new Scanner(System.in);
		Scanner input3 = new Scanner(System.in);
		
		System.out.println("Enter sides: ");
		try {
			double s1 = input1.nextDouble();
			double s2 = input2.nextDouble();
			double s3 = input3.nextDouble();
			
			System.out.println("Area: " + area(s1, s2, s3));
			System.out.println("Perimeter: " + perim(s1, s2, s3));
		}
		catch (InputMismatchException x) {
			System.out.println("Not a valid number");
		}
		catch (InvalidNumberException e) {
			System.out.println("Not a valid number");
		}

	}
}

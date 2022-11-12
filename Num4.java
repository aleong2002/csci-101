package SuppPractice;
import java.util.*;

public class Num4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter coordinates: ");
		
		try {
			double x1 = input.nextDouble();
			double y1 = input.nextDouble();
			double x2 = input.nextDouble();
			double y2 = input.nextDouble();
			double x3 = input.nextDouble();
			double y3 = input.nextDouble();
			double x4 = input.nextDouble();
			double y4 = input.nextDouble();
			
			double a = y1 - y2;
			
			double b = -1 * (x1 - x2);
			double c = y3 - y4;
			double d = -1 * (x3 - x4);
			double e = (y1 - y2) * x1 - (x1 - x2) * y1;
			double f = (y3 - y4) * x3 - (x3 - x4) * y3;
			
			if (a * d - b * c == 0)
			{
				System.out.println("The two lines are parallel");
			}
			else
			{
				double x = (e * d - b * f) / (a * d - b * c);
				double y = (a * f - e * c) / (a * d - b * c);
				System.out.println("The intersecting point is at (" + x + ", " + y + ")");
			}
			
		}
		
		catch (InputMismatchException x) {
			System.out.println("Not a valid number");
		}
		
		
	}
}

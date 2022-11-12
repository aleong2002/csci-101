import java.util.Scanner;

public class PointCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an x and y coordinate: ");
		double x = input.nextDouble(), y = input.nextDouble();
		
		double distance = Math.sqrt(Math.pow((0-x),  2) + Math.pow((0-y), 2));
		
		if (distance <= 10) {
			System.out.println("Point (" + x + ", " + y + ") is in the circle");
		}
		else {
			System.out.println("Point (" + x + ", " + y + ") is not in the circle");

		}
	}

}

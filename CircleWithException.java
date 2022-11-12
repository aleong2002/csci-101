package finalexam;
import java.util.Scanner;

public class CircleWithException extends Circle1{
	public CircleWithException() {
		super();
	}
	
	@Override
	public void setRadius(double radius) throws InvalidRadiusException {
		if (radius <= 0) {
			throw new InvalidRadiusException();
		}
		else {
			this.radius = radius;
		}
	}
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a radius: ");
		try {
			double r = input.nextDouble();
			CircleWithException y = new CircleWithException();
			y.setRadius(r);
		}
		
		catch (InvalidRadiusException ex) {
			System.out.println("Negative arguments not accepted");
		}
	}
}

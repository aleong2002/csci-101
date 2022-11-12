import java.util.Scanner;

public class PentagonArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the length from the center to a vertex: ");
		double r = input.nextDouble();
		final double PI = 3.141592;
		final double TANGENT = Math.tan(PI / 5);
		final double SIN = Math.sin(PI / 5);
		double ssq = Math.pow(SIN * (2 *r), 2);
		double area = (5 * ssq) / (4 * TANGENT);
		
		System.out.printf("The area of the pentagon is %2.2f%n", area);
	}

}

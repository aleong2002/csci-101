package midterm2.java;
import java.util.Scanner;

public class Triangle extends GeometricObject{
	private double s1;
	private double s2;
	private double s3;
	
	public Triangle() {
		super();
	}
	
	public Triangle(double s1, double s2, double s3, String color, boolean fill) throws IllegalTriangleException{
		super(color, fill);

		if (s1 + s2 > s3|| s1 + s3 > s2 || s2 + s3 > s1) {
			throw new IllegalTriangleException();
		}
		
		this.s1 = s1;
		this.s2 = s2;
		this.s3 = s3;
	}
	
	public void setS1(double s1) {
		this.s1 = s1;
	}
	
	public void setS2(double s2) {
		this.s2 = s2;
	}

	public void setS3(double s3) {
	
		this.s3 = s3;
	}
	
	public double getS1() {
		return this.s1;
	}
	
	public double getS2() {
		return this.s2;
	}
	
	public double getS3() {
		return this.s3;
	}
	
	public double getArea() {
		double s = (s1 + s2 + s3) / 2;
		return Math.sqrt(s * (s - s1) * (s - s2) * (s - s3)); 
	}
	
	public double getPerimeter() {
		return s1 + s2 + s3;
	}
	
	public static void main(String[] args) throws IllegalTriangleException {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter color, filled, and length of sides: ");
		String color = input.nextLine();
		boolean filled = input.nextBoolean();
		double s1 = input.nextDouble(), s2 = input.nextDouble(), s3 = input.nextDouble();
		
		Triangle t = new Triangle(s1, s2, s3, color, filled);
		System.out.println(t.getArea() + " "  + t.getPerimeter() + t.getColor() + t.getFill() );
	}
}

package midterm2.java;

public class Circle extends GeometricObject {
	
	private double radius;
	private static int counter = 0;
	
	// overloaded constructor method w/ default
	public Circle() {
		this.radius = 1.0;
	}
	
	// passed constructor method
	public Circle(double radius) {
		this.radius = radius;
		Circle.counter++;
	}
	public Circle(double radius, String color, boolean filled) {
		super(color, filled);
		this.radius = radius;
		Circle.counter++;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double getRadius() {
		return this.radius;
	}
	
	//return area
	public double getArea() {
		return (Math.pow(this.radius, 2) * Math.PI);
	}
	
	//return circumference
	public double getCircumference() {
		return 2*this.radius*Math.PI;
	}
	//.toString()
	public String toString() {
		return "Circle" + Circle.counter;
	}
	
	//equals method
	public boolean equals(Circle c1) {
		return this.radius == c1.getRadius();
	}
	
	public double getDiameter() {
		return 2 * radius;
	}

	@Override
	public double getPerimeter() {
		return 2 * radius * Math.PI;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c1 = new Circle();
		System.out.println("The circle "+ "has a radius of " + c1.getRadius() + " and area of " + c1.getArea());
	
		Circle c2 = new Circle(1.0);
		
		System.out.println("The circle "+ "has a radius of " + c2.getRadius() + " and area of " + c2.getArea());
		System.out.println(c1 == c2);
		System.out.println(c1.equals(c2));
		
	
	}
	
}

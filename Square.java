package midterm2.java;

public class Square extends GeometricObject implements Colorable {
	private double side;
	
	
	public Square() {
		
	}
	
	public Square(String color, boolean filled, double side) {
		super( color, filled);
		this.side = side;
	}
	
	public void setSide(double side) {
		this.side = side;
	}
	
	public double getSide() {
		return this.side;
	}
	
	@Override
	public void howToColor() {
		System.out.println("Color all four sides");
	}
	
	public double getArea() {
		return Math.pow(side, 2);
	}
	
	public double getPerimeter() {
		return 4*this.side;
	}
}
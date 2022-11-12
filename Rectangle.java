package midterm2.java;

public class Rectangle {
	private double width = 1.0;
	private double height = 1.0;
	
	public Rectangle() {
		this.width = getWidth();
		this.height = getHeight();
	}
	
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	public void setWidth(double width) {
		this.width = width;
	}
	
	public double getWidth() {
		return this.width;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	public double getHeight() {
		return this.height;
	}
	
	public double getArea() {
		return this.height * this.width;
	}
	
	public double getPerimeter() {
		return 2*this.height + 2*this.width;
	}
	
	public static void main(String[] args) {
		Rectangle rect1 = new Rectangle(4.0, 40.0);
		System.out.println(rect1.getHeight() + " " + 
		rect1.getWidth() + " " +
		rect1.getArea() + " " + 
		rect1.getPerimeter());
		Rectangle rect2 = new Rectangle(3.5, 35.9);
		System.out.println(rect2.getHeight() + " " + 
				rect2.getWidth() + " " +
				rect2.getArea() + " " + 
				rect2.getPerimeter());
		Rectangle rect3 = new Rectangle();
		System.out.println(rect3.getHeight() + " " + 
				rect3.getWidth() + " " +
				rect3.getArea() + " " + 
				rect3.getPerimeter());
	}
}

package midterm2.java;

public class Cylinder extends Circle {
	private double length;
	
	public Cylinder (double r, double length) {
		super(r);
		this.length = length;
	}
	
	public void setLength(double length) {
		this.length = length;
	}
	
	public double getLength() {
		return this.length;
	}
	
	public double getArea() {
		return 2*super.getArea() + super.getCircumference()*this.getLength();
	}
	public double getVolume() {
		return super.getArea()*this.length;
	}
	
	public static void main(String[] args) {
		Cylinder cyl1 = new Cylinder(2, 4);
		System.out.println(cyl1.getArea() + " " + cyl1.getVolume());
	}
}

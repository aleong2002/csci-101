package midterm2.java;

public class CIrcle2D {
	private double x;
	private double y;
	private double radius;
	
	public CIrcle2D(double x, double y, double radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	
	public CIrcle2D() {
		this.x = 0;
		this.y = 0;
		this.radius = 1;
	}
	
	public void setX(double x) {
		this.x = x;
	}
	
	public double getX() {
		return this.x;
	}
	
	public void setY(double y) {
		this.y = y;
	}
	
	public double getY() {
		return this.y;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double getRadius() {
		return this.radius;
	}
	
	public double getArea() {
		return (Math.pow(this.radius, 2) * Math.PI);
	}
	
	public double getCircumference() {
		return 2*this.radius*Math.PI;
	}
	
	public boolean contains(double x, double y) {
		return Math.sqrt(Math.pow(x - this.x, 2) + 
				 Math.pow(y - this.y, 2)) 
				 < radius;
	}

	
	public boolean contains(CIrcle2D circle) {
		return Math.sqrt(Math.pow(circle.getX() - x, 2) + 
				 Math.pow(circle.getY() - y, 2)) 
				 <= Math.abs(radius - circle.getRadius());
	}

	
	public boolean overlaps(CIrcle2D circle) {
		return Math.sqrt(Math.pow(circle.getX() - x, 2) + 
				 Math.pow(circle.getY() - y, 2)) 
				 <= radius + circle.getRadius();
	}
	
	public static void main(String[] args) {
		CIrcle2D c1 = new CIrcle2D(2, 2, 5.5);
		System.out.println(c1.contains(3, 3));
		System.out.println(c1.contains( new CIrcle2D(4, 5, 10.5)));
		System.out.println(c1.overlaps(new CIrcle2D(3, 5, 2.3)));
	}
}

package midterm2.java;

public abstract class GeometricObject {
	private String color;
	private boolean fill;
	
	public GeometricObject(String color, boolean fill) {
		this.color = color;
		this.fill = fill;
	}
	public GeometricObject() {
		
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getColor() {
		return this.color;
	}
	
	public void setFill(boolean fill) {
		this.fill = fill;
	}
	
	public boolean getFill() {
		return this.fill;
	}
	
	public abstract double getArea();
	
	public abstract double getPerimeter();
	
}

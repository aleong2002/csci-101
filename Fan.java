package midterm2.java;

public class Fan {
	public static final int SLOW = 1;
	public static final int MEDIUM = 2;
	public static final int FAST = 3;
	
	private int speed = SLOW;
	private boolean on = false;
	private double radius = 5.0;
	public String color = "blue";
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public int getSpeed() {
		return this.speed;
	}
	
	public void setOn(boolean on) {
		this.on = on;
	}
	
	public boolean getOn() {
		return this.on;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double getRadius() {
		return this.radius;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	public String getColor() {
		return this.color;
	}
	
	public Fan(int speed, boolean on, double radius, String color) {
		this.speed = speed;
		this.on = on;
		this.radius = radius;
		this.color = color;
	}
	
	public Fan() {
		this.speed = getSpeed();
		this.on = getOn();
		this.radius = getRadius();
		this.color = getColor();
	}
	
	public String toString() {
		if (this.on == true) {
			return this.speed + " " + this.color + " " + this.radius;
		}
		
		else {
			return this.color + " " + this.radius + " fan is off";
		}
	}
	
	public static void main(String[] args) {
		Fan fan1 = new Fan(FAST, true, 10.0, "yellow");
		Fan fan2 = new Fan(MEDIUM, false, 5, "blue");
		
		System.out.println(fan1.toString());
		System.out.println(fan2.toString());
	}
	
}

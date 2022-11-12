package finalexam;

public class Circle1 {
	protected double radius;
	
	public Circle1() {
		this.radius = 1;
	}
	
	public void setRadius(double radius) throws InvalidRadiusException {
		
		if (radius >= 0) {
			this.radius = radius;
		}
		
		else {
			throw new InvalidRadiusException();
		}
	}
	
	public double getRadius() {
		return this.radius;
	}
	
	public static void main(String[] args) throws InvalidRadiusException {
		Circle1 x = new Circle1();
		
		try {
			x.setRadius(-2);
		}
		
		catch (IllegalArgumentException ex) {
			System.out.println("Exception: Illegal Argument");
		}
		
	}
}

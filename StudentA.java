package midterm2.java;

public class StudentA extends Marks{
	protected double m1;
	protected double m2;
	protected double m3;
	
	public StudentA() {
		
	}
	
	public StudentA(double m1, double m2, double m3) {
		this.m1 = m1;
		this.m2 = m2;
		this.m3 = m3;
	}
	
	public double getPercentage() {
		return ((this.m1 + this.m2 + this.m3) / 3);
	}
	
}

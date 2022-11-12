package midterm2.java;

public class StudentB  extends Marks{
	protected double m1;
	protected double m2;
	protected double m3;
	protected double m4;
	
	public StudentB() {
		super();
	}
	
	public StudentB(double m1, double m2, double m3, double m4) {
		this.m1 = m1;
		this.m2 = m2;
		this.m3 = m3;
		this.m4 = m4;
	}
	
	@Override
	public double getPercentage() {
		return ((this.m1 + this.m2 + this.m3 + this.m4)/4);
	}
	
	public static void main(String[] args) {
		Marks a = new StudentA(100, 90, 87);
		Marks b = new StudentB(100, 100, 98, 99);
		
		System.out.printf("Student A: %.2f and Student B: %.2f", a.getPercentage(), b.getPercentage());
	}
}

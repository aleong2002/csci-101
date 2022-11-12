package midterm2.java;

public class Equation {
	private  int a;
	private  int b;
	private  int c;
	
	public Equation(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public void setA(int a) {
		this.a = a;
	}
	
	public int getA() {
		return a;
	}
	
	public void setB(int b) {
		this.b = b;
	}
	
	public int getB() {
		return b;
	}
	
	public void setC(int c) {
		this.c = c;
	}
	
	public int getC() {
		return c;
	}
	
	public double[] findRoot(Equation e1) {
		double[] roots = new double[2];
		
		a = e1.getA();
		b = e1.getB();
		c = e1.getC();
		
		roots[0] = (-b + ((Math.sqrt(Math.pow(b, 2) - 4*a*c))))/(2*a);
		roots[1] = (-b - ((Math.sqrt(Math.pow(b, 2) - 4*a*c))))/(2*a);
		return roots;
	}
	
	public static void main(String[] args) {
		Equation e1 = new Equation(1, 2, 1);
		double[] roots = new double[2];
		roots = e1.findRoot(e1);
		System.out.println(roots[0] + " " + roots[1]);
	}
	
}

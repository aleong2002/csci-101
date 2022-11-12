import java.util.Scanner;

public class Number {
	double num;
	
	public Number(double num) {
		this.num = num;
	}
	public Number() {
		this.num = 0;
	}
	public void setNumber(double num) {
		this.num = num;
	}
	public double getNumber() {
		return this.num;
	}
	
	public void add(Number n) {
		System.out.println("The sum of the two numbers is " + (n.getNumber() + this.num));
	}
	
	public void difference(Number n) {
		System.out.println("The difference between the two numbers is " + (this.num - n.getNumber()));
		
	}
	public void product(Number n) {
		System.out.println("The product of the two numbers is " + (n.getNumber() * this.num));
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		Number num1 = new Number(input.nextDouble());
		System.out.println("Enter the second number: ");
		Number num2 = new Number(input.nextDouble());
		
		System.out.println();
		num1.add(num2);
		num1.difference(num2);
		num1.product(num2);
		input.close();
	}
	
}

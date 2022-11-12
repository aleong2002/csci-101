import java.util.Scanner;

public class Complex extends Number {
	double imag;
	public Complex() {
		super();
	}
	public Complex(double imag) {
		this.imag = imag;
	}
	public void setComplex(double imag) {
		this.imag = imag;
	}
	public double getComplex() {
		return this.imag;
	}
	public void addComplex(Number n1, Number n2, Complex imag2) {
		System.out.print("The sum of the two numbers is " + (n1.getNumber() + n2.getNumber()) + " + ");
		System.out.println(this.imag + imag2.getComplex() + "i");
	}
	public void differenceComplex(Number n1, Number n2, Complex imag2) {
		System.out.print("The difference between the two numbers is " + (n1.getNumber() - n2.getNumber()) + " + ");
		System.out.println(this.imag - imag2.getComplex() + "i");
		
	}
	public void productComplex(Number n1, Number n2, Complex imag2) {
		System.out.print("The product of the two numbers is ");
		System.out.print(((n1.getNumber() * n2.getNumber()) - (this.imag * imag2.getComplex())) + " + ");
		System.out.println((n1.getNumber() * imag2.getComplex()) + (n2.getNumber() * this.imag) + "i");
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		Number num1 = new Number(input.nextDouble());
		System.out.println("Enter the imaginary part of the first number: ");
		Complex imag1 = new Complex(input.nextDouble());

		System.out.println("Enter the second number: ");
		Number num2 = new Number(input.nextDouble());
		System.out.println("Enter the imaginary part of the second number: ");
		Complex imag2 = new Complex(input.nextDouble());

		System.out.println();
		input.close();

		imag1.addComplex(num1, num2, imag2);
		imag1.differenceComplex(num1, num2, imag2);
		imag1.productComplex(num1, num2, imag2);
	}
}

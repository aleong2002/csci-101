package hi.java;
import java.util.Scanner;

public class ComputeBMI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a weight (lb): ");
		double weight = input.nextDouble();
		
		System.out.print("Enter a height(in): ");
		double height = input.nextDouble();
		
		final double KG_LB = .45359237;
		final double M_IN = .0254;
		
		double weight_kg = weight * KG_LB;
		double height_m = height * M_IN;
		
		double bmi = weight_kg / (Math.pow(height_m, 2));
		
		System.out.println("BMI is " + bmi);
		
		if (bmi < 18.5) {
			System.out.println("You are underweight");
		}
		else if (bmi < 25) {
			System.out.println("You are normal");
		}
		else if (bmi < 30) {
			System.out.println("You are overweight");
		}
		else {
			System.out.println("You are obese");
		}
	}

}

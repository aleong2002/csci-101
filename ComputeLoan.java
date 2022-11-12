package hi.java;

import java.util.Scanner;

public class ComputeLoan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter annual interest rate, e.g., ");
		double interestRate = input.nextDouble();
		
		double monthlyRate = interestRate / 1200;
		
		
		System.out.print("Enter number of years as an integer, e.g., 5: ");
		int numberOfYears = input.nextInt();
		
		System.out.print("Enter loan amount, e.g., 1200000.95: ");
		double loanAmount = input.nextDouble();
		input.close();
		double monthlyPayment = loanAmount * monthlyRate / (1 - 1 / Math.pow(1 + monthlyRate, numberOfYears * 12));
		double totalPayment = monthlyPayment * numberOfYears * 12;
		
		System.out.println("The monthly paymnet is $" + (int)(monthlyPayment * 100) / 100.0);
		System.out.println("The total payment is $" + (int)(totalPayment * 100) / 100.0);
	}

}

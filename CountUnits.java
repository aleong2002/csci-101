package hi.java;

import java.util.Scanner;

public class CountUnits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		
		System.out.print("Enter a decimal number: ");
		double amount = input.nextDouble();
		int remainingAmount = (int)(amount * 100);
		
		input.close();
		
		int numberDollars = remainingAmount / 100;
		remainingAmount = remainingAmount % 100;
		
		int numberQuarters = remainingAmount / 25;
		remainingAmount = remainingAmount % 25;
		
		int numberDimes = remainingAmount / 10;
		remainingAmount = remainingAmount % 10;
		
		int numberNickels = remainingAmount / 5;
		remainingAmount = remainingAmount % 5;
		
		int numberPennies = remainingAmount;
		
		System.out.println("Your amount " + amount + " consists of " + numberDollars + " dollars ");
		System.out.println(" " + numberQuarters + " quarters " + numberDimes + " dimes " + numberNickels + " nickels ");
		System.out.println(numberPennies + " pennies");
		
	}

}

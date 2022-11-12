import java.util.Scanner;

public class ATM {
	public static void main(String[] args) {
		System.out.print("Enter the desired operation: \n1. Withdraw \n2. Deposit \n3. Check Balance \n4. Exit ");
		Scanner input = new Scanner(System.in);
		int choice = input.nextInt();
		
		switch (choice) {
		case 1:
			System.out.print("Enter your current balance: ");
			double balance = input.nextDouble();
			System.out.println("How much would you like to withdraw? ");
			double amount = input.nextDouble();
			balance = withdraw(amount, balance);
			System.out.println("You have withdrew $" + amount + ". You have $" + balance + " in your account");
			break;
		case 2:
			System.out.print("Enter your current balance: ");
			balance = input.nextDouble();
			System.out.println("How much would you like to deposit? ");
			amount = input.nextDouble();
			balance = deposit(amount, balance);
			System.out.println("You have deposited $" + amount + ". You have $" + balance + " in your account");
			break;
		case 3:
			System.out.print("Enter your current balance: ");
			balance = input.nextDouble();
			System.out.print("You currently have $" + checkBalance(balance));
			
			break;
		case 4:
			exit();
		}
	
	}
	
	public static double withdraw(double num1, double balance) {
		if (num1 <= balance) {
			balance -= num1;
			return balance;
		}
		else {
			System.out.print("Insufficient balance.");
			return balance;
		}
		
	}
	
	public static double deposit(double num1, double balance) {
		balance += num1;
		return balance;
	}
	
	public static double checkBalance(double balance) {
		return balance;
	}
	public static void exit() {
		System.out.println("Exiting menu...");
	}
	
	

}

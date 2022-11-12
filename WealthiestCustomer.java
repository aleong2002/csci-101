import java.util.Scanner;

public class WealthiestCustomer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of rows: ");
		int rows = input.nextInt();
		if (rows <= 0) {
			System.out.println("Invalid input");
		}
		
		else {
			System.out.println("Enter number of columns: ");
			int columns = input.nextInt();
			if (columns <= 0) {
				System.out.print("Invalid input");
			}
			
			else {
				int[][] accounts = new int[rows][columns];
				System.out.println("Enter the values");
	
				for (int i = 0; i < rows; i++) {
					for(int j = 0; j < columns; j++) {
						accounts[i][j] = input.nextInt();
					}
				}
				System.out.println("The wealthiest customer is Customer " + wealthiest(accounts));
			}
		}
	}
	public static int wealthiest(int[][] accounts) {
		int number = 0, sum, maxsum = -1;
		
		for (int i = 0; i < accounts.length; i++) {
			sum = 0;
			for (int j = 0; j < accounts[0].length; j++) {
				sum += accounts[i][j];
			}
			if (sum > maxsum) {
				maxsum = sum;
				number = i + 1;
			}
		}
		
		return number;
	}

}

import java.util.Scanner;

public class LotteryNew {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int lottery1 = (int) (Math.random() * 10);
		String lot1 = Integer.toString(lottery1);
		int lottery2 = (int) (Math.random()* 10);
		while (lottery1 == lottery2) {
			lottery2 = (int) (Math.random()* 10);
		}
		String lot2 = Integer.toString(lottery2);
		String lottery = lot1 + lot2;
		
		System.out.print("Enter your lottery number (2 digits): ");
		int guess = input.nextInt();
		String gue = Integer.toString(guess);
		int guess1 = guess / 10;
		String g1 = Integer.toString(guess1);
		int guess2 = guess % 10;
		String g2 = Integer.toString(guess2);
		
		System.out.println("The winning number was " + lottery);
		if (gue.equals(lottery)) {
			System.out.println("You win all the money!");
		}
		else if (g1.equals(lot2) && g2.equals(lot1)) {
			System.out.println("You win a majority of the money!");
		}
		else if (g1.equals(lot1) || g1.equals(lot2) || g2.equals(lot1) || g2.equals(lot2)) {
			System.out.println("You win some of the money!");
		}
		else {
			System.out.println("Sorry, better luck next time!");
		}
	}

}

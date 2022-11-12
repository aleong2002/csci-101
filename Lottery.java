package hi.java;
import java.util.Scanner;

public class Lottery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int lottery = (int) (Math.random() * 100);
		
		int lottery1 = lottery / 10;
		int lottery2 = lottery % 10;
		
		System.out.print("Enter your lottery number (2 digits): ");
		int guess = input.nextInt();
		int guess1 = guess / 10;
		int guess2 = guess % 10;
		
		System.out.println("The winning number was " + lottery);
		if (guess1 == lottery) {
			System.out.println("You win all the money!");
		}
		else if (guess1 == lottery2 && guess2 == lottery1) {
			System.out.println("You win a majority of the money!");
		}
		else if (guess1 == lottery1 || guess1 == lottery2 || guess2 == lottery1 || guess2 == lottery2) {
			System.out.println("You win some of the money!");
		}
		else {
			System.out.println("Sorry, better luck next time!");
		}
	}

}

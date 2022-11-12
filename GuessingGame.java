package hi.java;
import java.util.Scanner;

public class GuessingGame {

	public static void main(String[] args) {
		int number = (int) (Math.random() * 100) + 1;
		
		Scanner input = new Scanner(System.in);
		
		int guess = -1;
		
		while (guess != number) {
			System.out.print("Enter a guess: ");
			
			guess = input.nextInt();
			
			
			if (guess < number) {
				System.out.println("Sorry, the number is higher than that");
			}
			else {
				System.out.println("Sorry, the number is lower than that");
				
			}
		
		}
		input.close();
		
		System.out.println("You guessed correctly! The number was " + number);
	}
}

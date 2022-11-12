package hi.java;
import java.util.Scanner;

public class GuessNumberOneTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int num = (int) (Math.random() * 101), guess = -1;
		while (guess != num) {
			System.out.println("Guess a number between 0 and 100: ");
			guess = input.nextInt();
			
			if (guess == num) {
				System.out.println("You got it!");
				break;
			}
			
			else if (guess < num) {
				System.out.println("You guessed too low! Try again");
			}
			 
			else {
				System.out.println("You guessed too high! Try again");
			}
		}
	}

}

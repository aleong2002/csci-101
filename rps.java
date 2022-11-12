package hi.java;
import java.util.Scanner;


public class rps {
	public static void main(String[] args) {
		System.out.println("Rock (1), Paper (2), Scissors(3)");
		
		Scanner input = new Scanner(System.in);
		int rps = input.nextInt();
		int myhand = 1;
		
		
		input.close(); 
		
		if (rps == 1) {
			//if (inputstr.equals("Rock"))
			System.out.println("It's a draw!");
		}
		else if (rps == 2) {
			System.out.println("You lose!");
		}
		
		else {
			System.out.println("You win!");
		}
		
	}
}

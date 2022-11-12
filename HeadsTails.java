import java.util.Scanner;

public class HeadsTails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a guess (0 or 1): ");
		int guess = input.nextInt();
		
		int ht = (int) Math.round(Math.random());
		
		if (guess == ht) {
			System.out.println("You are correct!");
		}
		else {
			System.out.println("You got it wrong!");
		}
	}

}

package hi.java;

public class Blackjack {
	public static void main(String[] args) {
	int card1 = (int)(Math.random() * 11) + 1;
	int card2 = (int) (Math.random() * 11) + 1;
	
	if (card1 + card2 == 21) {
		System.out.println("Blackjack!");
	}

	else {
		System.out.println("Maybe next time!");
	}
	
	}
	
}
		
package hi.java;

public class BlackJackLoop {

	public static void main(String[] args) {
		int card1 = 0, card2 = 0, count = 0;
		
		while (card1 + card2 != 21) {
			card1 = (int) (Math.random() * 11) + 1;
			card2 = (int) (Math.random() * 11) + 1;
			
			System.out.println("Maybe next time!");
			count++;
			}
		System.out.println("Black Jack! It took " + count + " tries!");
		}
	}



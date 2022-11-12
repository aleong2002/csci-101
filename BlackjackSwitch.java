package hi.java;

public class BlackjackSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int card1 = (int) (Math.random() * 11) + 1;
		System.out.println("The first card is: " + card1);
		
		int card2 = (int) (Math.random() * 11) + 1;
		System.out.println("The second card is: " + card2);
		
		int sum = card1 + card2;
		switch(sum) {
		case 21:
			System.out.println("Black Jack!");
			break;
		default: 
			System.out.println("Maybe next time!");
			break;
		}
	}

}

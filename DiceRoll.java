// extra credit option 2

public class DiceRoll {
	public static void main(String[] args) {
		double one = 0, two = 0, three = 0, four = 0;
		for (int i = 0; i < 1000; i++) {
			int dice = (int) (1 + (Math.random() * 4));
			switch (dice) {
			case 1: one++; break;
			
			case 2: two++; break;
			
			case 3: three++; break;
				
			case 4: four++;
			}
		}
		double done = (one / 10), dtwo = (two /10), dthree =(three /10), dfour = (four/10);
		System.out.printf("1 was rolled %4.2f", done);
		System.out.println("% of times");
		System.out.printf("2 was rolled %4.2f", dtwo);
		System.out.println("% of times");
		System.out.printf("3 was rolled %4.2f", dthree);
		System.out.println("% of times");
		System.out.printf("4 was rolled %4.2f", dfour);
		System.out.println("% of times");

	}

}

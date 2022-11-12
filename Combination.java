
public class Combination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c = 0;
		for (int i = 1; i < 8; i++) {
			for (int j = 1; j < 8; j++) {
				System.out.println(i + " " + j);
				c ++;
			}
		}
		System.out.println("Total number of combinations: " + c);
	}

}


public class DivByThreeOrFour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c = 0;
		for (int i = 100; i <= 1000; i++) {
			if (i % 3 == 0 && i % 4 == 0) {
				c++;
				
				if (c == 10) {
					System.out.println(i);
					c = 0;
				}
				else {
					System.out.print(i + " ");
				}
			}
		}
	}

}

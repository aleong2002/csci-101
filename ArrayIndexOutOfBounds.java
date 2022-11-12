package finalexam;


public class ArrayIndexOutOfBounds {
	public static void main(String[] args) {
		int[] c = new int[5];
		
		try {
			for (int i = 0; i < 5; i++) {
				c[i] = i;
			}
			
			System.out.println(c[5]);
		}
		catch (ArrayIndexOutOfBoundsException x) {
			System.out.println("Index out of bounds");
		}
	}
}
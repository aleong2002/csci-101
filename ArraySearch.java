import java.util.Scanner;

public class ArraySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the length and values of an array: ");
		int length = input.nextInt(), index = -1;
		boolean found = false;
		
		int[] given = new int[length];
		
		for (int i = 0; i <length; i++) {
			given[i] = input.nextInt();
		}
		
		System.out.println("Query: ");
		int query = input.nextInt();
		input.close();
		
		for (int i = 0; i < length; i++) {
			if (given[i] == query) {
				found = true;
				index = i;
			}
		
		}
		if (found) {
			System.out.println("Query is found at index " + index);
		}
		else {
				
			System.out.println("Query not found in array");
		}
	}

}

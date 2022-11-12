import java.util.Scanner;

public class MaxofArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, max = -1209109210;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the length and values of the array: ");
		
		n = input.nextInt();
		
		int[] given_array = new int[n];
		
		for (int i = 0; i < n; i++) {
			given_array[i] = input.nextInt();
		}
		
		input.close();
		
		for (int elem: given_array) {
			if (elem > max) {
				max = elem; 
			}
		}
		System.out.println("The maximum number: " + max );
	}

}

import java.util.Scanner;

public class OneMatrix {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of rows and number of columns: ");
		int rows = input.nextInt(), columns = input.nextInt();
		
		input.close();
		
		int[][] matrix1 = new int[rows][columns];
		
		for (int i = 0; i < rows; i++) {
			for (int c = 0; c < columns; c++) {
				matrix1[i][c] = 1;
				System.out.print(matrix1[i][c] + " ");
			}
			System.out.print("\n");
		}
		
	}

}

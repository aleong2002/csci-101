import java.util.Scanner;

public class AscendingMatrix {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of rows and number of columns: ");
		int rows = input.nextInt(), columns = input.nextInt(), increment = 0;
		int[][] matrix = new int[rows][columns];
		input.close();
		
		for (int i = 0; i < rows; i++) {
			for (int c = 0; c < columns; c++) {
				matrix[i][c] = increment;
				increment++;
				System.out.print(matrix[i][c] + " ");
			}
			System.out.print("\n");
		}
	}
}

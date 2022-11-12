import java.util.Scanner;

public class TransposedMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of rows: ");
		int rows = input.nextInt();
		
		if (rows <= 0) {
			System.out.print("Invalid input");
		}
		
		else {
			System.out.println("Enter the number of columns: ");
			int columns = input.nextInt();
			
			if (columns <= 0) {
				System.out.print("Invalid input");
			} 
			
			else {
				System.out.println("Enter the values");
				int[][] matrix = new int[rows][columns];
				int[][] transpose = new int[columns][rows];
				
				for (int i = 0; i < rows; i++) {
					for(int j = 0; j < columns; j++) {
						matrix[i][j] = input.nextInt();
					}
				}
				System.out.println("The original grid is: ");
				for(int i = 0; i < matrix.length; i++) {
					for(int j = 0; j < matrix[0].length; j++) {
						System.out.print(matrix[i][j] + " ");
					}
					System.out.println();
				}
				
				System.out.println();

				System.out.println("The transposed grid is: ");
				transpose = transposed(matrix);
				for(int i = 0; i < transpose.length; i++) {
					for(int j = 0; j < transpose[0].length; j++) {
						System.out.print(transpose[i][j] + " ");
					}
					System.out.println();
				}
			}
		}
	}
	public static int[][] transposed(int[][] matrix) {
		int[][] transpose = new int[matrix[0].length][matrix.length];
		for(int i = 0; i < transpose.length; i++) {
			for(int j = 0; j < transpose[0].length; j++) {
				transpose[i][j] = matrix[j][i];
			}
		}
		return transpose;
	}

}

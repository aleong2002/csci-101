import java.util.Scanner;

public class RandomMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of rows and number of columns: ");
		int rows = input.nextInt(), columns = input.nextInt();
		
		input.close();
		int[][] matrix = new int[rows][columns];
		
		for (int i = 0; i < rows; i++) {
			for (int c = 0; c < columns; c++) {
				int randnum = (int) (Math.random() * 101);
				matrix[i][c] = randnum;
				System.out.print(matrix[i][c] + " ");
			}
			System.out.print("\n");
		}
	}

}

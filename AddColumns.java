
public class AddColumns {

	public static void main(String[] args) {
		int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		int rows = matrix.length, columns = matrix[0].length;
		
		for (int c = 0; c < columns; c++ ) {
			int sum = 0;
			for (int i = 0; i < rows; i++) {
				sum += matrix[i][c];
				
			}
			System.out.println("Sum: " + sum);
		}
		
	}


}



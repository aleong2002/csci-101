
public class AddRows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		int rows = matrix.length, columns = matrix[0].length;
		
		for (int c = 0; c < rows; c++ ) {
			int sum = 0;
			for (int i = 0; i < columns; i++) {
				sum += matrix[c][i];
				
			}
			System.out.println("Sum: " + sum);
		}
		
	}

}

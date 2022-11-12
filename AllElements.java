
public class AllElements {

	public static void main(String[] args) {
		
		int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		int rows = matrix.length, columns = matrix[0].length, sum = 0;
		
		for (int c = 0; c < columns; c++ ) {
			for (int i = 0; i < rows; i++) {
				sum += matrix[c][i];
			}
		}
		System.out.print("Sum: " + sum);

	}

}

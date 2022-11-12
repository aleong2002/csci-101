public class Sample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] values = {{4, 5, 6, 3}, {8,7,1,2}};
		
		for (int i = 0; i < values.length; i++) {
			java.util.Arrays.sort(values[i]);
			for (int j = 0; j < values[i].length; j++) {
				System.out.print(values[i][j] + " ");
			}
				System.out.println();
			}
		}
	}



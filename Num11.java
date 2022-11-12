package SuppPractice;
import java.util.*;

/* Implement the following method to sort the columns in a two dimensional array.
A new array is returned and the original array is intact.
public static double[][] sortColumns(double[][] m) */

public class Num11 {
	public static double[][] sortColumns(double[][] m) {
		double[][] n = new double[m.length][m[0].length];
		
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				n[i][j] = m[i][j];
			}
		}
		
		for (int i = 0; i < n.length; i++) {
			for (int j = 0; j < n[i].length - 1; j++) {
				double currentMin = n[i][j];
                int minIndex = i;

                for (int row = i + 1; row < n.length; row++) {

                    if (currentMin > n[row][j]) {
                        currentMin = n[row][j];
                        minIndex = row;
                    }
                }
                if (minIndex != i) {
                    n[minIndex][j] = n[i][j];
                    n[i][j] = currentMin;
                }
			}
		}
		return n;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter lengths: ");
		int l = input.nextInt();
		int l2 = input.nextInt();
		double[][] m = new double[l][l2];
		
		for (int i = 0; i < l; i++) {
			for (int j = 0; j< l2; j++) {
				m[i][j] = input.nextDouble();
			}
		}
		
		double[][] n = sortColumns(m);
		for (int i = 0; i < l; i++) {
			for (int j = 0; j< l2; j++) {
				System.out.println(n[i][j]);
			}
		}
	}
}

package SuppPractice;
import java.util.*;
/* Given two matrices perform matrix multiplication and print the result */
public class Num12 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the lengths: ");
		
		int l1 = input.nextInt();
		int l2 = input.nextInt();
		int m1 = input.nextInt();
		int m2 = input.nextInt();
		
		int[][] x = new int[l1][l2];
		int[][] y = new int[m1][m2];
		
		for (int i = 0; i < l1; i++) {
			for (int j = 0; j < l2; j++) {
				System.out.println("Enter x values: ");
				x[i][j] = input.nextInt();
			}
		}
		
		for (int i = 0; i < l1; i++) {
			for (int j = 0; j < m2; j++) {
				System.out.println("Enter y values: ");
				y[i][j] = input.nextInt();
			}
		}
		
		int[][] mult = new int[l1][m2];
		
		for (int i = 0; i < l1 ; i++) {
			for (int j = 0; j < m2; j++) {
				mult[i][j] = 0;
                for (int k = 0; k < l2; k++)
                    mult[i][j] += x[i][k] * y[k][j];
                	System.out.print(mult[i][j] + " ");
            	}
            	System.out.println("");
				
			}
		}
	
}

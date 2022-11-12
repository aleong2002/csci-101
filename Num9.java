package SuppPractice;
import java.util.*;
/* Write the following method that merges two sorted lists into a new sorted list.
public static int[] merge(int[] list1, int[] list2)
Implement the method in a way that takes list1.length + list2.length comparisons.
Write a test program that prompts the user to enter two sorted lists and displays the
merged list.  */

public class Num9 {
	public static int[] merge(int[] list1, int[] list2) {
		int[] x = new int[list1.length + list2.length];
		int c = 0;
		Arrays.sort(list1);
		Arrays.sort(list2);
		
		for (int i = 0; i <list1.length;i++) {
			x[i] = list1[i];
		}
		for (int i = list1.length; i < list1.length + list2.length; i++) {
			x[i] = list2[c];
			c++;
		}
		Arrays.sort(x);
		return x;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] n1 = new int[3];
		int[] n2 = new int[3];
		
		for (int i = 0; i < n1.length; i++) {
			n1[i] = input.nextInt();
		}
		
		for (int i = 0; i < n2.length; i++) {
			n2[i] = input.nextInt();
		}
		int[] v = merge(n1, n2);
		for (int x: v) {
			System.out.println(x);
		}
	}
}

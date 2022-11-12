package SuppPractice;
import java.util.*;
/* Write the following method that partitions the list using the first element, called a
pivot.
public static int partition(int[] list).
After the partition, the elements in the list are rearranged so that all the elements
before the pivot are less than or equal to the pivot and the elements after the pivot
are greater than the pivot. The method returns the index where the pivot is located
in the new list. Write a test program that prompts the user to enter a list and
displays the list after the partition. */

public class Num10 {
	public static int partition(int[] list) {
		int pivot = list[0];
		int ind = 0;
		Arrays.sort(list);
		for (int i= 0; i < list.length; i++) {
			if (list[i] == pivot) {
				ind = i;
			}
		}
		return ind;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter length of list: ");
		try {
			int l = input.nextInt();
			int[] c = new int[l];
			for (int i = 0; i < l; i++) {
				System.out.println("Enter values: ");
				c[i] = input.nextInt();
			}
			
			System.out.println("Partition at index " + partition(c));
			
		}
		catch (InputMismatchException x) {
			
		}
	}

}

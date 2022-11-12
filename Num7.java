package SuppPractice;
/* 7. Write a method that checks whether two strings are anagrams or not.*/
import java.util.*;

public class Num7 {
	public static boolean anagram(String s1, String s2) {
		char[] c1 = new char[s1.length()];
		char[] c2 = new char[s2.length()];

		for (int i = 0; i < s1.length(); i++) {
			c1[i] = s1.charAt(i);
			c2[i] = s2.charAt(i);

		}
		
		Arrays.sort(c1);
		Arrays.sort(c2);
		
		Object[] a1 = {c1};
		Object[] a2 = {c2};
		if (Arrays.deepEquals(a1, a2)) {
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		try {
			String s1 = input.nextLine();
			String s2 = input.nextLine();
			
			System.out.println("Anagram: " + anagram(s1, s2));
		}
		catch (InputMismatchException e) {
			System.out.println("Not a valid String");
		}
		
	}
}

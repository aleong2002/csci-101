import java.util.Scanner;

public class PalindromeInteger {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer: ");
		String num = input.nextLine();
		boolean pal = false;
		String newnum = "";
		int i = 0, j;

		if (num.charAt(0) == '-') {
			newnum = num.substring(1);
			j = newnum.length()- 1;
			while (i < j) {
				if (newnum.charAt(i) == newnum.charAt(j)) {
					i++;
					j--;
				}
				else {
					break;
				}
				if (i==j||i ==j-1) {
					pal = true;
				}
			}
			
		}
		else {
			j = num.length() -1;
			while (i <j) {
				if (num.charAt(i) == num.charAt(j)) {
					i++;
					j--;
				}
				else {
					break;
				}
				if (i==j||i ==j-1) {
					pal = true;
				}
			}
		}
		
		
		
		if (pal) {
			System.out.println(num + " is a palindrome");
		}
		else {
			System.out.println(num + " is not a palindrome");
		}
	}
}

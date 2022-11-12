import java.util.Scanner;

public class DigitSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number: ");
		//long n = input.nextLong();
		int n1 = input.nextInt();
		//System.out.println(sumDigits(n));
		reverse(n1);
	}
	public static int sumDigits(long n) {
		String strn = Long.toString(n);
		int sum = 0;
		for (int i = 0; i < strn.length(); i++) {
			sum += strn.charAt(i) - '0';
		}
		return sum;
	}
	public static void reverse(int n) {
		String rev = "";
		String strn = Integer.toString(n);
		for (int i = strn.length()-1; i >= 0 ; i--) {
			rev += strn.charAt(i);
		}
		System.out.println(rev);
	}
}

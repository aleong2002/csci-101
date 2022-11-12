import java.util.Scanner;

public class StringProcess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 2 strings: ");
		String str1 = input.nextLine(), str2 = input.nextLine();
		System.out.print(check(str1, str2));
		
	}
	public static int process(String str) {
		int length = str.length();
		
		return length;
	}
	public static char charac(String str, int length) {
		char c = str.charAt(length -1);
		return c;
	}
	public static boolean check(String str1, String str2) {
		boolean valid = false;
		
		for (int i = 0; i < str1.length(); i++) {
			if (str2.charAt(0)== str1.charAt(i)) {
				String sub = str1.substring(i, str2.length());
				if (sub.equals(str2 )) {
					valid = true;
				}
			}
		}
		return valid;
	}
}

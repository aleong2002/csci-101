
public class PalPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c = 0;
		for (int i = 2; c < 121; i++) {
			if (Prime(i) && palindrome(i)) {
				c++;
				if ( c % 10 == 0) {
					System.out.println(i);
				}
				else {
					System.out.print(i + " ");
				}
			}
		}
	}
	public static boolean Prime(long n) {
		for (int i = 2; i < n; i++) {
			if( n % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static long reverse(long n) {
		long reverse = 0;
		String strn = Long.toString(n);
		String strreverse = "";
		for (int i = strn.length() -1; i >= 0 ; i--) {
			strreverse += strn.charAt(i);
		}
		reverse = Long.parseLong(strreverse);
		return reverse;
	}
	
	public static boolean palindrome(long n) {
		return (n == reverse(n));
	}
}

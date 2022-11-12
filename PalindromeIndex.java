package finalexam;

public class PalindromeIndex {
	public static boolean isPalindrome(String s) {
		int n = s.length();
		
		for (int i = 0; i < n / 2; i++) {
			if (s.charAt(i) != s.charAt(n - i - 1)) {
				return false;
			}
		}
		return true;
	}
	
	public static int palindromeIndex(String s) {
		int palindromeIndex = -1;
	    int len = s.length();

	    for (int i = 0; i < len / 2; i++) {
	    	if (s.charAt(i) != s.charAt(len - i - 1)) {
	    		if (i + 1 < len) {
	    			boolean isRightStringValidPalindrome = isPalindrome(s.substring(i + 1, len - i));
	    			if (isRightStringValidPalindrome) return i;
	    			return len - i - 1;
	    		}
	    	}
	    }

	    return palindromeIndex;
	  }

		
		
	public static void main(String[] args) {
		System.out.println(palindromeIndex("aaa"));
		System.out.println(palindromeIndex("aabaca"));
		System.out.println(palindromeIndex("caaa"));
	}
}

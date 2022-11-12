package finalexam;

import java.util.Collections;

public class Check {
	
	public static int superDigit(String n, int k) {
	    // Write your code here
		//String rep = String.join("", Collections.nCopies(k, n));

        int len = n.length();
        if (len == 1 && k == 1) {
        	return Integer.valueOf(n);
        }
        long sum = 0;
       
                
        for (int i = 0; i < len; i++) {
        	sum += Character.getNumericValue(n.charAt(i));
        }
        n = String.valueOf(sum);
        len = n.length();
        
       	return superDigit(Long.toString(sum * k), 1);
        
    }
	public static void main(String[] args) {
		
		System.out.println(superDigit("9785", 4));
	}
	
}

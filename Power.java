package finalexam;
import java.math.BigInteger;

public class Power {
	public static int power(int n, int exp) {
		if (exp == 1) {
			return n;
		}
		else if (exp == 0) {
			return 1;
		}
		return n*power(n, exp -1);
	}
	
	public static void main(String[] args) {
		System.out.println(power(2, 4));
	}
}

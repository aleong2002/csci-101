package SuppPractice;
/* Twin primes are a pair of prime numbers that differ by 2. For example, 3 and 5 are
twin primes, 5 and 7 are twin primes, and 11 and 13 are twin primes. Write a
program to find all twin primes less than 1,000. */
import java.util.*;
public class Num8 {
	public static boolean isPrime(int num) {
		if (num <= 2) {
			return false;
		}
		
		else {
			for (int i = 2; i < num; i++) {
				if (num % i == 0) {
					return false;
				}
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		for (int i = 2; i < 1000; i++) {
			if (isPrime(i) && isPrime(i+2)) {
				System.out.println(i + " " + (i+2));
			}
		}
	}
}

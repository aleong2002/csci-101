import java.util.Scanner;

public class AllPrime {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = input.nextInt();
		input.close();
		
		String primestr = "";
		boolean prime = true;

		for (int i = 2; i <= num; i++) {
			prime = true;
			for (int c =2; c <= i/2; c++) {
				if (i % c == 0) {
					prime = false;
					break;
				}
			
			}
			if (prime) {
				primestr += i + " ";
			}
		}
		
		if (num == 1) {
			System.out.println("No prime numbers less than 1");
		}
		else {
			System.out.println("All the prime numbers less than or equal to " + num + " are: ");
			System.out.println(primestr);
		}
	}

}

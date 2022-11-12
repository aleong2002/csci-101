import java.util.Scanner;

public class LowerTriangle {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the size of the matrix: ");
		patternPrinting(input.nextInt());
		input.close();
	}
	public static void patternPrinting(int n) {
		for (int i = 1; i <= n; i++) {
			System.out.println("1 ".repeat(i));
		}
	}
}

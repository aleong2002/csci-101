import java.util.Scanner;

public class UpperTriangle {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the size of the matrix: ");
		patternPrinting(input.nextInt());
		input.close();
	}
	public static void patternPrinting(int n) {
		int x = 0;
		for (int i = n; i >= 1; i--) {  
			
			System.out.print("  ".repeat(x));
			System.out.println("1 ".repeat(i));	
			x++;
		}  
		
	}
}  
	
				

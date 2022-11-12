import java.util.Scanner;

public class HextoBi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		System.out.println("Enter Hex: ");
		
		String c = input.nextLine();
		char cchar = c.charAt(0);
		
		if (Character.digit(cchar, 16) != -1) {
			String bin = Integer.toBinaryString(cchar);
			System.out.println("The Binary output is " + bin);
		}
		else {
			System.out.println(c + " is not a valid input");
		}
	}

}

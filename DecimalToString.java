import java.util.Scanner;

public class DecimalToString {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a decimal number: ");
		
		int idecimal = input.nextInt();
		input.close();
		
		String decstring = "";
		
		while (idecimal > 0) {
			char ch = (char) ((idecimal % 10) + '0');
			idecimal = idecimal /10;
			decstring = ch + decstring;
		}
		System.out.println(" --> '" + decstring +"'");
	
	
	}

}

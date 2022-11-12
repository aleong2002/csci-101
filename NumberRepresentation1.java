import java.math.BigInteger;
import java.util.Scanner;

public class NumberRepresentation1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Scanner input2 = new Scanner(System.in);
		System.out.println("Hello, choose your input format!"
				+ "\n\t1. Binary "
				+ "\n\t2. Decimal "
				+ "\n\t3. Hexadecimal");
		
		int choice = input.nextInt();
		
		System.out.println("Enter the number: ");
		String number = input2.nextLine();
		int length = number.length();
		boolean valid = false;
		switch (choice) {
		case 1: // binary
			
			if (number.charAt(0) == '0') {
				if (number.charAt(1) == 'B' || number.charAt(1) == 'b') {
					valid = number.substring(2).matches("[0-1]+");

					if (valid) {
						System.out.println("Choose your output format! \n1. Decimal \n2. Hexadecimal");
						int output = input.nextInt();
							
						switch (output) {
						case 1:
							int decimal = Integer.parseInt(number.substring(2), 2);
							System.out.printf("The Binary number in Decimal format is %d\n", decimal);
							break;
						case 2:
							decimal = Integer.parseInt(number.substring(2), 2);
							System.out.printf("The Binary number in Hexadecimal format is %X\n", decimal);
						}
						
						
					}
				else {
					System.out.println("Not a binary number. Exiting...");
				}
				
			}
			else {
				System.out.println("Not a binary number. Exiting...");
				}
			break;
			}
		case 2: //decimal 
			if ( number.charAt(0) >= '1' && number.charAt(0) <= '9') {
				for (int i = 1; i < length; i++) {
					if (number.charAt(i) >= '1' && number.charAt(i) <= '9') {
						valid = true;
					}
					else {
						valid = false;
						System.out.println("Not a decimal number. Exiting...");
						break;
					}
				}
				if (valid) {
					System.out.println("Choose your output format! \n1. Binary \n2. Hexadecimal");
					int output = input.nextInt();
						
					switch (output) {
					case 1:
						int decimal = Integer.parseInt(number);
						String binary = Integer.toBinaryString(decimal);
						System.out.println("The Decimal number in Binary format is " + binary);
						break;
					case 2:
						decimal = Integer.parseInt(number);
						System.out.printf("Hexadecimal: %X\n", decimal); 
					}
					
				}
				}
			else {
				System.out.println("Not a decimal number. Exiting...");
			}
			break;
		case 3: // hexadecimal
				
			if (number.charAt(0) == '0') {
				/* Second character equal to ’x’ or ’X’ implies that it is a hexadecimal number. 
				 * The remaining symbols should be digits 0-9, and characters A-F (or a-f).
				 */
				if (number.charAt(1) == 'x' || number.charAt(1) == 'X') {
					valid = number.substring(2).matches("[0-9A-Fa-f]+");

						/*for (int i = 2; i < length; i++) {
							
				 			if ((int)number.charAt(i) >= 0 && (int)number.charAt(i) <= 9) {
								valid = true;
							}
							else if ((int) number.charAt(i) >= 'a' && (int) number.charAt(i) <= 'f') {
								valid = true;
							}
							else if ((int) number.charAt(i) >= 'A' && (int) number.charAt(i) <= 'F') {
								valid = true;
							}
							else {
								valid = false;
								System.out.println("Not a hexadecimal number. Exiting...");
								break;
							} 
						}*/
					if (valid) {
						System.out.println("Choose your output format \n1. Binary \n2. Decimal");
						int output = input.nextInt();
						switch (output) {
							case 1: //to binary
								String binary = new BigInteger(number.substring(2), 16).toString(2);
								System.out.println("The Hexadecimal number in Binary format is " + binary);
								break;
							case 2: // to decimal
								int decimal = Integer.parseInt(number.substring(2), 16);
									
								System.out.printf("The Hexadecimal number in Decimal format is %d\n", decimal);
						}
					}
				}
				else {
					System.out.println("Not a hexidecimal number. Exiting...");
				}
				
			}
			else {
				System.out.println("Not a hexadecimal number. Exiting...");
				}
			}
			input.close();
			input2.close();
		}	
	}


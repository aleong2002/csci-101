package hi.java;
import java.util.Scanner;

public class SortedNamesLoop {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		
		System.out.print("Enter two names: ");
		
		String name1 = input.nextLine();
		String name2 = input.nextLine();
		
		input.close();
		int count = 0;
		
		boolean continueLoop = true;
		
		while (continueLoop) {
			if (name1.charAt(count) < name2.charAt(count)) {
				System.out.println(name1 + ", " + name2);
				continueLoop = false;
			}
			else if (name1.charAt(count) > name2.charAt(count)) {
				System.out.println(name2 + ", " + name1);
				continueLoop = false;
			}	
			else if (name1.charAt(count)== name2.charAt(count)) {
				if ((count + 1)  == name1.length()) {
					System.out.println(name1 + ", " + name2);
					continueLoop = false;
				}
				else if ((count + 1) == name2.length()) {
					System.out.println(name2 + ", " + name1);
					continueLoop = false;
				}
				
				else{
					count++;
				}
			}
			
			
		}
		
	}

}

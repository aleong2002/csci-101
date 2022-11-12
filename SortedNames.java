package hi.java;

import java.util.Scanner;

public class SortedNames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter two names: ");
		
		String name1 = input.nextLine();
		String name2 = input.nextLine();
		
		input.close();
		
		if (name1.compareTo(name2) < 0) {
			System.out.println(name1 + ", " + name2);
		}
		else {
			System.out.println(name2 + ", " + name1);
		}
	}

}

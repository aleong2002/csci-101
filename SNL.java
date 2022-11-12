package finalexam;

import java.util.*;
public class SNL {
	public static String answer(String n){
		if (n.equalsIgnoreCase("yes")) {
			return "Yay! Thank you so much!";
		}
		else {
			return "Are you sure?";
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String n = " ";
		while (!n.equalsIgnoreCase("yes")) {
			System.out.println("Should Athena Leong get SNL tickets?");
			n = input.nextLine();
			System.out.println(answer(n));
		}
		
	}


}

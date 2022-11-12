package hi.java;

import java.util.Scanner;

public class AdditionQuiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int num1 = (int) (Math.random() * 10) +1, num2 = (int) (Math.random() * 10) + 1, guess = -12;
		
		
		
		int sum = num1 + num2;
		
		while (guess != sum) {
			
			System.out.print("What is " + num1 + " + " + num2 + "? ");
			guess = input.nextInt();
			if (guess != sum) {
				System.out.println(num1 + " + " + num2 + " = " + guess + " is false");
			}
		}
		input.close();
		System.out.println(num1 + " + " + num2 + " = " + sum + " is true");
	
	}
	
}

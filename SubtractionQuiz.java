package hi.java;

import java.util.Scanner;

public class SubtractionQuiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int num1 = (int) (Math.random() * 10) + 1, num2 = (int) (Math.random() * 10) + 1;
		
		if (num1 < num2) {
			int temp = num1;
			num2 = temp;
			num1 = num2;
		}
		
		System.out.print("What is " + num1 + " - " + num2 + "? ");
		int guess = input.nextInt();
		int result = num1 - num2;
		
		if (guess == result) {
			System.out.println(num1 + " - " + num2 + " = " + result + " is true!");
		}
		else {
			System.out.print(num1 + " - " + num2 + " = " + guess + " is false! The correct");
			System.out.println(" answer is " + result);
		}
		
	}

}

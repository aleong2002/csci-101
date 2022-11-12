
package hi.java;
import java.util.Scanner;

public class HIghestScore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of students: ");
		
		int num = input.nextInt(), max = -1;
		String maxstud = "";
		for (int i = 0; i < num; i++) {
			System.out.println("Enter student and score: ");
			String student = input.next();
			int score = input.nextInt();
			
			if (score > max) {
				max = score;
				maxstud = student;
			}
			
		}
		System.out.println(maxstud + " has the highest score of " + max);
	}

}

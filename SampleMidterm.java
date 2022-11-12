import java.util.Scanner;

public class SampleMidterm {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Scanner input2 = new Scanner(System.in);
		Scanner input4 = new Scanner(System.in);

	Scanner input3 = new Scanner(System.in);
	System.out.println("How many students? ");
	int num = input.nextInt();
	
	String[][] x = new String[num][3];
	
	for (int i = 0; i < num; i++) {
		System.out.println("Name, ID, Class: ");
		x[i][0] = input2.nextLine();
		x[i][1] = input3.nextLine();
		x[i][2] = input4.nextLine();
		
		
	}
	for (int j = 0; j < num; j++) {
		for (int i = 1; i < num - 1; i++) {
			if (x[j] == x[i]) {
				System.out.println(x[j][0] + " " + x[j][1] + " " + x[j][2]);
				continue;
			}
		}
	}
		
		
		
		

	}
}
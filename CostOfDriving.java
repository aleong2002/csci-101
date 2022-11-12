import java.util.Scanner;

public class CostOfDriving {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter driving distance: ");
		System.out.println("Enter miles per gallon: ");
		System.out.println("Enter price per gallon: ");
		
		double distance = input.nextDouble(), miles = input.nextDouble(), price = input.nextDouble();
		input.close();
		
		System.out.print("The cost of driving: $");
		System.out.printf("%4.2f%n", distance / miles * price);
	}
}

package midterm2.java;
import java.util.Scanner;

public class Mainn {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Scanner input2 = new Scanner(System.in);
		Scanner input3 = new Scanner(System.in);

		System.out.println("Select mail type: (1)Birthday Card, (2)Postcard, (3)Bill, (4)Check ");
		int choice = input.nextInt();
		
		System.out.println("Enter name: ");
		String name = input2.nextLine();
		System.out.println();
		System.out.println("Enter address:");
		String address = input3.nextLine();
		
		double amount;
		
		switch (choice) {
			case 1:
				BirthdayCard x = new BirthdayCard(name, address);
				x.send(name, address);
				break;
				
			case 2:
				System.out.println("Enter your message: ");
				String message = input.nextLine();
				Postcard p = new Postcard(name, address, message);
				p.send(name, address);
				break;
				
			case 3:
				System.out.println("Enter amount to send:");
				amount = input.nextDouble();
				Bill b = new Bill(name, address, amount);
				b.send(name, address);
				break;
				
			case 4:
				System.out.println("Enter amount to send: ");
				amount = input.nextDouble();
				Check v = new Check(name, address, amount);
				v.send(name, address);
		}
			
		input.close();
	}
}

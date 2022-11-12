package midterm2.java;

import java.util.Scanner;

public class PhoneBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person[] contacts = new Person[1000];
		boolean valid = true;
		
		while(valid) {
			System.out.println("Choose an operation: "
					+ "(1) Find person, "
					+ "(2) Add person, "
					+ "(3) Remove person");
			Scanner input = new Scanner(System.in);
			
			int choice = input.nextInt();
			
			switch(choice) {
				case 1: 
					find(contacts); break;
				
				case 2: 
					add(contacts); 
					break;
				
				case 3:
					remove(contacts); 
					valid = false;
	
			}
		}
	}
	public static void add(Person[] contacts) {
		Scanner input1 = new Scanner(System.in);
		System.out.println("Enter first name: ");
		String FirstName = input1.nextLine();
		System.out.println("Enter last name: ");
		String LastName = input1.nextLine();
		System.out.println("Enter address: ");
		String Address = input1.nextLine();
		System.out.println("Enter phone number: ");
		int PhoneNumber = input1.nextInt();
		
		Person person = new Person(FirstName, LastName, Address, PhoneNumber);
		
		int i = 0;
		while (i < contacts.length) {
			if (contacts[i] == null) {
				contacts[i] = person;
				break;
			}
			else {
				i++;
			}
		}
		System.out.println(FirstName + " " + LastName + " added to Contacts");
	
	}
	
	public static String find(Person[] contacts) {
		Scanner input2 = new Scanner(System.in);
		
		System.out.println("Enter first and last name: ");
		String FirstName = input2.nextLine(), LastName = input2.nextLine();
		
		String Address = "";
		int number = 0;
		int i = 0;
		while (i < contacts.length) {
			if (FirstName.equals(contacts[i].getFirstName()) && LastName.equals(contacts[i].getLastName())) {
				Address = contacts[i].getAddress();
				number += contacts[i].getPhoneNumber();
				break;
			}
			else {
				i++;
			}
		}
		if (Address.equals("") && number == 0) {
			System.out.println("This contact doesn't exist");

		}
		else {
			System.out.println("The address is " + Address);
			System.out.println("The phone number is " + number);
		}
		return Address;
	}
	
	public static void remove(Person[] contacts) {
		Scanner input3 = new Scanner(System.in);
		System.out.println("Enter first and last name: ");
		String FirstName = input3.nextLine(), LastName = input3.nextLine();


		int i = 0;
		while (i < contacts.length) {
			if (contacts[i].getFirstName().equals(FirstName) && contacts[i].getLastName().equals(LastName)) {
				contacts[i].setFirstName(null);
				contacts[i].setLastName(null);
				contacts[i].setAddress(null);
				contacts[i].setPhoneNumber(0);
				System.out.println("Contact has been removed");
				break;
			}
			else {
				i++;
			}
		}
		if (i == 1000) {
			System.out.println("Contact doesn't exist");
		}
	}

}

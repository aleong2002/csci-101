
import java.util.Scanner;

public class Book {
	protected long isbn;
	protected String author;
	protected String title;
	
	public Book() {
		
	}
	
	public Book(String author, String title, long isbn) {
		this.author = author;
		this.title = title;
		this.isbn = isbn;
	}
	
	public String getAuthor() {
		return this.author;
	}
	
	public String getTitle() {
		return this.title;
	}
	
	public long getISBN() {
		return this.isbn;
	}
	
	public static void addBooks() throws IllegalArgumentException{
		Scanner input1 = new Scanner(System.in);
		Scanner input2 = new Scanner(System.in);
		Scanner input3 = new Scanner(System.in);
		
		System.out.println("Enter author: ");
		String a = input1.nextLine();
		System.out.println("Enter title: ");
		String t = input2.nextLine();
		System.out.println("Enter ISBN: ");
		String i = input3.nextLine();
		boolean done = false;
		long l = 0;
		
		while (!done) {
			try {
				l = Long.valueOf(i);
				done = true;
			}
				
			catch (Exception x) {
				System.out.println("Not a valid ISBN");
				System.out.println("Enter ISBN: ");
				i = input3.nextLine();
			}
		}
		
		Book x = new Book(a, t, l);
		
	}
	
	public static void main(String[] args) throws IllegalArgumentException {
		Scanner input = new Scanner(System.in);
		
		boolean cont = true;
		
		while (cont) {
			System.out.println("Enter your choice");
			System.out.println("1. Add Book");
			System.out.println("2. Exit");
			int choice = input.nextInt();
			
			switch (choice) {
			case 1:
				
				addBooks();
				
				break;
				
			case 2:
				cont = false;
			}
		}
	} 
}

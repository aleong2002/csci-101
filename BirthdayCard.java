package midterm2.java;

public class BirthdayCard extends Card{
	
	public BirthdayCard() {
		super();
		super.message = "Happy birthday";
	}
	
	public BirthdayCard(String name, String address, String message) {
		super(name, address, message);
	}
	
	public BirthdayCard(String name, String address) {
		super(name, address, "Happy Birthday");
	}
	
	public void send(String name, String address) {
		System.out.println("Sending birthday wishes to " + this.name + " with address at: " + this.address);
	}
}

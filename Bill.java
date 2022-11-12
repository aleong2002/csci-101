package midterm2.java;

public class Bill extends Form {
	public Bill() {
		super();
	}
	
	public Bill(String name, String address, double amount) {
		super(name, address, amount);
	}
	
	public void send(String name, String address) {
		System.out.println("Sending " + super.getAmount() + " to " + this.name + " who lives at: " + this.address);
	}
}

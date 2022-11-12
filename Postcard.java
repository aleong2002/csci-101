package midterm2.java;

public class Postcard extends Card{
	public Postcard() {
		
	}
	
	public Postcard(String name, String address, String message) {
		super(name, address, message);
	}
	
	public void send(String name, String address) {
		System.out.println("Sending postcard to " + this.name + " with address at: " + this.address);
	}
}

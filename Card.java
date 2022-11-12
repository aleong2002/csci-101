package midterm2.java;

public abstract class Card extends Mail {
	protected String message;
	
	public Card() {
		super();
	}
	
	public Card(String name, String address, String message) {
		super(name, address);
		this.message = message;
	}
	
	public void fill(String message) {
		this.message = message;
	}
	
	public String getMessage() {
		return this.message;
	}
	
	public abstract void send(String name, String address);
	
	
}

package midterm2.java;

public abstract class Form extends Mail{
	private double amount;
	
	public Form() {
		super();
	}
	
	public Form(String name, String address, double amount) {
		super(name, address);
		this.amount = amount;
	}
	
	public void fill(double amount) {
		this.amount = amount;
	}
	
	public double getAmount() {
		return this.amount;
	}
	
	public abstract void send(String name, String address);
}

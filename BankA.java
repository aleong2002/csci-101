package midterm2.java;

public class BankA extends Bank{
	protected int deposit = 100;
	
	public BankA() {
		super();
	}
	
	public BankA(int deposit) {
		this.deposit = deposit;
	}
	
	@Override
	public int getBalance() {
		return this.deposit;
	}
}

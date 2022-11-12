package midterm2.java;

public class BankC extends Bank{
	protected int deposit = 200;
	
	public BankC() {
		
	}
	
	public BankC(int deposit) {
		this.deposit = deposit;
	}
	
	@Override
	public int getBalance() {
		return this.deposit;
	}
}

package midterm2.java;

public class BankB extends Bank{
	protected int deposit = 150;
	
	public BankB() {
		
	}
	
	public BankB(int deposit){
		this.deposit = deposit;
	}
	
	@Override
	public int getBalance() {
		return this.deposit;
	}
}

package midterm2.java;

public class CheckingAccount extends Accountt{
	private double overdraft = -500;
	
	public CheckingAccount() {
		super();
	}
	
	public CheckingAccount(String name, double balance) {
		super(balance, name);
	}
	
	@Override
	public double withdraw(double money) {
		if( money >= 0 && (super.balance - money >= overdraft)) {
			super.balance -= money;
			return super.balance;
		}
		
		return 0;
	}
}

package midterm2.java;

public abstract class Mail implements MailTemplate{
	protected String name;
	protected String address;
	
	public Mail() {
		this.name = "Jeno";
		this.address = "Rubin Hall";
	}
	public Mail(String name, String address) {
		this.name = name;
		this.address = address;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getAddress() {
		return this.address;
	}
	
	@Override
	public abstract void send(String name, String address);
}

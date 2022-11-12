package midterm2.java;

public abstract class Animall {
	protected String name;
	protected int numLegs;
	
	abstract void eat();
	abstract void sleep();
	
	public Animall() {
		
	}
	
	public Animall(String name, int numLegs) {
		this.name = name;
		this.numLegs = numLegs;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setNumLegs(int numLegs) {
		this.numLegs = numLegs;
	}
	
	public int getNumLegs() {
		return this.numLegs;
	}
}
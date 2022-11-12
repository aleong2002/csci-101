package midterm2.java;

public class Sheep extends Animall {
	
	
	public Sheep() {
		super("Sheep", 4);
	}
	
	public Sheep(String name, int numLegs) {
		super(name, numLegs);
	}
	
	@Override
	public void eat() {
		System.out.println("Sheep is eating.");

	}
	
	@Override
	public void sleep() {
		System.out.println("Sheep is sleeping.");
	}
	
	public void setName(String name) {
		this.name = "sheep";
	}
}
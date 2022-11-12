package midterm2.java;

public class Truck extends Vehiclee{
	protected int capacity;

	public Truck() {
	super();
	}

	public Truck(String model){
	super(model);
	}

	public Truck(String model, int capacity){
	super(model);
	this.capacity = capacity;
	}

	public void setCap(int capacity){
	this.capacity = capacity;
	}

	public int getCap(){
	return this.capacity;
	}

	@Override
	public void go(){
	System.out.println("Go.");
	}

	@Override
	public void stop(){
	System.out.println("Stop.");
	}

	public void ride() {
	System.out.println("Riding.");
	}

	public void load(){
	System.out.println("Loading.");
	}

}

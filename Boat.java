package midterm2.java;

public class Boat extends Vehiclee{
	protected boolean sailsopen;

	public Boat(){
	super();
	}

	public Boat(String model){
	super(model);
	}

	public Boat(String model, boolean sailsopen){
	super(model);
	this.sailsopen = sailsopen;
	}

	public void setSail(boolean sailsopen) {
	this.sailsopen = sailsopen;
	}

	public boolean getSail(){
	return this.sailsopen;
	}

	@Override
	public void go(){
	System.out.println("Go.");
	}

	@Override
	public void stop(){
	System.out.println("Stop.");
	}

	public void sail(){
	System.out.println("Sailing.");
	}

	public static void main(String[] args) {
	Carr c = new Carr("Honda");
	Truck t = new Truck("Toyota", 6);
	Boat b = new Boat("Azimuth", true);
	c.go();
	t.load();
	b.sail();
	}
}

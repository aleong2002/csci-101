package midterm2.java;

public class Herd extends Sheep {
	private int numSheep;
	private Sheep[] x;
	private String destination;
	
	public Herd() {
		
	}
	
	public Herd(int numSheep, String destination) {
		this.numSheep = numSheep;
		this.destination = destination;
		
		x = new Sheep[numSheep];
		for (int i = 0; i < numSheep; i++) {
			Sheep c = new Sheep();
			x[i] = c;
		}
	}
	
	public void setNumOfSheep(int numSheep) {
		this.numSheep = numSheep;
	}
	
	public int getNumOfSheep() {
		return this.numSheep;
	}
	
	public void setDestination(String destination) {
		this.destination = destination;
	}
	
	public String getDestination() {
		return this.destination;
	}
	
	public void addSheep() {
		setNumOfSheep(getNumOfSheep() + 1);
		x = new Sheep[getNumOfSheep()];
		
		for (int i = 0; i < numSheep; i++) {
			Sheep c = new Sheep();
			x[i] = c;
		}
		
		System.out.println("Sheep added to herd");
	}
	
	public void removeSheep() {
		setNumOfSheep(getNumOfSheep() - 1);
		x = new Sheep[getNumOfSheep()];
		
		for (int i = 0; i < numSheep; i++) {
			x = new Sheep[getNumOfSheep()];
			Sheep c = new Sheep();
			x[i] = c;
		}
		
		System.out.println("Sheep removed from herd");
	}
	
	public void goOut() {
		System.out.println("Going out with " + getNumOfSheep() + " sheep to " + getDestination());
	}
	
	public static void main(String[] args) {
		Herd n = new Herd(5, "Maui");
		n.goOut();
		
		n.addSheep();
		n.setDestination("Everest");
		n.goOut();
		
		n.removeSheep();
		n.goOut();
	}
}
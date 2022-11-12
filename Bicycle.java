package midterm2.java;

public class Bicycle implements Vehicle{

	
	public Bicycle() {
		
	}
	
	public void start() {
		System.out.println("Start pedaling");
	}
	public void stop() {
		System.out.println("Squeeze the  brakes");
	}
	
	public void accelerate() {
		System.out.println("Pedal faster!");
	}
}

package midterm2.java;

public class Carr extends Vehiclee{
	public Carr() {
		super();
		}

		public Carr(String model){
		super(model);
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
}

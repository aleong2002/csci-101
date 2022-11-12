package midterm2.java;
import java.util.Random;

public class RNG {
	
	public static void generate(){
		Random randnum = new Random();
		
		for(int i = 0; i < 10; i++) {
			System.out.print(randnum.nextInt(1000) + " ");
		}
	}
	public static void main(String[] args) {
		generate();
	}
}

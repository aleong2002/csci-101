import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.IOException;

public class ReadBooks {
	
	
	public static void readCSV(File f) throws IOException {
		f.setReadable(true);
		
		Scanner y = new Scanner(f);
		//y.useDelimiter("\n");

		while (y.hasNextLine()) {
			String l = y.nextLine();
			System.out.println(l);
		}
		
	}
	public static void main(String[] args) throws IOException{
		File f = new File("C:/Users/aleon/eclipse-workspace/hi.java/src/Books.txt.txt");

		try {
			readCSV(f);
		}
		catch (FileNotFoundException x) {
			System.out.println("File not found. Please check the file name.");
			x.printStackTrace();
		}
		
	}
}

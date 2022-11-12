package finalexam;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Files {
	public static void main(String[] args) throws FileNotFoundException {
		File f = new File("src/file.txt");
		
		try {
			read(f);
		}
		
		catch (FileNotFoundException ex) {
			System.out.println("File not found");
		}
	}
	
	public static void read(File f) throws FileNotFoundException {
		Scanner input = new Scanner(f);
		
		while (input.hasNext()) {
			String line = input.nextLine();
			System.out.println(line);
		}
	}
}

package finalexam;
import java.io.File;
import java.util.Date;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class FileIO {
	
	public static void createFile(File f, String path) {		
		System.out.println("File size: " + f.length());
		System.out.println("File path: " + f.getParent());
		System.out.println("File name: " + f.getName());
		System.out.println("The file is last updated at: " + new Date (f.lastModified()));
		System.out.println("The file read/write/executable permissions are: " + f.canRead() + " " + f.canWrite() + " " + f.canExecute());
	}
	
	
	public static void writeLines(File f) throws IOException{
		f.setWritable(true);
		FileWriter x = new FileWriter(f, true);

		Scanner in = new Scanner(System.in);
		System.out.println("Enter text: ");
		String txt = in.nextLine();
		x.write(txt +"\n");
		x.close();
	}
	
	public static void readLines(File f) throws IOException{
		f.setReadable(true);
		
		Scanner y = new Scanner(f);
		
		while (y.hasNextLine()) {
			String l = y.nextLine();
			System.out.println(l);
		}
	}
	
	public static void readTokens(File f) throws IOException {
		Scanner input = new Scanner(f);
		ArrayList<Object> c = new ArrayList<Object>();
		
		while (input.hasNext()) {
			String token = input.next();
			c.add(token);
		}
	}
	
	public static void readCSV(File f) throws IOException {
		Scanner input = new Scanner(f);
		input.useDelimiter(",");
		while (input.hasNext()) {
			String line = input.next();
			System.out.println(line);
			
		}
		
	}
	
	
	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter path: ");
		String path = input.nextLine();
		File f = new File(path);
		
		createFile(f, path);
		writeLines(f);
		writeLines(f);
		
		try {
			readCSV(f);
		}
		catch (IOException ex) {
			System.out.println("Error");
		}
		
	}
	
}

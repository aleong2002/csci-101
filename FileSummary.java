package finalexam;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;
// (Count characters, words, and lines in a file) Write a program that will count
// the number of characters, words, and lines in a file. Words are separated by
// whitespace characters. The file name should be passed as a command-line
// argument
public class FileSummary {
	
	public static int readInFile(String line, File f) throws IOException{
		int count = 0;
		Scanner input = new Scanner(f);
		while (input.hasNext()) {
			count++;
       	 	String s = input.nextLine();
       	 	if (s.startsWith(line)) {
       	 		return count; 
       	 	}
            
        }
		return -1;
	}
	
	
	
	public static void main(String[] args) throws IOException{
		 
	     
	     File filename = new File("src/file.txt");
	     if (!filename.exists()) {
	    	 System.out.println(filename + " does not exist.");
	         System.exit(2);
	     }

	     int characters = 0;
	     int words = 0;
	     int lines = 0;

	     try {
	         Scanner input = new Scanner(filename);
	         while (input.hasNext()) {
	        	 String s = input.nextLine();
	             lines++;
	             characters += s.length();
	             String[] split = s.split(" ");
	             for (String word : split) {
	            	 words++;
	             }
	         }

	     } 
	     catch (FileNotFoundException ex) {
	         ex.printStackTrace();
	     }

	     System.out.println("Characters: " + characters);
	     System.out.println("Words: " + words);
	     System.out.println("Lines: " + lines);
	}
}

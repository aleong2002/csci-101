import java.util.Scanner;

public class NeedleInAHaystack {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String needle = "", haystack = "", valid;
		System.out.println("Enter haystack and needle: ");
		haystack = input.nextLine().toLowerCase();
		needle = input.nextLine().toLowerCase();
		
		input.close();
		
		if (needle == "") {
			
			valid = "0";
		}
		
		else if (haystack.contains(needle)) {
			valid = Integer.toString(haystack.indexOf(needle));
		}
		else {
			valid = "-1";
		}
		System.out.println("Output: " + valid);
	}

}

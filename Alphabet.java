
public class Alphabet {

	public static void main(String[] args) {
		char[] alphonso = new char[26];
		
		for (int i = 0; i < 26; i++) {
			alphonso[i] = (char)('a' + i); 
		}
		System.out.println("The alphabet is: ");
		System.out.println(alphonso);
	}	

}

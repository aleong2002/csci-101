package midterm2.java;

public class MyCharacter {
	private char ch;
	
	public MyCharacter(char ch) {
		this.ch = ch;
	}
	
	public void setChar(char ch) {
		this.ch = ch;
	}
	
	public char getChar() {
		return this.ch;
	}
	
	public boolean isDigit(char ch) {
		return this.ch <='9' && this.ch >= '0';
	}
	
	public boolean isUppercase(char ch) {
		return this.ch <='Z' && this.ch >='A';
	}
	
	public boolean isLowercase(char ch) {
		return this.ch <= 'z' && this.ch >= 'a';
	}
	
	public boolean isLetter(char ch) {
		return (this.ch <='Z' && this.ch >='A') && (this.ch <= 'z' && this.ch >= 'a');
	}
	
	public boolean isLetterOrDigit(char ch) {
		return isLetter(ch) || isDigit(ch);
	}
	
	public char toUppercase() {
		if(isLetter(ch)) {
			return (char) (ch - 'a' + 'A');
		}
		else {
			return ch;
		}
	}
	
	public char toLowercase() {
		if(isLetter(ch)){
			return (char)(ch - 'A' + 'a');
		}
		else {
			return ch;
		}
	}
	
	public boolean isDigit() {
		return isDigit(ch);
	}
	
	public boolean isLetter() {
		return isLetter(ch);
	}
	
	public boolean equals(MyCharacter ch) {
		return this.ch == ch.getChar();
	}
	
	public int compareTo(MyCharacter ch) {
		return this.ch - ch.getChar();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

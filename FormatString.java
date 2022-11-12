
public class FormatString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(format(24, 5));
	}
	public static String format(int n, int w) {
		String strn = Integer.toString(n);
		String newstr = "";
		if (strn.length() >= w) {
			return strn;
		}
		else {
			for (int i = 0; i < (w-strn.length()); i++) {
				newstr += "0";
			}
			newstr += strn;
			return newstr;
		}
	}
}


public class NineAdjacent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		nineadjacent("7316717653133062491922511967442657474235534919493496983520312774\n"
				+ "5063262395783180169848018694788518438586156078911294949545950173\n"
				+ "7958331952853208805511125406987471585238630507156932909632952274\n"
				+ "4304355766896648950445244523161731856403098711121722383113622298\n"
				+ "9342338030813533627661428280644448664523874930390729629049156044\n"
				+ "0772390713810515859307960866701724271218839987979087922749219016\n"
				+ "9972088809377665727333001053367881220235421809751254540594752243\n"
				+ "5258490711670556013604839586446706324415722155397536978179778461\n"
				+ "7406495514929086256932197846862248283972241375657056057490261407\n"
				+ "9729686524145351004748216637048440319989");
	}
	public static void nineadjacent(String num) {
		
		int maxproduct = 0;
		String maxnine ="";
		
		for (int i = 0; i < (num.length()-8); i++) {
			String strnine = "";
			//product = 1;
			for (int j=i; j < (i+9); j++) {
				strnine += num.charAt(j);
				if (j == (i+8)) {
					int product = (int)strnine.charAt(0) -'0';
					for (int z = 1; z < strnine.length(); z++) {
						product *= (int)strnine.charAt(z) - '0';
					}
					if (product > maxproduct) {
						maxproduct = product;
						maxnine = strnine;
					}
				}
			}
		}
		System.out.println( maxproduct);
	}
}

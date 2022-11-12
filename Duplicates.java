package finalexam;

public class Duplicates {
	public static int duplicates(int[] args) {
		if (args.length < 2) {
			return args.length;
		}
		
		int i = 0;
		int j = 1;
		
		while (i < args.length) {
			if (args[j] != args[i]) {
				j++;
				args[j] = args[i];
			}
			i++;
		}
		return j+i;
		
	}
}

import java.util.Scanner;

public class Mode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the length and values of the array: ");
		int length = input.nextInt();
		
		if (length <= 0) {
			System.out.println("Invalid input");
		}
		
		else {
			int[] nums = new int[length];
			for (int i = 0; i < length; i++) {
				nums[i] = input.nextInt();
			}
			System.out.println("The mode is " + mode(nums));
		}
	}
	public static int mode(int[] nums) {
		int mode = 0, maxcount = -1;
		
		for(int i = 0; i < nums.length; i++) {
			int check = nums[i];
			int count = 0;
			for(int x: nums) {
				if (check == x) {
					count += 1;
				}
			}
			if (count > maxcount) {
				mode = check;
				maxcount = count;
			}
		}
		return mode;
	}

}

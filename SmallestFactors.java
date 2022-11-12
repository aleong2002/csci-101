import java.util.Scanner;

public class SmallestFactors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = input.nextInt();
		
		for(int j = 2; j <= num; j++){ // start dividing from 2
		    if(num%j==0){
		        System.out.println(j);
		        num/=j; // divide a with j (there is remainder 0 because of condition)
		        j--; // do j once more
		    }
		}
	}

}

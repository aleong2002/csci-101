package finalexam;
import java.util.*;

public class CoinChange {
	public static int coinChange(int[] coins, int num) {
		int w = 0;
		
		if (num == 0) {
			return 1;
		}
		
		//base case
		for (int coin: coins) {
			
			if (num >= coin) {
				w+= coinChange(coins, num - coin);
			}
			
		}
		return w;
				
	}
	
	public static int coinUnique(int[] coins, int n, int num) {
		if (num == 0) {
			return 1;
		}
		
		if  (n < 0 | num < 0) {
			return 0;
		}
		
		int coin = coins[n];
		return coinUnique(coins, n, num-coin) + coinUnique(coins, n-1, num);
		
	}
	
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] coins = new int[3];
		for (int i = 0; i < coins.length; i++) {
			coins[i] = input.nextInt();
		}
		
		System.out.println(coinChange(coins, 3));
		
	}
}

package com.medium;

import java.util.Arrays;

public class Qn322_CoinChange {

	public static void main(String[] args) {
		
		System.out.println(coinChange(new int[] {1,2,5}, 11));

	}
	
	public static int coinChange(int[] coins, int amount) {
		int[] dp = new int[amount+1];
		Arrays.fill(dp, amount + 1); // fill up all the dp with exceed amount
		dp[0] = 0;
		
		for(int i=0; i<=amount; i++) {
			for(int j=0; j<coins.length; j++) {
				if(coins[j] <= i) {
					dp[i] = Math.min(dp[i], 1+dp[i-coins[j]]);
				}
			}
		}
		
//		System.out.println(Arrays.toS\=/.n  ring(dp));
		
		return dp[amount] > amount ? -1 : dp[amount];
		
	}

}

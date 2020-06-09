package com.The30DaysChallenge.June.Week1;

import java.util.Arrays;

public class CoinChange2 {

	public static void main(String[] args) {
		
//		System.out.println(change(10, new int[] {10}));
		int[] arr = new int[5];
		Arrays.fill(arr, 1);
		System.out.println(Arrays.toString(arr));

	}
	
	public static int change(int amount, int[] coins) {
		
		if(coins.length == 1) return (amount%coins[0] == 0) ? amount/coins[0] : 0;
		
		
		return -1;
    }
	
	public static int change2(int amount, int[] coins) {

        int dp[] = new int[amount+1];
        Arrays.fill(dp, 0);
        dp[0] = 1;
        for(int coin:coins)
        {
            for(int j = coin; j<=amount; j++){
            dp[j] += dp[j - coin];
            }
        }
            return dp[amount];
	}

}

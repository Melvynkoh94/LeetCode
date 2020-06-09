package com.The30DaysChallenge.June.Week2;

public class isPowerOfTwo {
	
	/*
	 * 
	 * Given an integer, write a function to determine if it is a power of two.
		
		Example 1:
		
		Input: 1
		Output: true 
		Explanation: 2^0 = 1
		Example 2:
		
		Input: 16
		Output: true
		Explanation: 2^4 = 16
		Example 3:
		
		Input: 218
		Output: false
	 */

	public static void main(String[] args) {
		int n = 16;
		System.out.println(7&8);
		
		
		System.out.println(isPowerOfTwoFunc2(1)); //answer: True
		System.out.println(isPowerOfTwoFunc2(16)); //answer: True
		System.out.println(isPowerOfTwoFunc2(218)); //answer: False
		System.out.println(isPowerOfTwoFunc2(536870912)); //answer: True
	}
	
	// Explanation: all the power of 2 integers, have their first bit as 1, and the rest 0
	// Bitwise AND operation with the previous number, e.g. 7 (0111) & 8 (1000), gives 0000
	public static boolean isPowerOfTwoFunc2(int n) {
		if(n == 0) return false;
		if(n == 1) return true;
		
		return (n&(n-1)) == 0;
		
	}
	
	//Doesnt work!
	 public static boolean isPowerOfTwoFunc(int n) {
	        
	        
	        if(n==1) return true;
	        
	        double result = Math.log(n)/Math.log(2);
	        //check if result has decimal parts that's not all zeros
	        if(result%1 == 0) return true;
	        System.out.println(result);
	        return false;
	 }

}

package com.easy;

public class Qn70_ClimbingStairs {
	
	/* FIBONACCI QUESTION
	 * You are climbing a stair case. It takes n steps to reach to the top.
		Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
		
		Note: Given n will be a positive integer.
		
		Example 1:		
		Input: 2
		Output: 2
		Explanation: There are two ways to climb to the top.
		1. 1 step + 1 step
		2. 2 steps
		
		Example 2:		
		Input: 3
		Output: 3
		Explanation: There are three ways to climb to the top.
		1. 1 step + 1 step + 1 step
		2. 1 step + 2 steps
		3. 2 steps + 1 step
	 */

	public static void main(String[] args) {
		System.out.println(climbStairs(3));
		

	}
	
	public static int climbStairs(int n) {
	    int a = 1, b = 1;
	    while (n-- > 0) {
	    	b += a;
	    	a = b - a;
//	        a = (b += a) - a;
	    }
	    return a;
	}
	
	/*
	 * Variable a tells you the number of ways to reach the current step, 
	 * and b tells you the number of ways to reach the next step. So for the situation one step further up, 
	 * the old b becomes the new a, and the new b is the old a+b, 
	 * since that new step can be reached by climbing 1 step from what b represented or 2 steps from what a represented.
	 */

}

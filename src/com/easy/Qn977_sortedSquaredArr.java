package com.easy;

import java.util.Arrays;
import java.util.stream.Stream;

public class Qn977_sortedSquaredArr {
	// Given an array of integers A sorted in non-decreasing order, 
	// return an array of the squares of each number, also in sorted non-decreasing order.
	
	/*
	 * Example 1:
		Input: [-4,-1,0,3,10]
		Output: [0,1,9,16,100]
		
	   Example 2:
		Input: [-7,-3,2,3,11]
		Output: [4,9,9,49,121]
	 */

	public static void main(String[] args) {		
		Stream.of(sortedSquares(new int[] {-4,-1,0,3,10})).forEach(x -> System.out.println(Arrays.toString(x)));		
	}
	
	public static int[] sortedSquares(int[] A) {
		if(A.length == 0 || A == null) return new int[] {};
		
		int[] result = new int[A.length];
		int start = 0;
		int end = A.length-1;
		int result_index = A.length-1;
		
		while(start<=end) {
			if(Math.abs(A[start]) > Math.abs(A[end])) {
				result[result_index] = A[start]*A[start];
				start++;
			}
			else {
				result[result_index] = A[end]*A[end];
				end--;
			}
			result_index--;
		}		
		return result;				
	}

}

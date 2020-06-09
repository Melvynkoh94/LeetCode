package com.easy;

import java.util.Arrays;

public class Qn1460_2ArraysEqualReverseSubArr {
	
	public static void main(String args[]) {
		
		int[] target = new int[] {1,2,3,4};
		int[] arr = new int[] {2,4,1,3};
				
//		System.out.println(canBeEqual(target, arr));
		
//		int[] target = new int[] {0,0,0,0};
		int sum = 0;
		for(int i=0; i<target.length; i++) {
			sum ^= target[i];
		}
//		System.out.println(sum);
		
		System.out.println(canBeEqual3(new int[] {1,1,1,1,1}, new int[] {1,1,1,1,1}));
		
	}
	
	//Test double equal
	public static void testDoubleEqual() {	
		int[] arr1 = {1,2,3};
		int[] arr2 = {1,2,3};
		String str1 = "hello";
		String str2 = "hello";
		System.out.println(str1 == str2); //true
		System.out.println(arr1 == arr2); //false
		System.out.println(arr1.equals(arr2)); //false
		System.out.println(Arrays.equals(arr1, arr2)); //true	
	}
	
	//Time complexity: O(n)
	// Use Bucket to count frequency of each number from target ++ and arr --
	public static boolean canBeEqual3(int[] target, int[] arr) {
		int[] freq = new int[1001]; // Since 
//		System.out.println(Arrays.toString(freq));
		for(int i=0; i<arr.length; i++) {
			freq[target[i]]++;
			freq[arr[i]]--;
		}
		
		// Check if all the elements in the frequency[] are all ZEROES
//		for(int num : freq) {
//			if(num != 0) return false;
//		}
		
		// Using XOR
		int sum = 0;
		for(int num : freq) {
			sum ^= num;
			if(sum != 0) return false;
		}
		
		return true;	
	}
	
	// Time Complexity: O(n log n) as Arrays.sort() uses Dual-pivot Quicksort --> O(n log n)
	public static boolean canBeEqual2(int[] target, int[] arr) {
		
		Arrays.sort(target);
		Arrays.sort(arr);
		return Arrays.equals(target, arr);
	
	}
	
	// WRONG
	public static boolean canBeEqual(int[] target, int[] arr) {
		
		// First check if all the elements in target are present in arr by summing all the elements
		int targetSum = 0, arrSum = 0;
		for(int i=0; i<target.length; i++) {
			targetSum += target[i];
			arrSum += arr[i];
		}
		if(targetSum != arrSum) return false;
						
		return true;                 
    }
}

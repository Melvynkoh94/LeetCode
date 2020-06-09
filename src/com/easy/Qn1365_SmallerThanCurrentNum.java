package com.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Qn1365_SmallerThanCurrentNum {
	
	/*
	 *  Example 1:
	 *  Input: nums = [8,1,2,2,3]
		Output: [4,0,1,1,3]
		Explanation: 
		For nums[0]=8 there exist four smaller numbers than it (1, 2, 2 and 3). 
		For nums[1]=1 does not exist any smaller number than it.
		For nums[2]=2 there exist one smaller number than it (1). 
		For nums[3]=2 there exist one smaller number than it (1). 
		For nums[4]=3 there exist three smaller numbers than it (1, 2 and 2).
		
		Example 2:
		Input: nums = [6,5,4,8]
		Output: [2,1,0,3]
		
		Example 3:
		Input: nums = [7,7,7,7]
		Output: [0,0,0,0]
	 */
	
	public static void main(String args[]) {	
		
//		int[] arr = new int[] {1,2,3,4};
//		int[] clonedArr = arr.clone();
//		int[] copiedArr = Arrays.copyOf(arr, arr.length);
//		clonedArr[0] = 9;
//		copiedArr[0] = 9;
//		System.out.println(arr[0]);
//		System.out.println(copiedArr[0]);
//		
		
		System.out.println(Arrays.toString(smallerNumbersThanCurrent2(new int[] {8,1,2,2,3})));
	}
	
	
	// Using HashMap
	public static int[] smallerNumbersThanCurrent2(int[] nums) {
		Map<Integer, Integer> map = new HashMap<>();
        int[] copy = nums.clone();
        
        Arrays.sort(copy);
        
        for (int i = 0; i < nums.length; i++) {
//            map.putIfAbs ent(copy[i], i);
        }
        
        System.out.println(map);
        
        for (int i = 0; i < nums.length; i++) {
            copy[i] = map.get(nums[i]);
        }
        
        return copy;
		
//		int[] sortedNums = nums.clone();
//		Arrays.sort(sortedNums);	
//		
//		// Map to store key:value --> num : count
//		Map<Integer, Integer> map = new HashMap<>();
//		return new int[] {};
	}
	
	
	
	// Most direct approach, dynamic programming using 2 FOR loops while skipping same indexes
	public static int[] smallerNumbersThanCurrent(int[] nums) {
        
        if(nums.length == 0 || nums == null) return new int[]{};
        
        int[] result = new int[nums.length];
        
        for(int i=0; i<nums.length; i++){
            int count = 0;
            for(int j=0; j<nums.length; j++){
                if(i == j) continue;
                
                if(nums[j] < nums[i]) count++;                
            }
            result[i] = count;
        }
        
        return result;
        
    }

}

package com.medium;

import java.util.HashSet;

public class Qn287_FindDuplicateNum {
	
	/*
	 * Example 1:
		Input: [1,3,4,2,2]
		Output: 2
				
	   Example 2:		
		Input: [3,1,3,4,2]
		Output: 3
	 *
	 */

	public static void main(String[] args) {
		
		System.out.println(findDuplicate3(new int[] {3,1,3,4,2}));	
		

	}
	
	
	// 	Using Floyd's Tortoise and Hare (Cycle Detection) approach, O(N) time complexity with much less space complexity
	public static int findDuplicate3(int [] nums) {
		if (nums == null || nums.length == 0) return 0;
        int slow = nums[0], fast = nums[0];
        while (true) {
            slow = nums[slow];
            fast = nums[nums[fast]];
            if (slow == fast) {
                fast = nums[0];
                while (fast != slow) {
                    slow = nums[slow];
                    fast = nums[fast];
                }
                return fast;
            }
        }
	}
	
	// Direct approach, O(N) time complexity, but at the expense of space complexity
	// Uses HashSet
	public static int findDuplicate2(int[] nums) {
		
		if(nums.length == 0 || nums == null) return -1;		
		HashSet<Integer> seen = new HashSet<>();
		
		for(int num : nums) {
			if(!seen.add(num)) {
				return num;
			}
		}
		return -1;		
	}
	
	public static int findDuplicate(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int slow = nums[0], fast = nums[0];
        while (true) {
            slow = nums[slow];
            fast = nums[nums[fast]];
        	System.out.println("slow: " + slow + ", fast: " + fast);

            if (slow == fast) {
                fast = nums[0];
                while (fast != slow) {
                    slow = nums[slow];
                    fast = nums[fast];
                }
                return fast;
            }
        }
    }

}

package com.easy;

import java.util.Arrays;

public class Qn88_MergeSortedArr {
	
	/*
	 * Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.
	 * 
		Note:		
		The number of elements initialized in nums1 and nums2 are m and n respectively.
		You may assume that nums1 has enough space (size that is greater or equal to m + n) to hold additional elements from nums2.
		Example:
		
		Input:
		nums1 = [1,2,3,0,0,0], m = 3
		nums2 = [2,5,6],       n = 3
		
		Output: [1,2,2,3,5,6]
	 */

	public static void main(String[] args) {
		
		int[] nums1 = new int[] {1,2,3,0,0,0};
		int[] nums2 = new int[] {2,5,6};

		merge(nums1, 3, nums2,3);
		System.out.println(Arrays.toString(nums1));

	}
	
	 public static void merge(int[] nums1, int m, int[] nums2, int n) {
	        
	        for(int i=nums1.length-1; i>=m; --i)
	            nums1[i] = nums2[--n]; 
	        Arrays.sort(nums1);       
	    }

}

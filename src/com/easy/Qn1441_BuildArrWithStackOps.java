package com.easy;

import java.util.ArrayList;
import java.util.List;

public class Qn1441_BuildArrWithStackOps {
	
	/*
	 * Input: target = [1,3], n = 3
		Output: ["Push","Push","Pop","Push"]
		Explanation: 
		Read number 1 and automatically push in the array -> [1]
		Read number 2 and automatically push in the array then Pop it -> [1]
		Read number 3 and automatically push in the array -> [1,3]
		
		Input: target = [1,2,3], n = 3
		Output: ["Push","Push","Push"]
	 */

	public static void main(String[] args) {
		
		int[] target = new int[] {2,3,4};		
		System.out.println(buildArray(target, 4));
	}

	
	public static List<String> buildArray(int[] target, int n) {
		
		 
		List<String> StackOps = new ArrayList<>();
		
		int targetIndex = 0;
        
        int counter = 1;
        while(targetIndex < target.length && counter <= n){ 
            System.out.println(targetIndex);
            if(target[targetIndex] == counter){
                StackOps.add("Push");
                targetIndex++;
            }
            else{
                StackOps.add("Push");
                StackOps.add("Pop");
            }
            counter++;
        }
        
        return StackOps;
		
		
//		
//		List<String> StackOps = new ArrayList<>();
//		
//		int targetIndex = 0;
//		for(int i=0; i<n; i++) {
//			if(target[targetIndex] == i+1) {
//				StackOps.add("Push");
//				targetIndex++;
//			}
//			else {
//				StackOps.add("Push");
//				StackOps.add("Pop");
//			}
//		}
//		
//		return StackOps;
		
        
    }
}

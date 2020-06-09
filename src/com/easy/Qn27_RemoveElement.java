package com.easy;

public class Qn27_RemoveElement {
	
	/*
	 * Given nums = [0,1,2,2,3,0,4,2], val = 2,
		Your function should return length = 5, with the first five elements of nums containing 0, 1, 3, 0, and 4.
		Note that the order of those five elements can be arbitrary.
		It doesn't matter what values are set beyond the returned length
	 */

	public static void main(String[] args) {
		System.out.println(removeElement(new int[] {0,1,2,2,3,0,4,2}, 2));
	}
	public static int removeElement(int[] nums, int val) {
        
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
        
//         if(nums.length == 0 || nums == null) return 0;
        
//         // 1. two pointers, 1 at the end (last), 1 at the start (start)
//         // 2. 'last' will start to check if it is pointing at val, if it is, last--;
//         // 3. 'start' will traverse until it sees val, and then do a swap with 'last'
//         // 4. start++; last--;
//         // 5. break when start == last
                
//         int start = 0;
//         int last = nums.length-1;
        
//         while(start != last){
//             if(nums[last] == val){
//                 last--; continue;
//             }
//             if(nums[start] == val){
//                 //SWAP
//                 nums[start] = nums[last];
//                 last--;
//             }
//             start++;
//         }
//         //System.out.println(last);
//         return last+1;
    }

}

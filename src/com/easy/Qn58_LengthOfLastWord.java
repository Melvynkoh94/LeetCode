package com.easy;

public class Qn58_LengthOfLastWord {
	
	/*
	 * Given a string s consists of upper/lower-case alphabets and empty space characters ' ', 
	 * return the length of last word (last word means the last appearing word if we loop from left to right) in the string.
		If the last word does not exist, return 0.
		Note: A word is defined as a maximal substring consisting of non-space characters only.
		
		Example:
		Input: "Hello World"
		Output: 5
		
		Example:
		Input: "HelloWorld"
		Output: 10
	 */

	public static void main(String[] args) {
		System.out.println(lengthOfLastWord("Hello World ppp"));

	}
	
	public static int lengthOfLastWord(String s) {
		int lastSpaceIndex = 0;
		int spaceCount = 0;
		for(int i=0; i<s.length(); i++) {
			if(Character.isWhitespace(s.charAt(i))) {
				lastSpaceIndex = Math.max(lastSpaceIndex, i);
				spaceCount++;
			}					
		}	
		if(spaceCount == 0) return s.length();
		return (s.length()-lastSpaceIndex)-1;		      
    }

}

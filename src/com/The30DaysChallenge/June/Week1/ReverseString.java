package com.The30DaysChallenge.June.Week1;

import java.util.Arrays;

public class ReverseString {

	public static void main(String[] args) {
		
		char[] charArray = new char[] {'H','a','n','n','a','h'};
		reverseString(charArray);
		System.out.println(Arrays.toString(charArray));

	}
	
	
	public static void reverseString(char[] s) {
		
		int start = 0;
		int end = s.length-1;
		
		while(start <= end) {		
			char temp = s[end];
			s[end--] = s[start];
			s[start++] = temp;						
		}        
    }
}

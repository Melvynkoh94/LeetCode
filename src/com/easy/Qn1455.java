package com.easy;

import java.util.Arrays;

public class Qn1455 {

	public static void main(String[] args) {
		
		System.out.println(isPrefixOfWord2("hello from the other side", "they"));
		System.out.println(isPrefixOfWord2("i love eating burger", "burg"));
		System.out.println(isPrefixOfWord2("this problem is an easy problem", "pro"));

	}
	public static int isPrefixOfWord2(String sentence, String searchWord) {
		String[] strArray = sentence.split(" ");
		
		for(int i=0; i<strArray.length; i++) {
			if(strArray[i].startsWith(searchWord)) return i+1;
		}
		return -1;
	}
	
	
	public static int isPrefixOfWord(String sentence, String searchWord) {
		
		String strArr[] = sentence.split(" ");
		int nthWord = 1;
		for(String str : strArr) {
			if(checkPrefix(str, searchWord)) {
				return nthWord;
			}
			nthWord++;
		}
		return -1;
        
    }
	
	public static boolean checkPrefix(String word, String searchWord) {
		if(!word.contains(searchWord)) return false;
		else if(word.substring(0, searchWord.length()).equals(searchWord)) {
			return true;
		}
		return false;
	}

}

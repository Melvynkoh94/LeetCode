package com.easy;

public class Q67_AddBinary {

	public static void main(String[] args) {
		
		char a = '9';
		System.out.println(a+'0'); //105
		System.out.println(a-'0'); //9
		// to convert a char to a literal int, simply subtract '0'
		// to convert a char to its ASCII code in int, simply add '0'
		System.out.println(Character.getNumericValue(a)); //9
		
		
		System.out.println(addBinary2("11","1"));
		

	}
	
	
	 public static String addBinary2(String a, String b) {  
		 
//		 int i = a.length() - 1, j = b.length() - 1, c = 0;
//			StringBuilder sb = new StringBuilder();
//
//			while (i >= 0 || j >= 0 || c == 1) {
//				int aVal = (i < 0) ? 0 : a.charAt(i--) - '0';
//				int bVal = (j < 0) ? 0 : b.charAt(j--) - '0';
//
//				sb.insert(0, (char) ('0' + aVal ^ bVal ^ c));
//				c = (aVal + bVal + c) >> 1;
//			}
//
//			return sb.toString();
		 
		 
		 if(a.length() == 0 || b.length() == 0) return (a.length()==0) ? b : a;
		 
		 int a_index = a.length()-1; 
		 int b_index = b.length()-1;
		 int carry = 0;
		 
		 StringBuilder sb = new StringBuilder();
		 
		 while(a_index>=0 || b_index>=0 || carry >0) {
			 
			 int a_bit  = (a_index >= 0) ? a.charAt(a_index--)-'0' : 0; 
			 int b_bit = (b_index >=0) ? b.charAt(b_index--) - '0' : 0;
			 
			 sb.insert(0, (char)('0' + a_bit^b_bit^carry));
			 carry = (a_bit + b_bit + carry) >> 1;
		 }		 
		 
		 return sb.toString();	        	        
	}
	
	
	
    public String addBinary(String a, String b) {      
        int carry = 0;
        String longerStr = a;
        String shorterStr = b;
        
        //check which string is longer
        if(longerStr.length() > b.length()) {
        	longerStr = b;
        	shorterStr = a;
        }
        
        StringBuilder sb = new StringBuilder();       
        for(int i=0; i<longerStr.length(); ++i) {
        	
        	//check if we still can process shorterStr
        	if(i < shorterStr.length()-1) {
        		
        	}
        	
        	//just need to add remaining with carry, if any
        	else {
        		        		
        	}
        }
        
        
        return null;
        
        
    }

}

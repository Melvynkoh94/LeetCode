package com.easy;

public class Qn1108_DefangingIPAddress {
	
	/*
	 * Given a valid (IPv4) IP address, return a defanged version of that IP address.		
		A defanged IP address replaces every period "." with "[.]".
		
		Example 1:		
		Input: address = "1.1.1.1"
		Output: "1[.]1[.]1[.]1"
		
		Example 2:		
		Input: address = "255.100.50.0"
		Output: "255[.]100[.]50[.]0"
	 */

	public static void main(String[] args) {		
//		System.out.println(defangIPaddr("255.100.50.0"));
//		System.out.println(defangIPaddr2("255.100.50.0"));
		System.out.println(defangIPaddr3("255.100.50.0"));
	}
	
	// Using lib
	public static String defangIPaddr3(String address) {
//		return address.replaceAll(".", "[.]"); args of replaceAll() are regex expression, so "." means any character. Need to escape it with "\\."
		
		return address.replaceAll("\\.", "[.]");
//		return address.replace(".", "[.]");
	}
	
	// Shorter way...
	public static String defangIPaddr2(String address) {
		
		StringBuilder sb = new StringBuilder();
		for(char ch : address.toCharArray()) {
			sb.append(ch == '.' ? "[.]" : ch);
		}
		return sb.toString();
	}
	
	public static String defangIPaddr(String address) {
        
        StringBuilder sb = new StringBuilder("");
        int last_index = 0;
        for(int i=0; i<address.length(); i++) {
        	if(address.charAt(i) == '.') {
        		sb.append(address.substring(last_index, i)+"[.]");
        		last_index = i+1;
        	}        	        	
        }
        sb.append(address.substring(last_index));        
        return sb.toString();
        
    }

}

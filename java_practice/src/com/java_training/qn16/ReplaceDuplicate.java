package com.java_training.qn16;

public class ReplaceDuplicate {
	static String inp_1 = "New York";
	static String inp_2 = "New Jersy";
	
	public static String removeDuplicateChar() {
		String[] chaS = inp_2.split("");
		String str = "";
		for(int i=0; i < chaS.length; i++) {
			if(str.indexOf(chaS[i]) == -1) {
				str += chaS[i];
			}
		}
		return str.replace(" ", "");
	}
	
	public static void replaceUniqueChar(String inp2) {
		String output = "";
		String[] chaS = inp_1.split("");
		for(int i=0; i < chaS.length; i++) {
			if(!chaS[i].equals(" ")) {
				if(inp2.indexOf(chaS[i]) == -1) {
					if(inp2.indexOf(chaS[i].toLowerCase()) == -1) {
						output += "+";
					}else {				
						output += chaS[i];
					}
				} else {
					output += chaS[i];
				}
			} else {
				output += chaS[i];
			}
		}
		System.out.println(output);
	}
	
	public static void main(String[] args) {
		// passing the inputs to another method 
		String str2 = removeDuplicateChar();
		// Replace duplicate value
		replaceUniqueChar(str2);
	}

}

/*
 * Test Scenarios
 * 1. Inputs must be integer
 * 2. If a char present multiple time in first string?
 * 3. return string 1 first second string empty
 * 4. return empty if first string is empty
 * */ 

package com.java_practice.qn05;

public class SumIntegerInSting {
	public static void main(String[] args) {
		String[] str = {"1AA", "14", "B12", "ABC"};
		// Initialize an array [] for integer
		int arrayVal[] = new int[Integer.MAX_VALUE];
		// Remove character from the string
		// Add and store the value in a variable and print after the loop
		for(int i=0; i < str.length; i++) {
			String val = str[i].replaceAll("([A-Z])", "");
			if(!val.isEmpty()) {
			}
		}
	}
}

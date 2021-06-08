package com.java_practice.qn03;

public class SumOfInput {
	public static void main(String[] args) {
		int[] intArray = {19,13,12, 0, 1, 34, -1};
		int min_val = intArray[0];
		int max_val = intArray[0];		
		for(int i=1; i < intArray.length; i++) {
			if(min_val < intArray[i]) {
				min_val  = intArray[i];
			}
			if(max_val > intArray[i]) {
				max_val = intArray[i];
			}
		}
		System.out.println("The sum of Min and Max value is: " + (min_val + max_val));
	}
}
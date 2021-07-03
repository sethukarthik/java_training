package com.java_training.qn32_33_34;

public class UsingForEach {
	public static void main(String[] args) {
		int[] tends = {5,10,12,30,12,12,76};
		int numberOfTends = tends.length;
		int totalRefugees = 0;
		for(int i : tends) {
			totalRefugees += i;
		}
		System.out.println(numberOfTends);
		System.out.println(totalRefugees);
	}

}

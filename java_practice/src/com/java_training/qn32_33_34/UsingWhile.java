package com.java_training.qn32_33_34;

public class UsingWhile {
	public static void main(String[] args) {
		int[] tends = {5,10,12,30,12,12,76};
		int numberOfTends = tends.length;
		int totalRefugees = 0;
		int i = 0;
		while( i < numberOfTends ) {
			totalRefugees += tends[i];
			i++;
		}
		System.out.println(numberOfTends);
		System.out.println(totalRefugees);
	}
}

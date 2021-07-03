package com.java_training.qn32_33_34;

import java.util.Iterator;

public class UsingForLoop {
	public static void main(String[] args) {
		int[] tends = {5,10,12,30,12,12,76};
		int numberOfTends = tends.length;
		int totalRefugees = 0;
		for(int i =0; i < numberOfTends; i++) {
			totalRefugees += tends[i];
		}
		System.out.println(numberOfTends);
		System.out.println(totalRefugees);
	}
}

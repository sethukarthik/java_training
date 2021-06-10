package com.java_practice.qn10;

import java.util.Arrays;

public class Union {
	public static void main(String[] args) {
		int input_a[] = {1,2,4,5,11,0,5,5,5,6};
		int input_b[] = {3,4,6,9,8,8,8};
		
		int[] conc = new int[input_a.length + input_b.length];
		for(int i=0; i < input_a.length; i++) {
			conc[i] = input_a[i];
		}
		for(int i=0; i < input_b.length; i++) {
			conc[input_a.length + i] = input_b[i];
		}
		Arrays.sort(conc);
				
		int[] array = new int[conc.length];
		int count = 0;
		for(int i=0; i < conc.length; i++) {
			if(conc.length - 1 == i) {
				array[count++] = conc[i];
				break;
			}
			if(conc[i] != conc[i+1]) {
				array[count++] = conc[i];
			}
		}
		
		// remove array with value of zero		
		for(int i=0; i < array.length; i++) {
			if(i > 0 && array[i] != 0) {
				System.out.println(array[i]);
			}
		}
	}
}

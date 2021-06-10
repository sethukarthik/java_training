package com.java_practice.qn11;

import java.util.Arrays;

public class Intersection {
	public static void main(String[] args) {
		int input_a[] = {0,0,2,1,2,3,4};
		int input_b[] = {3,4,6,5};
	
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
					break;
			}
			if(conc[i] - conc[i+1] == 0) {
				array[count++] = conc[i];
			}
		}
		
		// remove array with value of zero		
		for(int i=0; i < array.length; i++) {
			if(array[i] != 0 && i >= 0) {
				System.out.println(array[i]);
			}else if(array[i] == 0 && i == 0){
				System.out.println(array[i]);
			}
		}
	}
	
}

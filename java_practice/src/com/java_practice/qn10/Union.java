package com.java_practice.qn10;

import java.util.Arrays;

public class Union {
	public static void main(String[] args) {
		int input_a[] = {1,2,3,4,5};
		int input_b[] = {3,4,6,7};
		
		int[] conc_array = new int[input_a.length + input_b.length];
		for(int i=0; i < input_a.length; i++) {
			conc_array[i] = input_a[i];
		}
		for(int i=0; i < input_b.length; i++) {
			conc_array[input_a.length + i] = input_b[i];
		}
		Arrays.sort(conc_array);
		
//		int[] array = new int[conc_array.length];
//		int count = 0;
//		for(int i=0; i < conc_array.length-1; i++) {
//			if(conc_array[i] != conc_array[i+1]) {
//				array[count++] = conc_array[i];
//			}
//		}
//		array[count++] = conc_array[conc_array.length-1];
//		
//		for (int i=0; i<count; i++){  
//			conc_array[i] = array[i];  
//        }
//		
//		for(int i=0; i < conc_array.length; i++) {
//			System.out.println(conc_array[i]);
//		}
	}
}

package com.java_practice.qn11;

import java.util.ArrayList;
import java.util.Arrays;

public class Intersection {
	public static void main(String[] args) {
//		These function is done without out ArrayList and this is for reference
//		int input_a[] = {0,0,2,1,2,3,4};
//		int input_b[] = {3,4,6,5};
//	
//		int[] conc = new int[input_a.length + input_b.length];
//		for(int i=0; i < input_a.length; i++) {
//			conc[i] = input_a[i];
//		}
//		for(int i=0; i < input_b.length; i++) {
//			conc[input_a.length + i] = input_b[i];
//		}
//		Arrays.sort(conc);
//		
//		ArrayList<Integer> array = new ArrayList<>();
//		for(int i=0; i < conc.length; i++) {
//			if(conc.length - 1 == i) {
//				break;
//			}
//			if(conc[i] - conc[i+1] == 0) {
//				array.add(conc[i]);
//			}
//		}
//		
//		// remove array with value of zero		
//		for(int i=0; i < array.size(); i++) {
//			System.out.println(array.get(i));
//		}
		
		int input_a[] = {0,2,1,3,4};
		int input_b[] = {3,4,6,5};
		
		ArrayList<Integer> array = new ArrayList<>();
		
		for(int val_a: input_a) {
			if(!array.contains(val_a)) {
				array.add(val_a);
			}
		}
		ArrayList<Integer> intersection = new ArrayList<>();
		// System.out.println(conc.size());
		for(int val_b: input_b) {
			if(array.contains(val_b)) {
				intersection.add(val_b);
			}
		}
		
		for(int val: intersection) {
			System.out.println(val);
		}
	}
	
}

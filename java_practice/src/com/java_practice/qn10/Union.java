package com.java_practice.qn10;

import java.util.ArrayList;
import java.util.Arrays;

public class Union {
	public static void main(String[] args) {
		// These function is done without out ArrayList and this is for reference		
		//		int input_a[] = {1,2,4,5,11,0,5,5,5,6};
//		int input_b[] = {3,4,6,9,8,8,8};
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
//				array.add(conc[i]);
//				break;
//			}
//			if(conc[i] != conc[i+1]) {
//				array.add(conc[i]);
//			}
//		}
//		
//		System.out.println(array.size());
//		
//		// remove array with value of zero		
//		for(int i=0; i < array.size(); i++) {
//			System.out.println(array.get(i));
//		}
//	}
		
		int input_a[] = {1,2,4,5,11,0,5,5,5,6};
		int input_b[] = {3,4,6,9,8,8,8};
		
		ArrayList<Integer> conc = new ArrayList<>();
		
		for(int val_a: input_a) {
			if(!conc.contains(val_a)) {
				conc.add(val_a);
			}
		}
		// System.out.println(conc.size());
		for(int val_b: input_b) {
			if(!conc.contains(val_b)) {
				conc.add(val_b);
			}
		}
		
		for(int val: conc) {
			System.out.println(val);
		}
	}
}

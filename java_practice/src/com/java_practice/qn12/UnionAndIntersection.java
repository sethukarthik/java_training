package com.java_practice.qn12;

import java.util.ArrayList;

public class UnionAndIntersection {
	
	public static void main(String[] args) {
		int input_a[] = {1,2,3,4};
		int input_b[] = {3,4,5,6};
		
		ArrayList<Integer> conc = new ArrayList<>();
		
		for(int val_a: input_a) {
			if(!conc.contains(val_a)) {
				conc.add(val_a);
			}
		}
		for(int val_b: input_b) {
			if(!conc.contains(val_b)) {
				conc.add(val_b);
			}
		}
		
		ArrayList<Integer> array = new ArrayList<>();
		for(int val_a: input_a) {
			if(!array.contains(val_a)) {
				array.add(val_a);
			}
		}
		
		ArrayList<Integer> intersection = new ArrayList<>();
		for(int val_b: input_b) {
			if(array.contains(val_b)) {
				intersection.add(val_b);
			}
		}
		
		ArrayList<Integer> un_int = new ArrayList<>();
		for( int val_c: conc) {
			if(!intersection.contains(val_c)) {
				un_int.add(val_c);
			}
		}
		
		for(int val: un_int) {
			System.out.println(val);
		}
	}
}

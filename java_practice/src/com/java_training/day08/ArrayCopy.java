package com.java_training.day08;

public class ArrayCopy {
	public static void main(String[] args) {
		int[] i = {1,2,3,4,5};
		
		int[] newAr = new int[i.length];
		System.arraycopy(i, 2, newAr, 0, i.length-2);
		for(int j : newAr) {
			System.out.println(j);
		}
	}
}
package com.java_training.day08;

import java.util.Scanner;

public class SystemClass {
	Scanner inp = new Scanner(System.in);
	int intV = inp.nextInt();
	String ch = inp.next();
	char c = inp.next().charAt(intV);
		
	public static void main(String[] args) {
		long start;
		long end;
		
		start = System.nanoTime();
		System.out.println("Hello");
		end = System.nanoTime();
		
		System.out.println(start);
		System.out.println(end);
		
//		System s = new System();
//		s.out.println("asf");
		
		int[] array = {1,2,3,4,5,6};
		int[] newArray = new int[5];
		System.arraycopy(array, 2, newArray, 0, array.length);
		for(int i: newArray) {
			System.out.println(i);
		}
	}
}

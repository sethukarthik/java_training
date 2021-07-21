package com.java_practice.singleton;

public interface Anna {
	
	void add(int a, int b);
	
	default int sub(int a, int b) {
		System.out.println(a-b);
		return a-b;
	}
	
	static int mult(int a, int b) {
		System.out.println(a*b);
		return a*b;
	}
} 

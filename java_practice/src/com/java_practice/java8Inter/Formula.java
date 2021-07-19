package com.java_practice.java8Inter;


@FunctionalInterface
public interface Formula extends Dimention{
	
//	public static final int id = 0;
	
	default boolean dimFormula(int i) {
		System.out.println("From formula");
		return false;
	}
	
	static void shareType() {
		System.out.println("sethu");
	}
	
}

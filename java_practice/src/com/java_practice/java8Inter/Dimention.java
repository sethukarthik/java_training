package com.java_practice.java8Inter;

@FunctionalInterface
public interface Dimention {
	
	void getFormula();
	
	default boolean dimFormula(int i) {
		System.out.println("From dimention");
		return false;
	}
	
	default void dim() {
		System.out.println("From Dimention dim emthid");
	}	
//	static void staticFor() {
//		System.out.println("This is static formula");
//	}
}	

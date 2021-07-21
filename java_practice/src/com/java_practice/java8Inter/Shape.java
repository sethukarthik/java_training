package com.java_practice.java8Inter;

public interface Shape {
	void calcArea();
	
	void getFormula();
	
	static void shareType() {
		System.out.println("sethu");
	}
	
	default boolean type() {
		return true;
	}
	
	default boolean dimFormula(int i) {
		return false;
	}
	

//	public void ma();
//	
//	public void ma1();
}
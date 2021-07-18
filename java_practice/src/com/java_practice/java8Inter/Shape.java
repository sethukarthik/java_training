package com.java_practice.java8Inter;

public interface Shape {
	void calcArea();
	
	static void shareType() {
		System.out.println("sethu");
	}
	
	default boolean type() {
		return true;
	}
}

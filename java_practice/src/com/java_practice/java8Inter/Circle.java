package com.java_practice.java8Inter;

public class Circle implements Shape, Dimention {
	@Override
	public void calcArea() {
		System.out.println("This is Cirlce");
		Shape.shareType();
	}
	
	@Override
	public boolean type() {
		return Dimention.super.type();
	}
	
	void circleMethod() {
		System.out.println("This Circle Method");
	}
	
	public static void main(String[] args) {
		Shape.shareType();
		Circle c = new Circle();
		c.calcArea();
		System.out.println(c.type());
		c.circleMethod();
		System.out.println("---------------->");
		Shape s = new Circle();
		s.calcArea();
		System.out.println(s.type());
		Shape.shareType();
	}
}

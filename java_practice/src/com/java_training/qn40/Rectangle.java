package com.java_training.qn40;

public class Rectangle extends Shape{
	int length;
	int breadth;
	
	public Rectangle() {
		super.shapeName = "Rectangle";
	}
	
	
	public Rectangle(int l, int b) {
		this.length = l;
		this.breadth = b;
	}
	
	@Override
	public double calculateArea() {
		return (this.length * this.breadth);
	}
}

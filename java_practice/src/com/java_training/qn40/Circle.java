package com.java_training.qn40;

public class Circle extends Shape {
	private int radius;
	
	public Circle() {
		super.shapeName = "Circle";	
	}
	
	public Circle(int r) {
		this.radius = r;
	}
	
	@Override
	public double calculateArea() {
		return (2 * Math.PI * this.radius) ;
	}
}
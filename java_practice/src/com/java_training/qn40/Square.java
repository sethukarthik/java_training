package com.java_training.qn40;

public class Square extends Shape {
	int side;
	
	public Square() {
		super.shapeName = "Square";
	}
	
	public Square(int side) {
		this.side = side;
	}
	
	@Override
	public double calculateArea() {
		return (this.side * this.side);
	}
}

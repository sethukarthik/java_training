package com.java_practice.java8Inter;

public class Circle implements Shape, Dimention {
	int id=2;
	String shp;
	
	public Circle() {
		// TODO Auto-generated constructor stub
	}
	
	public Circle(int id, String shp) {
		this.id = id;
		this.shp = shp;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void calcArea() {
		System.out.println("This is CalcArea");
	}
	
	@Override
	public void getFormula() {
		System.out.println("This is get formula");
	}
	
	@Override
	public boolean dimFormula(int i) {
		return Dimention.super.dimFormula(1);
	}
	
	public static void main(String[] args) {
		Circle c = new Circle();
		c.dimFormula(1);
		c.getFormula();
		Shape s = new Circle();
		s.type();
	}
	
}

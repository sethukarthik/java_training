package com.java_practice.java8Inter;

public class Rectangle extends Circle implements Formula, Shape {
	int id=200;
	String shpName;
	
	@Override
	public void getFormula() {
		System.out.println("---------------");
		// TODO Auto-generated method stub
	}
	
	@Override
	public boolean dimFormula(int i) {
		// TODO Auto-generated method stub
		return Formula.super.dimFormula(i);
	}

	public static void main(String[] args) {
		Circle c = new Rectangle();
		System.out.println(c.id);
		Rectangle r = new Rectangle();
		System.out.println(r.id);	
		c.getFormula();
	}

	@Override
	public void calcArea() {
		// TODO Auto-generated method stub
		
	}
}

package com.java_training.interfdemo;

public class Vehicle implements Travel, Owner {

	@Override
	public void getSpeed() {
		System.out.println("This is travel");
		// TODO Auto-generated method stub
//		Travel.count = 0;
	}

	@Override
	public void getOwner() {
		System.out.println("This is travel");
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {
		Vehicle name = new Vehicle();
		System.out.println(Travel.count);
		System.out.println(Owner.count);
	}

	@Override
	public void getNum() {
		// TODO Auto-generated method stub
		
	}
	
}

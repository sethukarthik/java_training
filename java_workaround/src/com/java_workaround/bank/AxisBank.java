package com.java_workaround.bank;

public class AxisBank extends Bank {
	
	String userName = "Karthik";
	long phNumber = 7575478474l;
	
//	@Override
//	public void userDetails() {
//		//System.out.println("CustomerName: " + userName + " ContactNumber: " + phNumber);
//		super.userDetails();
//		System.out.println(super.userName);
//	}
	
	@Override
	void userDetails() {
		super.userDetails();
		System.out.println(this.phNumber = 94874748);
		System.out.println(this.phNumber);
	}
	
}

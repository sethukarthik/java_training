package com.java_workaround.bank;

public class IciciBank extends Bank {

	String userName = "Naga";
	long phNumber = 2323232323l;
	
	@Override
	public void userDetails() {
		//System.out.println("CustomerName: " + userName + " ContactNumber: " + phNumber);
		super.userDetails();
		System.out.println(super.userName);
	}
	
}

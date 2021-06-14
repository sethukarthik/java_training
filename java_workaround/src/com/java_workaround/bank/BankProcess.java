package com.java_workaround.bank;

public class BankProcess {
	
	public static void main(String[] args) {
		Bank bank = new Bank();
		bank.userDetails();
		AxisBank axis = new AxisBank();
		axis.userDetails();
//		Bank axis1 = new AxisBank();
//		axis1.userDetails();
//		System.out.println(axis1.userName);
	}
	
}

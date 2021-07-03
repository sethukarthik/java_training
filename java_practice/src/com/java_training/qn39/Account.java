package com.java_training.qn39;

import java.util.Scanner;

public class Account {
	private String accountNumber = "1000321";
	private int balance = 5000;
//	private int transactionAmount;
	
	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	public int getBalance() {
		return balance;
	}
	
	public void withdraw(int transactionAmount) {
		if(this.balance <= transactionAmount) {
			System.out.println("Insufficient Amount");
		}else {
			this.balance -= transactionAmount;
			System.out.println("Your balance after the transaction is : " + this.balance );
		}
	}
	
	public void deposit(int transactionAmount){
		this.balance += transactionAmount;
		System.out.println("Your balance after the transaction" + this.balance);
	}
	
	public static void main(String[] args) {
		Account acc = new Account();
		Scanner inp = new Scanner(System.in);
		String accNum = inp.next();
		if(acc.accountNumber.equals(accNum)) {
			System.out.println("Please enter 1 for withdaw or 2 for transaction: ");
			int userInput = inp.nextInt();
			if(userInput == 1) {				
				int amt = inp.nextInt();
				acc.withdraw(amt);
			}else if(userInput == 2) {
				int amt = inp.nextInt();
				acc.deposit(amt);
			}else {
				System.out.println("Please select valid option");
			}
			
		}else {
			System.out.println("Please enter a valid account number");
		}
	}

}

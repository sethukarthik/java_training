package com.java_training.day07;

public class ExceptionPractice {
	public static void main(String[] args) {
		try {			
			Integer in;
			in = new Integer(10);
		}catch(NullPointerException e) {
			System.out.println("Thisi");
		}finally {
			System.out.println("asfdsdf");
		}
	}
}

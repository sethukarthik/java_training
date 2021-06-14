package com.java_workaround.operations;

public class BasicOperations {

	public static void main(String[] args) {
		// Primitive Types or DataType of variables
		//int - integer type - 32 bit - minimum value of -2^(31) and a maximum value of 2^(31)-1
		//float - fraction type - 32bit - single-precision 32-bit IEEE 754 floating point
		//byte - integer type 8-bit - min -128 and a max val 127 (inclusive)
		//short - integer type 16-bit - min -32,768 and a max val 32,767 (inclusive)
		//long - integer type 64-bit - minimum value of -2(63) and a maximum value of 2(63)-1
		//boolean - true/false type
		//double - fraction(similar to float) - 64-bit - double-precision 64-bit IEEE 754 floating point
		//char - character type - 16-bit unicode(multiple language) -  It has a minimum value of '\u0000' (or 0) and a maximum value of '\uffff
		
		//String - Class
			// java.lang - package
		
		int a; // Type declaration.
		a = 10; //initialization.
		// or
		int b = 20;
		System.out.println(a+b);
		
		short c=10;
		long d=1000000000 ;
		System.out.println(c+d);
		
		byte byt = 10;
		int ing = byt;
		System.out.println(ing);
	}

}

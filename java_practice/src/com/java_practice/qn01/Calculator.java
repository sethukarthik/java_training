package com.java_practice.qn01;

import com.java_training.day06.Days;

public class Calculator {
	public static void main(String[] args) {
		System.out.println(Days.MONDAY);
		//Getting input from argument
		if(args.length == 2) {
			try {
				int input_1 = Integer.parseInt(args[0]);
				int input_2 = Integer.parseInt(args[1]);
				// Addition
				System.out.println("I added you " + (input_1 + input_2));
				// Subtraction
				System.out.println("I subtracted you " + (input_1 - input_2));
				// Multiplication
				System.out.println("I multipled you " + (input_1 * input_2));
				// Division
				System.out.println("I divided you " + (input_1 / input_2));
				// Modulo
				System.out.println("I Remainder of you " + (input_1 % input_2));
			}catch(NumberFormatException ex) {
				System.out.println("I do not support characters");
			}
		} else {
			System.out.println("Oops! I will accept only 2 digits");
		}
	}
}

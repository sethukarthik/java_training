package com.java_practice.qn08;

import java.lang.Math;

public class SquareRoot {
	
	public static int arithmetic_operation(int x1, int x2, int y1, int y2) {
		
		return (((x1+x2)*(x1+x2)) + ((y1+y2)*(y1+y2)));
				
	}
	
	public static void main(String[] args) {
		int x1 = 5;
		int x2 = 0;
		int y1 = 8;
		int y2 = 0;
		
		int multiplied_val = arithmetic_operation(x1, x2, y1, y2);
		
		if(multiplied_val > 0) {
		
			int output = (int) Math.sqrt(multiplied_val);
			System.out.println("The Square root of "+ multiplied_val + " is: " + output);
	
		}else{
			System.out.println("The Square root of "+ multiplied_val + "is: " + 0);
		}
	}
}

package com.java_training.qn30;

import java.util.Scanner;

public class Days {
	
	public static void main(String[] args) {
		String[] days = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturdat"};
		
		Scanner input = new Scanner(System.in);
		int indx = input.nextInt();
		if(indx > days.length) {
			System.out.println("The input should not be more than 7 days");
		}else {
			System.out.println(days[indx-1]);
		}
	}
}
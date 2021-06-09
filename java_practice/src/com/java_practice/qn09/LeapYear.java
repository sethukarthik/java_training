package com.java_practice.qn09;

public class LeapYear {
	public static void main(String[] args) {
		String arg = args[0];
		int year = Integer.parseInt(arg);
		boolean leap_year = false;
		if(year > 1752) {
			if(year % 4 == 0){
				leap_year = true;
				if(year % 100 == 0) {
					if(year % 400 == 0) {
						leap_year = true;
					}else {
						leap_year = false;
					}
				}				
			}
		}else {
			System.out.println("Please enter the valid year");
		}
		if(leap_year){
			System.out.println("I am Leap Year");
		}else{
			System.out.println("I am not a Leap Year");
		}
	}
}
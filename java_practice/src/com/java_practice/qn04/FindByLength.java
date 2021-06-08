package com.java_practice.qn04;

public class FindByLength {
	public static void main(String[] args) {
		String[] str = {"aa","b","ccc","dd"};
		int len = Integer.parseInt(args[0]);
		int len_count = 0;
		for(int i=0; i < str.length; i++) {
			if(str[i].length() == len) {
				len_count++;
			}
		}
		System.out.println("For length of " + len + " there are " + len_count + " elements are found!");
	}
}

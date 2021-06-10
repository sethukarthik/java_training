package com.java_practice.qn14;

public class ConcatChar {
	public static void main(String[] args) {
		String[] input_1 = {"abc", "de", "ram", "sethu"};
		int input_2 = 3;
		
		String conc_string = "";
		//Iterate the array
		for(String n: input_1) {
			if(n.length() >= 3) {
				conc_string += n.charAt(input_2-1);
			}else {
				conc_string += "$";
			}
		}
		System.out.println(conc_string);
	}
}

/*
1. Input = {"abc","da","ram"}
2. Input = 3
3. Get 3rd character of string and concatenate.
4. If string size if 2 add $
*/
package com.java_practice.qn05;

public class SumIntegerInSting {
	public static void main(String[] args) {
		String[] str = {"1AA", "14", "B12", "ABC"};
		// Remove character from the string
		// Add and store the value in a variable and print after the loop
		int sum_of = 0;
		for(int i=0; i < str.length; i++) {
			String val = str[i].replaceAll("([A-Z])", "");
			if(!val.isEmpty()) {
				if(val.length() == 1) {
					int int_val = Integer.parseInt(val);
					sum_of += int_val;
				}
				else{
					String[] values = val.split("");
					for(int j=0; j < values.length; j++) {
						int sum_val = Integer.parseInt(values[j]);
						sum_of += sum_val;
					}
				}
			}
		}
		System.out.println("The sum of integers in strings are: " + sum_of);
	}
}


//TODO: Since I am using nested loop to find the output. This is not good on time efficient.
//TODO: Need to know how to include method. Write the Integer parse in a separate method and call the method.

package com.java_training.qn21;

public class PowIndex {
	
	public static void main(String[] args) {
		int[] inp = {3,6,2,1};
		int output = 0;
		int i=0;
		
		while(i < inp.length) {
			output += (int) Math.pow(inp[i], i);
			i++;
		}
		System.out.println(output);
	}

}

package com.java_training.qn27;

import java.util.Scanner;

public class Comparision {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int inp1 = input.nextInt();
		int inp2 = input.nextInt();
		
		if(inp1 > inp2) {
			System.out.println(inp1 + " Greater than " + inp2);
		}else if(inp1 < inp2) {
			System.out.println(inp1 + " Less than " + inp2);
		}else {
			System.out.println(inp1 + " 100Equal to " + inp2);
		}
	}
}

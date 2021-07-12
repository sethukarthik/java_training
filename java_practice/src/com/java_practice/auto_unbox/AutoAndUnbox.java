package com.java_practice.auto_unbox;

public class AutoAndUnbox {
	public static final int i = 0;
	final int j = 1;
	
	public static void main(String[] args) {
		int i = 1;
		Integer j = 2;
//		System.out.println(i+j);
		System.out.println(AutoAndUnbox.i);
		AutoAndUnbox name = new AutoAndUnbox();
		System.out.println(name.j);
		System.out.println(name.i);
	}
}

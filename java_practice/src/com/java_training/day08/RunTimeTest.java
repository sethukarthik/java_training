package com.java_training.day08;

import java.io.IOException;

public class RunTimeTest {
	
	public static final int i = 1;
	public final static int j = 2;
	
	public static void main(String[] args) throws IOException {
//		Runtime name = new Runtime;	
		Runtime obj = Runtime.getRuntime();
		Runtime obj1 = Runtime.getRuntime();
		System.out.println(obj.availableProcessors());
		System.out.println(obj.freeMemory());
		System.out.println(obj.availableProcessors());
		System.out.println(obj.availableProcessors());
		Process p = obj.exec("notepad");
//		p.waitFor(10);
		System.out.println(i);
		System.out.println(j);
	}
	
}

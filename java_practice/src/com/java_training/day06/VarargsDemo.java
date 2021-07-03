package com.java_training.day06;

import com.java_training.inheritance.Book;
import com.java_training.inheritance.MathBook;
import com.java_training.inheritance.ScienceBook;

public class VarargsDemo {
	
	Days days;
	
//	static void read(Book... books) {
//		System.out.println("This is book");
//	}
//	
//	static void read(int a, Book... books) {
//		System.out.println("This is Integer Book");
//	}
//	
//	static void read(Object... objects) {		
//		System.out.println("This is Science");
//	}
	
	static void gen(String ...intg ) {
		for(String i : intg) {
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		Book bk = new Book();
		ScienceBook sb = new ScienceBook();
		MathBook mb = new MathBook();
		String d = Days.da();
		System.out.println(d);
//		read(10, bk);
//		read(sb);
		gen("sethu","Karthi");
		
		for(Days days : Days.values()) {
			System.out.println(days);
			System.out.println(days.ordinal());
		}
	}
}

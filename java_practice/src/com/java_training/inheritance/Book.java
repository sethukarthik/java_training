package com.java_training.inheritance;

public class Book {
	int id = 0;
//	int id = 1;
	String samp = "Testing";
	String chapterName = "BookClass";
	
	public Book(){
		System.out.println("I am Book COnstructor");
	}
	
	Book(int r){
		System.out.println("I am Book COnstructor-2");
	}
	
	void read() {
		System.out.println("I am from BOOK");
	}
	
	static void getRead() {
		System.out.println("This is STATIC BookMethod");
	}

}

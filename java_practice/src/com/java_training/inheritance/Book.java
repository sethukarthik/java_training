package com.java_training.inheritance;

public class Book {
	public int id = 110;
//	int id = 1;
	String samp = "Testing";
	String chapterName = "BookClass";
	
	public Book(){
//		System.out.println("I am Book COnstructor");
	}
	
	Book(int r){
//		System.out.println("I am Book COnstructor-2");
	}
	
	void read() {
//		System.out.println("I am from BOOK");
	}
	
	@Override
	public String toString() {
		return "GenericDemo [id=" + id + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
	static void getRead() {
		System.out.println("This is STATIC BookMethod");
	}

}

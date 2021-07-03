package com.java_training.inheritance;

public class MathBook extends Book{
//	int id=3;
	String chapterName="MathClass";
	
	public MathBook() {
//		this(10);
		super(10);
		// TODO Auto-generated constructor stub
		System.out.println("I am Math COnstructor");
	}
	
	MathBook(int i){
		super(10);
		System.out.println("I am Math COnstructor-2");
	}
	
	void read() {
		System.out.println(this.id);
		System.out.println("I am from MathBook");
	}

}

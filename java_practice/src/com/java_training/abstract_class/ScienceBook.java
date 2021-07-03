package com.java_training.abstract_class;

public class ScienceBook extends Book {
	
//	public ScienceBook() {
//		// TODO Auto-generated constructor stub
////		super();
////		this(1);
//	}
//	
//	public ScienceBook(int a) {
//		
//	}
	
	public void getName() {
		System.out.println("This is ScienceDepartment");
	}
	
	@Override
	void read() {
		System.out.println("Reading from Science Method");
	}
	
//	abstract void readS();
}

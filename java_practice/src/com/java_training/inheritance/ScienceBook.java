package com.java_training.inheritance;

public class ScienceBook extends Book {
//	public int id=1;
//	String chapterName="ScienceClass";
	
	@Override
	void read() {
//		super.read();
//		super.samp="haha";
//		super.id=1000;
//		System.out.println(this.id);
//		System.out.println(super.id);
		System.out.println("I am from ScienceBook");
	}
	
	public void Book(){
//		System.out.println("I am Book COnstructor");
	}
	
	static void getRead() {
		System.out.println("This is Static Science");
	}
	
//	@Override
//	void read() {
//		super.read();
//	}

}

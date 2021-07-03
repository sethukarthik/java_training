package com.java_training.hello;

public class HelloWorld {
	private int id;
	private String name;
	
	public HelloWorld(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public static void main(String[] args) {
		HelloWorld name1 = new HelloWorld(1, "sethu");
		HelloWorld name2 = new HelloWorld(2, "Karthik");		
		
		System.out.println(name1.id);
		System.out.println(name1.name);
		System.out.println(name2.id);
		System.out.println(name2.name);
	}
}

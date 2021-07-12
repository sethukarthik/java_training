package com.java_training.day07;

public class BufferBuilder implements Cloneable{
	
	public static void main(String[] args) {
		String test = "Testing";
		String test1 = "Testing";
		Val v = Val.TESTING;
		System.out.println(v);
		System.out.println(test.hashCode());
		System.out.println(test1.hashCode());
		test = test + "Main";
		System.out.println("------------");
		System.out.println(test1.hashCode());
		System.out.println(test.hashCode());
		System.out.println("------------");
		
		StringBuffer name = new StringBuffer("Sethu");
		System.out.println(name.hashCode());
		name.append("karthik");
		System.out.println(name.hashCode());
//		System.err
	}

}


enum Val{
	TESTING
}
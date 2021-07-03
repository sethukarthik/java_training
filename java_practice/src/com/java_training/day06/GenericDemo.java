package com.java_training.day06;

import java.util.ArrayList;

public class GenericDemo {
	
	int id=10;
	String name="Name";
	
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("sethu");
		list.add(1);

		String i = (String) list.get(0);
//		String i = (String) list.get(1);
//		System.out.println(i);
		
//		System.out.println(list.get(0));
		
//		review(1, 2);
//		review(1, 2, 3);
		
		GenericDemo g = new GenericDemo();
		System.out.println(g);
		
	}

	@Override
	public String toString() {
		return "GenericDemo [id=" + id + ", name=" + name + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

//	static <B,S> void review(B b, S s) {
//		System.out.println(b);
//		System.out.println(s);
//	}
//	
//	static <B,S, P> void review(B b, S s, P p) {
//		System.out.println(b);
//		System.out.println(s);
//		System.out.println(p);
//	}
}

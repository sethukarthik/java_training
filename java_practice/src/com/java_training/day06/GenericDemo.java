package com.java_training.day06;

import java.util.ArrayList;

import com.java_training.inheritance.Book;
import com.java_training.inheritance.ScienceBook;
import com.java_training.qn36.ProductDetails;

//import com.java_training.abstract_class.Book;

public class GenericDemo<B,S> {
	
	int id=10;
	String name="Name";
	
	public static void main(String[] args) {
		ArrayList<Book> list = new ArrayList();
		list.add(new Book());
//		list.add("sethu");
//		list.add(1);

//		String i = (String) list.get(0);
//		String i = (String) list.get(1);
//		System.out.println(i);
		
		Book bk = (Book)list.get(0);
//		System.out.println(bk.id);
		
		Book bok = new Book();
		ScienceBook sc = new ScienceBook();
//		review(new Book(), new ProductDetails());
		
		ProductDetails pd = new ProductDetails();
//		review(1, 2, 3);
		
		GenericDemo<Book, ScienceBook> g = new GenericDemo();
		System.out.println(g.review(bok, sc));
//		System.out.println(g);
		
	}
	
	B review(B b, S s) {
//		System.out.println(b);
//		System.out.println(s);
//		System.out.println(p);
		Object bs = b.toString();
		return (B) bs;
	}

	@Override
	public String toString() {
		return "GenericDemo [id=" + id + ", name=" + name + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

//	static <B,S,C,A> A review(B b, S s, C c, A a) {
//		System.out.println(b.toString());
//		System.out.println(s);
//		System.out.println(c);
//		return (A) "ad";
//	}
//	
}

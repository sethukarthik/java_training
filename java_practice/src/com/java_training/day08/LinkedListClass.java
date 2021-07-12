package com.java_training.day08;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListClass {
	public static void main(String[] args) {
		LinkedList<Integer> ll = new LinkedList<>();
		ll.add(0); //2
		ll.addLast(34);
		ll.addFirst(4); //0
		ll.add(1, 6); //1
		ll.addLast(43); //
//		ll.add(null);
		
		try {			
			Iterator<Integer> l1 = ll.listIterator(7); //0 //Runtimeerror
			while(l1.hasNext()) {
				System.out.println(l1.next());
			}
		}catch(IndexOutOfBoundsException e){
			System.out.println("Sethu Exception");
		}
//		System.out.println(l1.toString());
	}
}

package com.java_training.day08;

import java.util.ArrayList;

import java.util.Iterator;
import java.util.LinkedList;

public class ArrayListData {
	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList(); //[23,100,1,2] Last element -> array size increase
//		al.add("1");
//		al.add("2");
//		al.add("3");
//		al.add("4");
		al.add(1);
		al.add(0, 100);
		al.add(0,23);
//		al.get(3);
		
		System.out.println(al.get(4));

//		for (Object object : al) {
//			System.out.println(object);
//		}
//		System.out.println("--------------------------");
		
		Iterator<Integer> it = al.iterator();
		while(it.hasNext()) { //True
			int l = it.next(); //[0,2,3]
			if(l % 2 != 0) {
				System.out.println("coming");
			}else{				
				System.err.println("This is error");
			}
		}
		
//		LinkedList<String> ll = new LinkedList();
		
	}
}


// dev tools chrome
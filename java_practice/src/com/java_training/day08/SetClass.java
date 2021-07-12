package com.java_training.day08;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetClass {
	public static void main(String[] args) {
		//HashSet
//		HashSet<Integer> i = new HashSet<>();
//		i.add(2);
//		i.add(1);
//		i.add(5);
		
		HashSet<String> i = new HashSet<>();
		i.add("x");
		i.add("z");
		i.add("a");
		i.add(new String("a"));
		
		Iterator<String> it = i.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("==============");
		//LinkedHashSet
		LinkedHashSet<Integer> li = new LinkedHashSet<Integer>();
		li.add(2);
		li.add(1);
		li.add(3);
		
		Iterator<Integer> lit = li.iterator();
		while (lit.hasNext()) {
			System.out.println(lit.next());
		}
		System.out.println("==============");
		//TreeSet
		TreeSet<Integer> ti = new TreeSet<Integer>();
		ti.add(13);
		ti.add(2);
		ti.add(1);
		
		Iterator<Integer> tit = ti.iterator();
		while (tit.hasNext()) {
			System.out.println(tit.next());
		}
	}
}

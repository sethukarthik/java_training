package com.java_training.day08;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class HashMapClass {
	
	public static void main(String[] args) {	
		HashMap<Object, Object> names = new HashMap<>();
		names.put(1, "x");
		names.put(331, "z");
		names.put(22, null);
		
//		Iterator<Entry<Object, Object>> name = names.entrySet().iterator(); 
//		while(name.hasNext()) {
//			Entry<Object, Object> obj = name.next();
//			System.out.println(obj.getKey());
//			System.out.println(obj.getValue());
//		}
//
//		for(Map.Entry<Object, Object> m : names.entrySet()) {
//			System.out.println(m.getKey());
//			System.out.println(m.getValue());
//		}
//		
		System.out.println("--------------------------------------");
		
		LinkedHashMap<Integer, String> lhm = new LinkedHashMap<>();
		lhm.put(1, "x");
		lhm.put(331, "z");
		lhm.put(22, "a");
		
//		Iterator<Entry<Integer, String>> name = names.entrySet().iterator();
//		while(name.hasNext()) {
//			Entry<Integer, String> obj = name.next();
//			System.out.println(obj.getKey());
//			System.out.println(obj.getValue());
//		}

		for(Map.Entry<Integer, String> lh : lhm.entrySet()) {
			System.out.println(lh.getKey());
			System.out.println(lh.getValue());
		}
		
		System.out.println("--------------------------------------");
		
		TreeMap<Integer, String> thm = new TreeMap<>();
		thm.put(1, "x");
		thm.put(331, "z");
		thm.put(22, "a");
		
		Iterator<Entry<Integer, String>> name = thm.entrySet().iterator();
		while(name.hasNext()) {
			Entry<Integer, String> obj = name.next();
			System.out.println(obj.getKey());
			System.out.println(obj.getValue());
		}

//		for(Map.Entry<Integer, String> th : thm.entrySet()) {
//			System.out.println(th.getKey());
//			System.out.println(th.getValue());
//		}
		
	}
}

// 

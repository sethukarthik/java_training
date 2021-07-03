package com.java_training.day08;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;

public class DataStructure {
	public static void main(String[] args) {
//		// Creating an empty HashSet
        HashSet<String> set = new HashSet<String>();
  
        // Use add() method to add elements into the Set
        set.add("Welcome");
        set.add("To");
        set.add("Geeks");
        set.add("4");
        set.add("Geeks");
  
        // Displaying the HashSet
//        System.out.println("HashSet: " + set);
  
        // Creating an iterator
        Iterator value = set.iterator();
  
        // Displaying the values after iterating through the set
//        System.out.println("The iterator values are: ");
//        while (value.hasNext()) {
//            System.out.println(value.next());
//        }
        
        HashMap<Integer, String> name = new HashMap<>();
        name.put(1, "a");
        name.put(2, "b");
        name.put(3, "c");
        System.out.println("HashMap: " + name);
        Iterator<Entry<Integer, String>> it = name.entrySet().iterator();
        while (it.hasNext()) {
        	Entry<Integer, String> obj = it.next();
        	System.out.println(obj.getKey());
        	System.out.println(obj.getValue());
		}
        
	}
	
}

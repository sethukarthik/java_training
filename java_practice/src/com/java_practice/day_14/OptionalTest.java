package com.java_practice.day_14;

import java.util.Optional;

public class OptionalTest {
	public static void main(String[] args) {
		Employee emp = null;
		System.out.println(emp);
		Optional<Employee> e = Optional.ofNullable(emp);
		if(e.isEmpty()) {
			System.out.println("Empty");
		}
	}
}

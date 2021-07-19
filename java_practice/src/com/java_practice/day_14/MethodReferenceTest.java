package com.java_practice.day_14;

import java.util.function.Function;

public class MethodReferenceTest {
	
	void test() {
		System.out.println("asf");
	}
	public static void main(String[] args) {
		Employee emp = new Employee(1,"sethu","google",22342.23F);
		Function<Employee, String> emp1 = (empl) -> empl.getCompany();
		
	}
}

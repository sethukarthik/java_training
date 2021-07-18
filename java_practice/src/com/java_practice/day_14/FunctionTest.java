package com.java_practice.day_14;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionTest {
	
	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<Employee>();
		Employee emp = new Employee(1,"sethu","google",22342.23F);
		Employee emp1 = new Employee(2,"Nirmal","ebay",42342.23F);
		Employee emp2 = new Employee(3,"Natz","google",12342.23F);
		Employee emp3 = new Employee(4,"Kavi","ebay",62342.23F);
		Employee emp4 = new Employee(5,"Nagesh","google",25342.23F);
		empList.add(emp);
		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
		empList.add(emp4);
		
		System.out.println(empList);
		
		Function<Employee, Employee> orgFun = (empl) -> {
			System.out.println("Innser Function");
			empl.setCompany("IPhone");
			return empl;
		};
		orgFun.apply(emp4);
		System.out.println(empList);
		
		Function<Employee, String> orgFun1 = (empl) -> {
			System.out.println(empl.getCompany().toUpperCase());
			return empl.getCompany().toUpperCase();
		};
		printEmp(empList, orgFun1);
	}
	
	private static void printEmp(List<Employee> list, Function<Employee, String> fun) {
		for (Employee employee : list) {
			fun.apply(employee);
		}
	}
}

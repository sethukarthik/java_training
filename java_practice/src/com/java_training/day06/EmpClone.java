package com.java_training.day06;

public class EmpClone {
	public static void main(String[] args) throws CloneNotSupportedException {
		EmployeeHash e = new EmployeeHash(10,"set");
		Class name = e.getClass();
		System.out.println(name);
		e.setDept(new Department(1, "sd"));
		EmployeeHash em = (EmployeeHash) e.clone();
		System.out.println(e);
		System.out.println(em);
		System.out.println(e.getDept());
		System.out.println(em.getDept());		
		
	}
}

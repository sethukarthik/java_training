package com.java_practice.clonable;

public class CloneTest {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		Employee emp = new Employee();
		System.out.println(emp.getName().hashCode());
		System.out.println(emp.hashCode());
		Employee emp1 = new Employee();
		System.out.println(emp1.hashCode());
		System.out.println(emp1.getName().hashCode());
		Employee empC = (Employee) emp.clone();
		System.out.println(empC.getName().hashCode());
		System.out.println(empC.hashCode());
		CloneTest ct = new CloneTest();
//		System.out.println(emp.delete(empC));
		System.out.println(delete(empC));
		System.out.println(delete(ct));
	}
	
	public static boolean delete(Object object) {
		if(!(object instanceof deletable)) {
			return false;
		}
		return true;
	}
}

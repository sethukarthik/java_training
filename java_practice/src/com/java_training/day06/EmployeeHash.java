package com.java_training.day06;

import java.util.Objects;

public class EmployeeHash implements Cloneable {
	public int id;
	public String name;
	private Department dept;
	
	public Department getDept() {
		return dept;
	}

	public void setDept(Department dept) {
		this.dept = dept;
	}

	public EmployeeHash() {
		
	}
	
	public EmployeeHash(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public static void main(String[] args) {
		EmployeeHash e1 = new EmployeeHash();
		e1.id = 10;
		e1.name = "sethu";
		EmployeeHash e2 = new EmployeeHash();
		e2.id=20;
		e2.name="karthik";
		EmployeeHash e3 = new EmployeeHash();
		e3.id=10;
		e3.name="sethu";
		System.out.println(e1==e2);
		System.out.println(e1.equals(e2));
		System.out.println(e1);
		System.out.println(e2);
		System.out.println("Object Equal");
		System.out.println(e1==e3);
		System.out.println(e1.equals(e3));
		System.out.println(e3);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmployeeHash other = (EmployeeHash) obj;
		return id == other.id && Objects.equals(name, other.name);
	}
	
	public Object clone() throws CloneNotSupportedException {
		return super.clone();	
	}
	
}
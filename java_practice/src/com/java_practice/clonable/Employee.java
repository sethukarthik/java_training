package com.java_practice.clonable;

import java.util.Objects;

public class Employee implements Cloneable, deletable {
	int i = 10;
	String name = "sethu";
	
	public Employee() {
		this(1,"");
	}
	
	public Employee(int i, String name) {
		super();
		this.i = 20;
		this.name = "lakrth";
	}

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
	    return super.clone();
	}

//	@Override
//	public int hashCode() {
//		return Objects.hash(i, name);
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Employee other = (Employee) obj;
//		return i == other.i && Objects.equals(name, other.name);
//	}

	public static void main(String[] args) {
		
	}
}

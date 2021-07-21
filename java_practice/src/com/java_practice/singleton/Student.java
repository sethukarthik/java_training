package com.java_practice.singleton;

public class Student implements Anna {
	
	
	public Student() {
		Anna anna = new Anna() {
			@Override
			public void add(int a, int b) {
				System.out.println(a+b);	
				Anna.mult(a, b);
			}
			@Override
			public int sub(int a, int b) {
				return Anna.super.sub(a, b);
			}
			
		};
		anna.add(1, 2);
		anna.sub(2, 2);
	}
	
	public void inM(int j) {
//		j = 0;
		class clasMethod{
//			int i;
			public clasMethod() {
//				super();
				// The Method parameter cannot modifier insider inner method class but can we print
				System.out.println(j);
			}
		}
		clasMethod me = new clasMethod();
//		j++;
	}

	public static void main(String[] args) {
//		School name = new School(2);
//		System.out.println(name.id);
		Student st = new Student();
		Anna.mult(4, 2);
		st.inM(9);
	}

	@Override
	public void add(int a, int b) {
		// TODO Auto-generated method stub
		
	}
}

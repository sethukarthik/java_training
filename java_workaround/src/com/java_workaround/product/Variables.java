package com.java_workaround.product;

public class Variables {

	int instanceVariable; // instance var for object
	static int staticInt; // class object
	final int finalInit = 0;
	static final int sFInt = 0;
	
	void voidMethod() {
		int localVar = 0; // local variable must to initialize
		System.out.println(instanceVariable);
		System.out.println(staticInt);
		System.out.println(finalInit);
		System.out.println(sFInt);
		System.out.println(localVar);
	}
	
	static void staticMethod() {
		int localVar = 0;
		Variables var = new Variables();
		 System.out.println(var.instanceVariable); // instance variable cannot be access inside the static method without object of class
		System.out.println(staticInt);
		 System.out.println(var.finalInit); 
		System.out.println(sFInt);
		System.out.println(localVar);
	}

}

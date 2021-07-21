package com.java_practice.final_demo;

public class FinalDemo {
	final int DEMO = 10;
	
	//Final Variable -> Athu oru constant
	//Final Class -> We cannot inhert
	//Final Method -> We cannot override but overloading is possible(athu new method consider agum)
	//Assigning
		//Inside Constructor
		// Static block
		// Instance block
	
	// Initialize
		//Inside method as local final
	
	final int CAPACITY;
	
	final String NAME;
	
	static final double NR = 1.0D;
	
	static final float FT;
	
	final StringBuffer sb = new StringBuffer("Final");
	
	//Before Constructor
	{
		CAPACITY = 10;
	}
	//Class Compile 
	static {
		FT = 10.00F;
	}

	public FinalDemo() {
		this(1,1);
	}
	
	public FinalDemo(int i) {
		this.NAME = "Sethu";
	}
	
	public FinalDemo(int i, int j) {
		this.NAME = "";
	}
	
	public static void main(String[] args) {
		final int i;
		i=0;
		FinalDemo fd = new FinalDemo();
		fd.sb.append(" Demo");
		// object state change
		System.out.println(fd.sb);
//		StringBuffer sd
		final int[] a = {1,2,3};
		a[1] = 1;
	}
	
}
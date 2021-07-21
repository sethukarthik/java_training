package com.java_practice.final_demo;

public class FinalAccess {
	
	// a final variable
    // direct initialize
    final int THRESHOLD = 5;
      
    // a blank final variable
    final int CAPACITY;
    
    final String NAME;
      
    // another blank final variable
    final int  MINIMUM;
    
    final StringBuffer sb = new StringBuffer("Geeks");
      
    // a final static variable PI
    // direct initialize
    static final double PI = 3.141592653589793;
      
    // a  blank final static  variable
    static final double EULERCONSTANT;
      
    // instance initializer block for 
    // initializing CAPACITY
    {
        CAPACITY = 25;
        NAME = "SETHU";
//        MINIMUM = -1;
    }
      
    // static initializer block for 
    // initializing EULERCONSTANT
    static{
        EULERCONSTANT = 2.3;
    }
      
    // constructor for initializing MINIMUM
    // Note that if there are more than one
    // constructor, you must initialize MINIMUM
    // in them also
    public FinalAccess() {
    	this(1,1);
//    	this.MINIMUM = 0;
    }
    
    public FinalAccess(int i) {
        MINIMUM = -1;
    }
    
    public FinalAccess(int i, int j) {
		this.MINIMUM = 20;
    }
    
    //Final with method cannot be overridden but can be overloaded
    final void m1() {
    	System.out.println("Final Method");
    }
    
    //consider as new method
    void m2(int i) {
    	System.out.println("Method Final 2");
    }
    
    public static void main(String[] args) {
		FinalAccess fa = new FinalAccess();
		System.out.println(fa.MINIMUM);
		FinalAccess fa1 = new FinalAccess(1);
		System.out.println(fa1.MINIMUM);
		FinalAccess fa2 = new FinalAccess(1,1);
		System.out.println(fa2.MINIMUM);
		int io = fa.CAPACITY;
		System.out.println(io);
		io += 1;
		System.out.println(fa.sb.hashCode());
		System.out.println(fa.sb);
		fa.sb.append(" For Geeks");
		System.out.println(fa.sb.hashCode());
		System.out.println(fa.sb);
		//we can not reassing the object but we can changes the state of an object
//		fa.sb = new StringBuffer("asd");
		System.err.println(fa.sb);
		
		int ar[] = {1,2,3};
		for(final int i : ar) {
			System.out.println(i+1); // Here we are changing the internal state of final
		}
    }
    
}

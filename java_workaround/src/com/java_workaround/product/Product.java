package com.java_workaround.product;

public class Product {

	// Instance variable or states or properties
	int id;
	String name;
	double price;
	byte byteVal;
	short shortVal;
	long longVal;
	boolean boolVal;
	float flVal;
	//Static Variables
	static String org = "Amazon";
	
//	blocks
	static {
		System.out.println("This is first Static block");
//		System.out.println(Product.org);
	}
	
	static void print1() {
		System.out.println("This is static method");
	}
		
	//Instance method
	void print() {
		System.out.println(id + name + price);
	}
	
	// Instance initializer block
	{
        System.out.println("intance initializer block");
    }
	
	// Constructor
	public Product() {
		System.out.println("This is constructore");
	}
	
	public String method1(String val) {
//		String val = "sethu";
		return val;
	}
	
	public static void method2(int val) {
		System.out.println(val);
//		return val;
	}
	
	public static void main(String[] args) {
		Product product	= new Product();
		Product product1	= new Product();
		product1.method1("sethu");
		
//		System.out.println(product.id);
//		System.out.println(product.name);
//		System.out.println(product.price);
//		System.out.println(product.byteVal);
//		System.out.println(product.shortVal);
//		System.out.println(product.longVal);
//		System.out.println(product.boolVal);
//		System.out.println(product.flVal);
		
//		System.err.println(product);
//		product.id = 1;
//		product.name = "Oppo";
//		product.price = 20000;
		
		System.out.println(Product.org);
		
		print1();
	}
	
	static {
		System.out.println("This is last Static block");
	}
	
}

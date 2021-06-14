package com.java_workaround.product;

public class ProductAccess {
	int pro = 1;
	static String ORG = "ProductAccess";
	
	public int getPro() {
		return pro;
	}

	public void setPro(int pro) {
		this.pro = pro;
	}

	static int method1(int val) {
		System.out.println("Hello World");
		System.out.println("Hello World");
		return val;
	}
	
	public static void main(String[] args) {
		Product product = new Product();
//		Product.print1();
//		Product.method2(90);
		System.out.println(ORG);
		System.out.println(Product.org);
//		ProductAccess pa = new ProductAccess();
		Product.method2(0);
		method1(0);
	}
}

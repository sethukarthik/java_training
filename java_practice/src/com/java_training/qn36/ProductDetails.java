package com.java_training.qn36;

import java.util.Scanner;

public class ProductDetails {
	private long id;
	private String productName;
	private String supplierName;	
	
	public void setId(long id) {
		this.id = id;
	}

	public long getId() {
		return id;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getSupplierName() {
		return supplierName;
	}

	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}
	
	public static void main(String[] args) {
		ProductDetails pd = new ProductDetails();
		Scanner io = new Scanner(System.in);
		long pid = io.nextLong();
		String pname = io.next();
		String psname = io.next();
		
		pd.setId(pid);		
		pd.setProductName(pname);		
		pd.setSupplierName(psname);		
		
		System.out.println(pd.id + "-" + pd.getProductName() + "-" + pd.getSupplierName());
	}
}

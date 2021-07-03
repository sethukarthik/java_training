package com.java_training.qn37;

public class ProductDetailsC {
	
	private long id;
	private String productName;
	private String supplierName;
	
	public ProductDetailsC() {
		
	}
	
	public ProductDetailsC(long id, String productName, String SupplierName) {
		this.id = id;
		this.productName = productName;
		this.supplierName = supplierName;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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
		
	}
	
}
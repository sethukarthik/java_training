package com.java_training.qn37;

public class ProductInfo {
	public static void main(String[] args) {
		ProductDetailsC pdc = new ProductDetailsC(1, "Sethu", "TestLeaf");
		System.out.println(pdc.getId() + " - " + pdc.getProductName() + " - " + pdc.getSupplierName());
		ProductDetailsC pdc2 = new ProductDetailsC(2, "Sethu2", "TestLeaf2");
		System.out.println(pdc2.getId() + " - " + pdc2.getProductName() + " - " + pdc2.getSupplierName());
	}
}

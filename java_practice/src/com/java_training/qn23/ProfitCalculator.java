package com.java_training.qn23;

import java.math.BigDecimal;

public class ProfitCalculator {
	private BigDecimal sellingPrice;
	private BigDecimal buyingPrice;

	public void setSellingPrice(BigDecimal sellingPrice) {
		this.sellingPrice = sellingPrice;
	}
	
	public void setBuyingPrice(BigDecimal buyingPrice) {
		this.buyingPrice = buyingPrice;
	}
	
	public BigDecimal getBuyingPrice() {
		return buyingPrice;
	}
	
	public BigDecimal getSellingPrice() {
		return sellingPrice;
	}
	
	
	public static void main(String[] args) {
		ProfitCalculator obj = new ProfitCalculator();
		obj.setSellingPrice(new BigDecimal("120.00"));
		obj.setBuyingPrice(new BigDecimal("100.00"));
		System.out.println(obj.getBuyingPrice());
		System.out.println(obj.getSellingPrice());
		BigDecimal profitValue = obj.getSellingPrice().subtract(obj.getBuyingPrice());
		System.out.println("Profit per product is :" + profitValue);
	}
}

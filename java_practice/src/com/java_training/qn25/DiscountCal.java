package com.java_training.qn25;

public class DiscountCal {
	public double price1;
	public double price2;
	private double gTotal;
	private int discount;
	
	public DiscountCal() {
		this.discount = 10; 
	}
	
	public void setafterDiscount(double val) {
		this.gTotal = val;
	}
	
	public double getafterDiscount() {
		return gTotal;
	}
	
	public static double calcu(double p1, double p2, int disc) {
		double sumPrice = sumPrice(p1, p2);
		double disPrice = calDiscount(sumPrice, disc);
		return (sumPrice - disPrice); 
	}
	
	public static double sumPrice(double p1, double p2) {
		return (p1 + p2);
	}
	
	public static double calDiscount(double sumPrice, int disc) {
		return ((sumPrice*disc)/100);
	}
	
	public static void main(String[] args) {
		DiscountCal dis = new DiscountCal();
		double op = calcu(20.50, 45.40, dis.discount);
		dis.setafterDiscount(op);
		System.out.println(dis.getafterDiscount());
	}

}

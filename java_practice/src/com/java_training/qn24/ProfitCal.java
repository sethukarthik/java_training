package com.java_training.qn24;

public class ProfitCal {
	private double profitePercentage;
	
	public double getProfitePercentage() {
		return profitePercentage;
	}

	public void setProfitePercentage(double profitePercentage) {
		this.profitePercentage = profitePercentage;
	}
	
	public static double percentageCal(int x, int y, int z) {
		double perPrice =  ((double)y / 12);
		double profitPer = z - perPrice;
		double proPer = ((profitPer/perPrice)*100);
		return (Math.round(proPer * 100.0) / 100.0);
	}
	
	public static void main(String[] args) {
		AccountBook accBook = new AccountBook();
		double profit = percentageCal(accBook.getX(),accBook.getY(),accBook.getZ());
		ProfitCal p = new ProfitCal();
		p.setProfitePercentage(profit);
		System.out.println(String.format("%.2f", p.getProfitePercentage()) + "%");
	}
}

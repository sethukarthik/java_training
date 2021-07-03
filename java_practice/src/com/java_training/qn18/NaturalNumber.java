package com.java_training.qn18;

public class NaturalNumber {
	private int sum;
	private int x;
	private int y;
	private int power;
	public int n;

	public NaturalNumber(){
		this.x = 3;
		this.y = 5;
		this.power = 2;
	}
	
	public int getSum() {
		return sum;
	}
	
	public void setSum(int sum) {
		this.sum = sum;
	}
	
	public int getSquare() {
		return n;
	}
	
	public void setSquare(int n) {
		this.n = n;
	}
	
	public void calculateSum(int n) {
		int x = this.x;
		int y = this.y;
		int s1 = ((n/x)) * (2 * x + (n/x -1) * x)/2;
		int s2 = ((n/y)) * (2 * y + (n/y -1) * y)/2;
		int s3 = ((n/(x * y))) * (2 * (x * y) + (n/(x * y) -1) * (x * y))/2;
		setSum(s1 + s2 - s3);
	}
	
	public void calculateDifference(int n) {
		int i = 1;
		int sumOfSquare = 0;
		int squareOfSum = 0;
		while(i <= n) {
			sumOfSquare += (int) Math.pow(i, this.power);
			i++;
			squareOfSum += i;
		}
		squareOfSum = (int) Math.pow(squareOfSum, power);
		
		if(sumOfSquare != 0 && squareOfSum != 0) {
			if(sumOfSquare < squareOfSum) {				
				setSquare(squareOfSum - sumOfSquare);
			}else {
				setSquare(sumOfSquare - squareOfSum);				
			}
		}else {
			setSquare(0);
		}
	}
	
	public static void main(String[] args) {
		NaturalNumber nn = new NaturalNumber();
	}

}

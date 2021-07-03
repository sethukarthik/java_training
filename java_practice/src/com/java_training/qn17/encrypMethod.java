package com.java_training.qn17;

public class encrypMethod {
	private String inpValue;
	final static String alpha = "abcdefghijklsmopqrstuvwxyz";
	
	public String getInpValue() {
		return inpValue;
	}

	public void setInpValue(String inpValue) {
		this.inpValue = inpValue;
	}
	
	public void oddPosition() {
		String output = "";
		String[] lowCase = getInpValue().toLowerCase().split("");
		for(int i=0; i < lowCase.length; i++) {
			if(i % 2 == 0) {
				int ind = alpha.indexOf(lowCase[i]);
				if(alpha.length() == ind) {
					output += alpha.charAt(0);
				}else{
					output += alpha.charAt(ind+1);
				}
			}else {
				output += lowCase[i];							
			}
		}
		setInpValue(output);
	}
	
	public static void main(String[] args) {
		encrypMethod encObj = new encrypMethod();
		encObj.setInpValue(args[0]);
		if(encObj.getInpValue().length() > 0) {
			encObj.oddPosition();
			System.out.println(encObj.getInpValue());
		}else {
			System.out.println("The input should not be empty");
		}
	}
}
/*
 * Create a hash map and store all the alphabetic value with increment value
 * I have done with string of characters.
 * */

package com.java_training.qn22;

public class LastMatch {
	
	public static void main(String[] args) {
		String str = "the picture was great";
		
		if(str.length() != 0) {
			int len = str.length();
			Character firstLetter = str.charAt(0);
			Character lastLetter = str.charAt(str.length()-1);
			if(firstLetter.equals(lastLetter)) {
				System.out.println(1);
			}else {
				System.out.println(-1);				
			}
		}
	}
}

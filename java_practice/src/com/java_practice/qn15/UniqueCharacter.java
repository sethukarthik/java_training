package com.java_practice.qn15;

public class UniqueCharacter {
	public static void main(String[] args) {
		String inp_1 = "helloworld";
		
		StringBuilder uniq_str = new StringBuilder();
	
		for(int i=0; i < inp_1.length(); i++ ) {
			char single_char = inp_1.charAt(i);
			if(!uniq_str.isEmpty() && uniq_str.indexOf(String.valueOf(single_char)) == -1) {
				uniq_str.append(String.valueOf(single_char));
			}else if(uniq_str.isEmpty()){
				uniq_str.append(String.valueOf(single_char));
			}
		}
		System.out.println(uniq_str);
	}
}

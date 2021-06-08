package com.java_practice.qn02;

public class FindVowels {
	public static void main(String[] args) {
		int no_of_vowels = 0;
		
		String input_characters = args[0];
		input_characters = input_characters.toLowerCase();

		for(int i=0; i < input_characters.length(); i++) {
			if(input_characters.charAt(i) == 'a' || input_characters.charAt(i) == 'e' || input_characters.charAt(i) == 'i' || input_characters.charAt(i) == 'o' || input_characters.charAt(i) == 'u') {
				no_of_vowels ++;
			}
		}
		
		if(no_of_vowels == 0) {
			System.out.println("There is not vowels in the input");
		}else {
			System.out.println("The number of vowels in the inputs are: " + no_of_vowels);
		}
	}
}
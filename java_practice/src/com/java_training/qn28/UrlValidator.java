package com.java_training.qn28;

import java.util.Scanner;

public class UrlValidator {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		
		String url = inp.next();
		
		int validUrl = url.indexOf("http");
		if(validUrl != -1) {
			validUrl = url.indexOf("https");
			if(validUrl != -1) {
				System.out.println(url + " starts with \"https\"");
			}else {
				System.out.println(url + " does not starts with \"https\"");
			}
		}else {
			System.out.println(url + " does not starts with \"https\"");
		}
	}
}

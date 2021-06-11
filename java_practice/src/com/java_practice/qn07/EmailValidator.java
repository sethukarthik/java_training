package com.java_practice.qn07;

public class EmailValidator {
	public static void main(String[] args) {
		String email = "sethu@gmail.com";
		boolean com = false;
		boolean addr_length = false;
		boolean mail_id = false;
		
		String get_com = "";
		//validate .com
		get_com = email.substring(email.length() - 4);
		if(get_com.equals(".com")){
			com = true;
		}
		if(com) {
			//validate mail domain address
			int start = 0;
			int end = 0;
			int ad_count = 0;
			int dom_count = 0;
			for(int i=0; i < email.length(); i++) {
				char c= email.charAt(i);
				if(c == '@') {
					ad_count ++;
					start = email.indexOf(c);
				}else if(c == '.') {
					dom_count ++;
					end = email.indexOf(c);
				}
			}
			if(ad_count == 1 && dom_count == 1) {
				if((end - start) >= 4) {
					mail_id = true;
				}
				if(start >= 4) {
					addr_length = true;
				}
			}
		}
		if(com && mail_id) {
			System.out.println(email + " Hurrey! is a valid address.");
		}else {
			System.out.println(email + " Oops! please check your mail address.");
		}
	}
}

/*
Test Case
1. @ and . should present
2. @ and . should not repeat
3. There should be four characters between @ and .
4. There should be at least 3 characters before @
5. .com should present at last
*/
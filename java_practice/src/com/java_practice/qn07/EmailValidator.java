package com.java_practice.qn07;

public class EmailValidator {
	public static void main(String[] args) {
		String email = "sethu@gmail.com";
		boolean com = false;
		boolean domain = false;
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
			String[] domain_id = email.split("@");
			if(domain_id.length == 2) {
				domain = true;
				if(domain_id[0].length() > 3) {
					addr_length = true;
				}
			}
			if(domain && addr_length) {
				int count = 0;
				for(int i=0; i < email.length(); i++) {
					char c = email.charAt(i);
					if(c == '@') {
						count = 0;
					}
					System.out.println(c);
					System.out.println(count);
					if(count == 4 && c != '.') {
						mail_id = true;
						break;
					}
					count += 1;
				}
				
			}
		}
		System.out.println(com);
		System.out.println(domain);
		System.out.println(addr_length);
		System.out.println(mail_id);
		if(com && domain && addr_length && mail_id) {
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
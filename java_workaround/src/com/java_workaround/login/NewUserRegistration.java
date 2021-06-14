package com.java_workaround.login;

import com.java_workaround.product.Product;

public class NewUserRegistration {
	public static void main(String[] args) {
		UserLogin userlogin = new UserLogin(1, "SethuKarthik", 9566841129l);
		// Get the id using getter method
		System.out.println(userlogin.getUserName());
		
		Product product = new Product();
		Product.method2(0);
	}
}

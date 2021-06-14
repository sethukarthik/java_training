package com.java_workaround.login;

public class UserLogin {
	private int id;
	private String userName;
	private long phoneNumber;
	
	public UserLogin(int id, String userName, long phoneNumber){
		this.id = id;
		this.userName = userName;
		this.phoneNumber = phoneNumber;
	}
	
	public static void main(String[] args) {
		UserLogin userlogin = new UserLogin(1, "Sethukarthik", 9566841129l);
		System.out.println(userlogin.phoneNumber);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
}

package com.java_training.qn38;

public class Trainee {
	private long employeeId;
	private String name;
	private static final String BATCH_CODE = "CHNFSD";
	
	public Trainee() {
		
	}

	public Trainee(long id, String name) {
		this.employeeId = id;
		this.name = name;
	}
	
	public long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(long employeeId) {
		this.employeeId = employeeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static String getBatchCode() {
		return BATCH_CODE;
	}
	
	public static void main(String[] args) {
		Trainee t1 = new Trainee(123456, "SethuKarthik");
		Trainee t2 = new Trainee(654321, "ShriKali");
		System.out.println(t1.toString() + " - " + getBatchCode());
		System.out.println(t2.toString() + " - " + getBatchCode());
	}

}

package com.java_training.compandaggre;



public class Employee {
	private int id;
	private String name;
	private Project project;
	
	public Employee() {
//		super();
 	}
	
	public Employee(int id, String name, Project project) {
		this.id = id;
		this.name = name;
		this.project = project;
	}
//	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}
	
	String printDetails() {
		return (id + "-" + name + "-" + project.getId() + "-" + project.getName());
	}
}

package com.java_training.compandaggre;

//import com.archiev_demo.archieve.Demo;

public class Client {

	public static void main(String[] args) {
		
		Project project = new Project();
		project.setId(10);
		project.setName("JavaTraining");
		
		Project project2 = new Project(200, "Spring");
		
		Employee emp1 = new Employee();
		emp1.setId(1);
		emp1.setName("Sethu");
		emp1.setProject(project);
		
		Employee emp2 = new Employee(2, "Karthik", project2);
		
		Employee emp3 = new Employee(3, "murugan", project2);
		
		System.out.println(emp1.printDetails());
		System.out.println(emp2.printDetails());
		System.out.println(emp3.printDetails());
		
//		Demo demo = new Demo();
//		demo.print();
	}
	
}

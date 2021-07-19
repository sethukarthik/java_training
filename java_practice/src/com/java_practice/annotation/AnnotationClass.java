package com.java_practice.annotation;

import java.lang.reflect.Method;

public class AnnotationClass {
	
	int id;
	String desc;
	
	public AnnotationClass(int id, String desc) {
		super();
		this.id = id;
		this.desc = desc;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getDesc() {
		return desc;
	}
	
	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	@TrainingAnnotation(desc = "Training", id = 20)
	public void setUp() {
		System.out.println(desc);
		System.out.println(id);
	}
	
	public static void main(String[] args) throws ClassNotFoundException {
		//This is called reflection and need to analyze more on this
		 Class<?> classObj = Class.forName("com.java_practice.annotation.AnnotationClass");
		 // This will get all the methods from the above defined class
		 Method methods[] = classObj.getDeclaredMethods();
		 for (Method method : methods) {			 
			 System.out.println(method);
			 if(method.getName().indexOf("setUp") != -1){
				TrainingAnnotation trainingAnno = method.getAnnotation(TrainingAnnotation.class);
				System.out.println(trainingAnno.desc());
				trainingAnno.id();
				//System.out.println(trainingAnno.desc());
			}
		 }
		 System.out.println();
	}

}

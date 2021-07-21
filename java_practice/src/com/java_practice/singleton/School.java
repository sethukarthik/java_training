package com.java_practice.singleton;

class School {
	int id;
	
	public School(int id) {
		super();
		this.id = id;
	}
	
	public void inSM() {
		System.out.println("From outer school class void");
	}
	
	static class InnerS{
		
		public InnerS(){
			System.out.println("From Const");
		}
		
		public void si() {
			
		}
		
		public static void main(String[] args) {
			System.out.println("InnerStaticMain");
		}
	}
	
	class InnerSchool {
		
		public InnerSchool(){
			System.out.println("From InnserSchool Const");
		}
		
		public void inSM() {
			System.out.println("From inner school class void");
		}
		
		//Static method cannot be added inside the instance class
//		static void sM() {
//			System.out.println("Static Inner");
//		}
	}



	public static void main(String[] args) {
		School s = new School(1); 
		System.out.println(s.id);
		InnerSchool is = s.new InnerSchool();
		is.inSM();
		s.inSM();
		
//		InnerS is = new InnerS
		
	}
}

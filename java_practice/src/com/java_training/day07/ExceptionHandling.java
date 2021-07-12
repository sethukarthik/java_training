package com.java_training.day07;

public class ExceptionHandling {
	public static void main(String[] args) throws StringIndexOutOfBoundsException {
		System.out.println("Heloo");
		System.out.println(1/1);
//		try {
//			System.out.println("Heloo".charAt(5)); 
//		}catch(StringIndexOutOfBoundsException e) {
//			System.out.println(e);
//		}
//		SQL.connections // Multiple catch.
		try {			
			add();
		}catch(ArithmeticException e) {			
				System.out.println(e);
		}
		try {
			getStringVal();
//			"aset".charAt(6);
//			"SELECT * FROM ";
//		

		}catch(StringIndexOutOfBoundsException e) {			
			System.out.println(e);
		}
		finally { //Execution is mandatory
			System.out.println("This is final");
			try {
				doClone();
			} catch (IllegalAccessException e) {
				System.out.println(e);
			}finally{
				System.out.println("This is second finally");
			}
		}
		
		try {
            throw new Exception("Custom Exception");
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
	}
	
	static void getStringVal() {
		System.out.println("sethu".charAt(8));
	}
	static void add(){
		System.out.println(1/3); //Infinity
		"sehu".charAt(6);
	}
	
	static void doClone() throws IllegalAccessException {
//		System.out.println("set".charAt(55));
		throw new IllegalAccessException();
	}
	
	
}


// RunTime -> After compiler done with his job.
// CompileTime -> During build the code.

//Type of Exception
//Handling -> Try, Catch, Finally
//Declare ->
package com.java_training.day07;

public class HandleCustomException {
	public static void validateId(int i) throws InvalidIdException{
		if(i < 2) {
			throw new InvalidIdException("This is invalid id exception asdfsd");
		}else{
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		Integer i = 1;
		try {
			validateId(i);
		} catch (InvalidIdException e) {
			System.err.println(e.getMessage());
		} finally {
			System.out.println("This is finally ");
		}
	}
}
package com.java_training.qn40;

import java.util.Scanner;

public class FindArea {
	public static void main(String[] args) {
		
		Scanner io = new Scanner(System.in);
		System.out.println("Enter 1 - Square, 2 - Rectangle, 3 - Circle");
		int inp = io.nextInt();
//		Shape shape;
		switch (inp) {
		case 1:
			System.out.println("You have selected Square");
			System.out.println("Please entire size of square: ");
			int size = io.nextInt();
			Shape shape = new Square(size);
			System.out.println(shape.calculateArea());
			break;
		case 2:
			System.out.println("You have selected Rectangle");
			System.out.println("Please entire size length and breadth: ");
			int l = io.nextInt();
			int b = io.nextInt();
			Shape ret = new Rectangle(l, b);
			System.out.println(ret.calculateArea());
			break;
		case 3:
			System.out.println("You have selected Circle");
			System.out.println("Please entire size radius of circle: ");
			int c = io.nextInt();
			Shape cl = new Circle(c);
			System.out.println(cl.calculateArea());
			break;
		default:
			System.out.println("Please entire valid input");
			break;
		}
	}
}

package com.java_training.abstract_class;

public class BookTest {
	public static void main(String[] args) {
		Book bk;
		ScienceBook sb = new ScienceBook();
		sb.read();
		bk = new MathsBook();
		bk.read();
	}
}

package com.java_practice.qn01;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {
	
//	Calculator c= null;
	
	@BeforeClass
	public static void beforeClass() {
		System.out.println("BeforeClass");
	}
	
	@Before
	public void before() {
		System.out.println("Before");
	}
	
	@Test
	public void add() {
		System.out.println("Method");
		Calculator c = new Calculator();
//		int actual = c;
//		assertEquals(30, c);
	}
	
	@After
	public void after() {
		System.out.println("After");
	}
}

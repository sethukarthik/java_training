package com.java_practice.lambda;

import java.util.function.Predicate;

public class LambdaDemo {
	int score;
	
	public LambdaDemo(int score) {
		super();
		this.score = score;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
	static void prd(int i, Predicate<Integer> pre) {
		if(pre.test(i)) {
			System.out.println(i);
		}
	}
	
	public static Predicate<String> pdS = new Predicate<String>() {
		@Override
		public boolean test(String t) {
			System.out.println(t);
			boolean val = t.equals("sethu");
			// TODO Auto-generated method stub
			return val;
		}
	};

	static void testPredicateInterface() {
		LambdaDemo ld = new LambdaDemo(22);
		Predicate<LambdaDemo> gTen = (ld1) -> (ld1.getScore() < 10);
		System.out.println(gTen.test(ld));
		Predicate<LambdaDemo> lTwenty =(ld2) -> (ld2.getScore() > 20);
		boolean res = gTen.and(lTwenty).test(ld); // false
		System.out.println(res);
		boolean res1 = lTwenty.or(gTen).test(ld); // True
		System.out.println(res1);
	}
	
	//return FALSE if conditions satisfied
	static void negate(int i) {
		Predicate<String> neg = (n) -> ( n.length() > 10);
		System.out.println(neg.negate().test("Sethuasdfasdfas fsdafasdfadf"));
	}

	public static void main(String[] args) {
		//General Lambda syntactic sugar
		FunctionalInter lamb = (i, s) -> {
			return (i + " " + s);
		};
		System.out.println(lamb.add(1, "Demo"));
		//Predicate Lambda
		LambdaDemo.testPredicateInterface();
		LambdaDemo.prd(10, (intV) -> intV > 10);
		LambdaDemo.negate(10);
	}
}
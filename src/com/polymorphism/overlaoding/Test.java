package com.polymorphism.overlaoding;

public class Test {

	public static void main(String[] args) {

		Sample s = new Sample();
		int res = s.add(12, 15, 5);
		int x = s.add(55, 0);
		System.out.println(x);
	}

}

package com.inheritance.multilevel;

public class C extends B {

	public void m3() {

		System.out.println("I am m3 of c");
	}

	public static void main(String[] args) {
		C c = new C();
		c.m1();
		c.m2();
		c.m3();
	}
}

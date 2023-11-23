package com.inheritance.single;

public class B extends A{

	public void m3() {
		System.out.println("I am m3 of B");
	}

	public void m4() {
		System.out.println("I am m4 of B");
	}

	public static void main(String[] args) {
		B b = new B();
		b.m2();
		b.m3();
		b.m4();
	}
}

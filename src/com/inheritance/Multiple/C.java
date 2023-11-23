package com.inheritance.Multiple;

public class C extends A{

	public void m2() {
		System.out.println("I am m2 of A");
		
	}
	public static void main(String[] args) {
		
		C c = new C ();
		c.m1();
		
	}}

//Multiple and Hybrid inheritance is not allowed in case of class in java
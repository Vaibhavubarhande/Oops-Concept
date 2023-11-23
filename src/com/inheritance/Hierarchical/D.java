package com.inheritance.Hierarchical;

public class D extends B {
	
	
	
	public void m4() {
		System.out.println("I am m4 of D");
		
	}
	public static void main(String[] args) {
		
		D d = new D();
		
		d.m1();
		d.m2();
		d.m4();
		
	}
}

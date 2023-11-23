package com.abstraction;

public abstract class Maggie {
	int x;

	// Abstract keyword use to create method
	// We can create abstract method in abstract class only.
	// 0 to 100% abstraction can achieve in abstract class.
	// All overriding rules apply on child class of abstract class.
	// Do not have body
	// All abstract method of parent class should be implemented in child class.
	// We can not create object of abstract class.
	// In abstraction parent ko implementation nai karnar h but in overriding parent ko implementation karna padta hai.

	public abstract void m1();
	
	public Maggie() {
		
		x=5;
	}
	
	protected abstract void m2();
	
}
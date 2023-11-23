package com.polymorphism.overlaoding;

public class First {
	
	public void add(byte x, byte y) {
		System.out.println("I am adding bytes");

	}
	public void add(short x, Short y) {
		System.out.println("I am adding shorts");
	}
	
	public void add(int x, int y) {
		System.out.println("I am adding ints");
	}
}

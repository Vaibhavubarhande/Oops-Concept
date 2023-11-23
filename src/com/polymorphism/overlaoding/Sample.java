package com.polymorphism.overlaoding;

public class Sample {
	
	//overloading - method name is same and list of arguments must be different

	public int add(int x, int y) {//This parameters are for only two digits addition
		return x + y;
	}

	public int add(int x, int y, int z) {//three digits addition method

		return x + y + z;
	}
}

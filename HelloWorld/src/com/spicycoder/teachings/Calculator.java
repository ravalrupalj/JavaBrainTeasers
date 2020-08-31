package com.spicycoder.teachings;

public class Calculator {
	private int a,b;
	
	public Calculator(int aVal, int bVal) {
		a = aVal;
		b = bVal;
		System.out.print("\nInitialized with a="+a+" b="+b);
	}
	
	public void printMethod() {
		System.out.println("\n"+a+" "+b);
	}
	
	public int sum() {
		return a+b;
	}
}

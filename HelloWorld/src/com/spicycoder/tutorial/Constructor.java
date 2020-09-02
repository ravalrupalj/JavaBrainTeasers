package com.spicycoder.tutorial;

public class Constructor {
	public static void main(String args[]) {
		Chinmay details=new Chinmay(5,9);
		int value=details.getA();
		System.out.println(value);
		int valueB=details.getB();
		System.out.println(valueB);
	}
}


class Chinmay{
	private int a,b;
	public Chinmay(int aVal,int bVal) {
		a=aVal;
		b=bVal;
		//System.out.println(a+" "+b);
	}
	public int getA(){
		return a;
	}
	public int getB() {
		return b;
	}
}
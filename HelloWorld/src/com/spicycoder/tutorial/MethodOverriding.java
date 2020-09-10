package com.spicycoder.tutorial;

public class MethodOverriding {

	public static void main(String[] args) {
		Banana obj =new Banana ();
		obj.show(); //Method Overriding-->Child class method will override parent class method
	}

}
class Apple{
	int i;
	public void show() {
		System.out.println("in A");
	}
}
class Banana extends Apple{
	int i;
	//@Override //-->Method Overriding-->Child class method will override parent class method
	public void show() {
		super.i=8;
		super.show();//This is will call Parent class method and then child class method
		System.out.println("in B");
	}
}
package com.spicycoder.tutorial;
//When you create object of Sub class it calls constructor of Sub class as well as Super class
//When you create object of Sub class which has Parametirized argument in Constructor , it will call constructor of Sub class(With Parameters) and constrcutor of Super Class(Default constructor) 
public class SuperDemo {

	public static void main(String[] args) {
		B obj=new B();
		

	}

}
class A{
	public A() {
		System.out.println("In A");
	}
	public A(int A) {
		System.out.println("In int A");
	}
}
class B extends A{
	public B() {
		super(5);// This will call sub class with default constructor and Super class of parameterized constructor
		System.out.println("In B");
	}
	public B(int B) {
		super(B); //This will call Super class with Parameterized  constructor
		System.out.println("In int B");
	}
}
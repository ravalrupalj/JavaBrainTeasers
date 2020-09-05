package com.spicycoder.tutorial;
/*Types of Inner class
Member class
Static class*/
public class InnerClassDemo {
	public static void main(String args[]) {
		Outer obj=new Outer();
		obj.details();
		Outer.Inner obj1=obj.new Inner();   //If the inner is not static then create object like this
		//Outer.Inner obj1=new Outer.Inner(); -->If the inner is static then create object like this
		obj1.demo();
	}
}
class Outer{
	int a;
	public void details() {
		System.out.println("It is outer class");
	}
	 class Inner{
		public void demo(){
			System.out.println("It is inner class");
		}
	}
}
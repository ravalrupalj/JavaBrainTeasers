package com.spicycoder.tutorial;

public class DynamicMethodDispatch {
//Compile time and runtime
	public static void main(String[] args) {
		C obj=new D();//runtime Polymorphism
		obj.show();
		
		obj=new E();
		obj.show();//Dynamic method Dispatch
	}

}
class C{
	public void show() {
		System.out.println("in C");
	}
}
class D extends C {
	public void show() {
		System.out.println("in D");
	}
	
}
class E extends C{
	public void show() {
		System.out.println("in E");
	}
}

package com.spicycoder.tutorial;
//If you make Abstract class, you can not create object of it. you need to extend abstract class into other class
// If you have abstract method in class, Class should abstract class
//if you extends abstract class you need to define abstract method in the child class without abstract word
public class AbstractKeyword {

	public static void main(String[] args) {
		Human obj=new Man();
	}

}
abstract class Human{//Abstract class
	public abstract void eat(); //Abstract method
		
	
	public void walk() {
		
	}
}
class Man extends Human{//Concrete class
	//Above we have declared eat method as abstract so we need to define here
	
	public void eat() {
		
	}
}
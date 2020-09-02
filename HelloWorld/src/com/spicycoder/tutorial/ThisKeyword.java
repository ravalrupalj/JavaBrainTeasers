package com.spicycoder.tutorial;

public class ThisKeyword {
	public static void main(String args[]){
		Calc obj=new Calc(21,27);
		System.out.println(obj.num1);
	}
}
class Calc{
	int num1;
	int num2;
	public Calc(int num1,int num2) {
		this.num1=num1;
		this.num2=num2;
	}
}
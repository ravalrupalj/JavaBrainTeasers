package com.spicycoder.tutorial;
// when you have same method with the same name, we need use different parameter
//MethodOverloading=Multiple method with same name but different parameter
public class MethodOverloading {
	public static void main(String[] args) {
		Home obj = new Home(1,2,"Rupal");//Contstructor OverLoading
		System.out.println(obj.operation);
		
		Home obj1=new Home(12,78,"Chinmay");// Method OverLoading
			obj1.add(12, 41);
			obj1.add(1,5,8);
			obj1.add(4.5, 8.2);
			System.out.println(obj1.num1);
			System.out.println(obj1.num2);
			System.out.println(obj1.operation);
	}
}
class Home{
	int num1;
	int num2;
	String operation;
	public Home() {
		num1=3;
		num2=0;
		operation="Nothing";
	}
	public Home(int number1,int number2) {
		num1=number1;
		num2=number2;
	}
	public Home(int number1,int number2,String ope) {
		num1=number1;
		num2=number2;
		operation=ope;
	}
	public void add(int i,int j) {
		System.out.println("First Method"+i+j);
	}
	public void add(int i,int j,int k) {
		System.out.println("Second Method"+i+j+k);
	}
	public void add(double i,double j) {
		System.out.println("Third Method"+i+j);
	}
}
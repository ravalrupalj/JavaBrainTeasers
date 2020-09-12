package com.spicycoder.tutorial;
//Java does not support multiple inheritance
public class Inheritance_Java {

	public static void main(String[] args) {
		CalcVeryAdv obj=new CalcVeryAdv();
		int result1=obj.add(25,78);
		int result2=obj.sub(25,78);
		int result3=obj.mul(25,78);
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
	}
}
class Calc2{
	public int add(int a,int b) {
		return a+b;
	}
}
class CalcAdv extends Calc2{
	public int sub(int a,int b) {
		return a-b;
	}
}
class CalcVeryAdv extends CalcAdv{
	public int mul(int a, int b) {
		return a*b;
	}
}
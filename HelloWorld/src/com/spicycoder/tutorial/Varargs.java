package com.spicycoder.tutorial;
//variable Length Argument
public class Varargs {
	public static void main(String[] args) {
		Together obj=new Together();
		System.out.println(obj.add(4,5,55,78,94,46,54,6,54));
	}
}
class Together{
	public int add(int ...n) {
		int sum=0;
		for (int i:n) {
			sum=sum+i;
		}
		return sum;
	}
}
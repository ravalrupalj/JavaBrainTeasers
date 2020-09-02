package com.spicycoder.tutorial;

public class ConstructorDemo {
	public static void main(String args[]) {
		Fruits appliances=new Fruits(25000,488);
		
		int total=appliances.getSum();
		System.out.println(total);
		int a=appliances.setApple(78989);
		System.out.println(a);
	}
}
class Fruits{
	private int apple;
	private int banana;
	public Fruits(int avacado,int kiwi) {
		apple=avacado;
		banana=kiwi;
	}
	public int getSum() {
		return apple+banana;
	}
	public int setApple(int apple) {
		return apple=apple;
	}
}
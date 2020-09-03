package com.spicycoder.tutorial;

public class ConstructorDemo {
	public static void main(String args[]) {
		Fruits appliances=new Fruits(25000,488);
		
		int total=appliances.getSum();
		System.out.println(total);
		
		int b=appliances.getApple();
		System.out.println("Apple value is "+b);
		
		appliances.setApple(78989);

		b=appliances.getApple();
		System.out.println("Apple value is "+b);
		

		appliances.setApple(5000000);

		b=appliances.getApple();
		System.out.println("Apple value is "+b);
		
		
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
	public void setApple(int apple) {
		this.apple=apple;
	}
	public int getApple() {
		return apple;
	}
}
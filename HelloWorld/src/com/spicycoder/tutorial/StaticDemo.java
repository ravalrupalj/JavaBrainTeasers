package com.spicycoder.tutorial;

public class StaticDemo {

	public static void main(String[] args) {
		Emp navin=new Emp();
		navin.eid=8;
		navin.salary=4000;
		Emp.ceo="Payal";
		Emp rahul=new Emp();
		rahul.eid=4;
		rahul.salary=1000;
		Emp.ceo="Nikita";
		navin.show();
		rahul.show();
	}

}
class Emp{
	int eid;
	int salary;
	static String ceo="Rupal";

	public Emp() {
		eid=12;
		salary=5000;
	
	}
	
	public void show() {
		System.out.println(eid+":"+salary+":"+ceo);
	}
}
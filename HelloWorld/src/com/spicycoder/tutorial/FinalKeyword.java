package com.spicycoder.tutorial;
//If your write final before varible, variable should be in capital letter
//If you declare variable,method or class final, then you can not override that variable, method or class
public class FinalKeyword {

	public static void main(String[] args) {
		Cd obj=new Cd();
		obj.show();
	}

}
class Ab{
	final int DAY; //Constant
	public Ab() {
		DAY=10;
		//DAY=144; once you declare the value, you can not change the value
	}
	public final void show() {
		System.out.println("in Ab show");
	}
}
class Cd extends Ab{
//	public void show() {I can not override show method bcoz show method is final
//		System.out.println("in Cd show");
	//}
}
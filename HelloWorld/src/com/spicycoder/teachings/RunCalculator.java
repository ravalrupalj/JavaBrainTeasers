package com.spicycoder.teachings;

public class RunCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Calculator calOne = new Calculator(2,5);		
		Calculator calTwo = new Calculator(5, 3);
		
		int sumOne = calOne.sum();
		System.out.print("\nSum is "+sumOne);
		
		int sumTwo=calTwo.sum();
		System.out.println("\nSum is "+sumTwo);
	}

}

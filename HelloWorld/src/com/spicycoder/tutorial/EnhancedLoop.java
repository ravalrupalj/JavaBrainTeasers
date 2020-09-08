package com.spicycoder.tutorial;

public class EnhancedLoop {

	public static void main(String[] args) {
		int d[][]= {{1,2,3,4},{5,6,7,8},{9,4,5},{8,1}};
		for (int k[]:d) {
			for (int l:k) {
				System.out.print(" "+l);
			}
			System.out.println();
		}
	}

}

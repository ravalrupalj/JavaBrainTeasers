package com.spicycoder.tutorial;

public class ConstructorSignature {
	public static void main(String args[]) {
		Teachers school=new Teachers(4.5);
		System.out.println(school.getnumberOfStudent());
		
		
	}
}

class Teachers{
	int numberOfStudent;
	int numberOfClass;
	public Teachers() {
		numberOfStudent=5;
		numberOfClass=10;
	}
	public Teachers(double students) {
		numberOfStudent=(int)students;
	}
	public Teachers(int students,int classes) {
		numberOfStudent=students;
		numberOfClass=classes;
	}
	public int getnumberOfStudent() {
		return numberOfStudent;
	}
}
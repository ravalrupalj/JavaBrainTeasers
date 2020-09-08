package com.spicycoder.tutorial;
class Student{
	int rollno;
	String name;
}
public class OneDimentionalArray {

	public static void main(String[] args) {
		Student s1=new Student();
		Student s2=new Student();
		Student s3=new Student();
		Student s4=new Student();
		
		Student s[]= {s1,s2,s3,s4};
		System.out.println(s[0]);
		int nums[]=new int[3];
		// or int nums[]={5,78,9565
		nums[0]=5;
		nums[1]=78;
		nums[2]=9565;
		
		
		nums[0]=46;
		
		for (int i=0;i<3;i++) {
			System.out.println(nums[i]);
		}
	}

}

package com.spicycoder.tutorial;
//It is also called AutoBoxing
public class WrapperDemo {

	public static void main(String[] args) {
		int i =5;// Primitive datatype
		Integer ii=new Integer(i); //Boxing or Wrapping
		int j=ii.intValue(); //Unboxing or Unwrapping
		System.out.println(j );
		Integer value=i;//AutoBoxing
		int k=value; //Autounboxing
		
		String str="123";
		int n=Integer.parseInt(str);
		System.out.println(n);
	}

}

package com.spicycoder.tutorial;
//Encapsulation -->Binding data with methods
public class GettersSettersEncapsulation {

	public static void main(String[] args) {
		SchoolStudent s1=new SchoolStudent();
		/*s1.rollno=3;
		s1.name="Navin";
		System.out.println(s1.rollNo);
		System.out.println(s1.name);
		  Getter and Setters*/
		s1.setrollno(25);
		System.out.println(s1.getrollno());
		s1.setname("Navin");
		System.out.println(s1.getname());
		


	}

}
class SchoolStudent{
	 private int rollno;
	 private String name;
	 public void setrollno(int rollno) {
		 this.rollno=rollno;
	 }
	 public int getrollno() {
		 return rollno;
	 }
	 public void setname(String name) {
		 this.name=name;
	 }
	 public String getname() {
		 return name;
	 }
}


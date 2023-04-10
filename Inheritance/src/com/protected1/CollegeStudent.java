package com.protected1;

public class CollegeStudent extends Student{

	public static void main(String[] args) {
	CollegeStudent c1= new CollegeStudent();
	//c1.id=21;
	c1.name="pranav";
	c1.age=23;
	c1.marks=90f;
	
	c1.displayName();
	c1.displayAge();
	c1.displayMarks();

	}

}

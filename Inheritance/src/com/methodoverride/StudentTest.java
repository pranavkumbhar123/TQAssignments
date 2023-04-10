package com.methodoverride;

public class StudentTest {

	public static void main(String[] args) {
		SchoolStudent s1=new SchoolStudent(191,"pranav",89f,300.0,"mgv",12);
		CollegeStudent c1= new CollegeStudent(292,"nilesh",98f,4555.5,"mca",5);
		
		System.out.println(s1);
		System.out.println(c1);
		
		s1.calcFees(3000);
		c1.calcFees(8000);
		
		System.out.println(s1);
		System.out.println(c1);

				
	}

}

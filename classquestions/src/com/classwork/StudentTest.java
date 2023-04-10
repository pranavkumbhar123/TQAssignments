package com.classwork;

import java.util.Scanner;

public class StudentTest {

	
	
	public static void main(String[] args) {
	
		Student s1=new Student();
		s1.setId(101);
		s1.setName("Pranav");
		float m[]= {88f,55f,45f,88f};
		s1.setMarks(m);
		
		System.out.println("=============");
		System.out.println(s1.getId());
		System.out.println(s1.getName());
		
		float marks[];
		marks=s1.getMarks();
		
		for(float m:marks)
		{
			
		}

	}

}

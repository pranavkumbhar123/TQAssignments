package com.Demo;

import java.util.Scanner;


public class StudentTestGetterSetter {

	static Scanner sc= new Scanner(System.in);
	
	public static void enterDetails(Student s)
	{
		System.out.println("Enter id");
		s.setId(sc.nextInt());
		System.out.println("Enter name");
		s.setName(sc.next());
		System.out.println("Enter marks");
		s.setMarks(sc.nextFloat());
		
	}
	public static void printDetails(Student st[])
	{
		for(Student s:st)
		{
			System.out.println(s);
		}
	}
	
	public static void main(String[] args) {
		Student stud=new Student();
		for(int i=0;i<=stud.l;i++)
		{
			
		}


	}

}

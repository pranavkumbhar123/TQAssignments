package com.StudentDemo;

import java.util.Scanner;


public class studentTest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Student s1=new Student();	
		System.out.println("enter id");
		s1.setId(sc.nextInt());
		
		System.out.println("enter Name");
		s1.setName(sc.next());
		
		System.out.println("enter marks:");
		s1.setMarks(sc.nextFloat());
		
		
		System.out.println(s1.getId()+" "+s1.getName()+" "+s1.getMarks());
		
		Student s2=new Student();
		System.out.println("enter id");
		s2.setId(sc.nextInt());
		
		System.out.println("enter Name");
		s2.setName(sc.next());
		
		System.out.println("enter marks:");
		s2.setMarks(sc.nextFloat());
		
		System.out.println(s2.getId()+" "+s2.getName()+" "+s2.getMarks());
		
		Student s3=new Student();
		System.out.println("enter id");
		s3.setId(sc.nextInt());
		
		System.out.println("enter Name");
		s3.setName(sc.next());
		
		System.out.println("enter marks:");
		s3.setMarks(sc.nextFloat());
		
		System.out.println(s3.getId()+" "+s3.getName()+" "+s3.getMarks());
		
	}

}

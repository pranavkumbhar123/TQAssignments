package com.multilevel;

import java.util.Scanner;

public class Test {

	static Scanner sc=new Scanner(System.in);
	public static void enterDetails(TechManager t)
	{
		System.out.println("Enter id:");
		t.setId(sc.nextInt());
		System.out.println("Enter name:");
		t.setName(sc.next());
		System.out.println("Enter salary:");
		t.setSalary(sc.nextFloat());
		System.out.println("Enter experience:");
		t.setExp(sc.nextInt());
		System.out.println("Enter technology:");
		t.setTech(sc.next());
		
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		TechManager t1= new TechManager(1,"pranav",435352f,6,"java");
		System.out.println(t1);
		
		//taking input
		TechManager t2=new TechManager();
		System.out.println(t2);
		
		enterDetails(t2);
		System.out.println(t2);
	}
	
	
	

	

}

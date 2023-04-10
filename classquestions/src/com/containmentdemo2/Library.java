package com.containmentdemo2;

import java.util.Scanner;

public class Library {

	static Scanner sc=new Scanner(System.in);
	
	public static void enterBookDetails(Book b)
	{
		
		
		System.out.println("Enter book Id:");
		b.setBId(sc.nextInt());
		System.out.println("Enter book Name:");
		b.setBName(sc.next());
		System.out.println("Enter book price:");
		b.setBPrice(sc.nextFloat());
		Author a=new Author();
		System.out.println("Enter author Id:");
		a.setAId(sc.nextInt());
		System.out.println("Enter author name");
		a.setAName(sc.next());
		
		b.setAuthor(a);
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		Book b1= new Book();
		enterBookDetails(b1);
		System.out.println(b1);
		

	}

}

package com.containment;

import java.util.Scanner;

import com.demo1.Book;

import demo2.Employee;

public class BookGetterSetter {

	static Scanner sc=new Scanner(System.in);
	public static void enterBookDetails(Book b)
	{
		System.out.println("Enter book id");
		b.setId(sc.nextInt());
		System.out.println("Enter book name");
		b.setName(sc.next());
		System.out.println("Enter book price");
		b.setPrice(sc.nextFloat());
		Author au=new Author();
	   System.out.println("Enter author id");
	   au.setAId(sc.nextInt());
	   System.out.println("Enter author name");
	   au.setName(sc.next());
	   b.setAuthor(au);
		
		
	}
	public static void highestPrice(Book []hb)
	{
		float highest=Float.MIN_VALUE;
		Book ehigh=new Employee();
		for(Employee e:em)
		{
			if(e.getSalary()>highest)
			{
				ehigh=e;
				highest=e.getSalary();
			}
		}
		System.out.println("Highest salary");
		System.out.println(ehigh);
	}
	
	public static void printDetails(Book []bk)
	{
		for(Book b:bk)
		{
			System.out.println(b);
		}
	}
	public static void main(String[] args) {


		Book b[]=new Book[3];
		for(int i=0;i<b.length;i++)
		{
			b[i]=new Book();
			enterBookDetails(b[i]);
		}
		printDetails(b);
		
				
		
		}

	}



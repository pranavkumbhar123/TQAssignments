package com.demo1;

import java.util.Scanner;

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
	}
	public static void printBookDetails(Book[] b2)
	{
		for(Book b:b2)
		{
			System.out.println(b);
		}
	}
	public static void priceSort(Book bok[])
	{
		Book b=new Book();//temperory object
		for(int i=0;i<bok.length;i++)
		{
			for(int j=i+1;j<bok.length;j++)
			{
				if(bok[i].getPrice()>bok[j].getPrice())
				{
					b=bok[i];
					bok[i]=bok[j];
					bok[j]=b;
				}
			}
		}
	}
	
	
	public static void main(String[] args) {


		Book b[]=new Book[3];
		for(int i=0;i<b.length;i++)
		{
			b[i]=new Book();
			enterBookDetails(b[i]);
		}
		printBookDetails(b);
		System.out.println("=================");
		
		priceSort(b);
		printBookDetails(b);
		
		

	}

}

package com.demo1;

public class BookConstructor {

	public static void main(String[] args) {


		Book b[]=new Book[3];
		
		b[0]=new Book(1,"chawa",500);
		b[1]=new Book(2,"harry potter",700);
		b[2]=new Book(3,"maths",200);
		for(Book x:b)
		{
			System.out.println(x);
			
		}
		

	}

}

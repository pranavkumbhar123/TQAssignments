package com.test4;

import java.util.Scanner;


public class AnonymousObject {
	

		static Scanner sc=new Scanner(System.in);
		
		public static void enterBookDetails(Book b)
		{
			
			
			System.out.println("Enter book Id:");
			b.setId(sc.nextInt());
			System.out.println("Enter book Name:");
			b.setName(sc.next());
	
			
			b.setAuthor(new Author());
			System.out.println("Enter author id");
			b.getAuthor().setId(sc.nextInt());
			System.out.println("Enter author name");
			b.getAuthor().setName(sc.next());
			System.out.println("Enter author address");
			b.getAuthor().setAddress(sc.next());
			
			
			
			
		
			
		}
		
		
		
		
		
		public static void main(String[] args) {
			Book b1= new Book();
			enterBookDetails(b1);
			System.out.println(b1);
			

		}

	}




		

	



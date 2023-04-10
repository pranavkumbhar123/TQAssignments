package com.containment1;

public class Library {

	public static void main(String[] args) {
		Author a1=new Author(1,"sherlock holmes",570);
		 Author a2= new Author(2,"Shakespeare",65);
		 
		 Book b1= new Book(101, "the sign of four",500f,a1);
		 Book b2 = new Book(102,"Study in Scarlet",650f,a1);
		 
		 System.out.println(b1);
		 System.out.println(b2);


	}

}

package com.containment1;

public class Library2 {

	public static void main(String[] args) {
		Book b1=new Book(101,"chawa",800f,new Author(1,"shivaji sawant",56));
		Book b2= new Book(192,"study in scarlet",650f, new Author(1,"sherlok holmes",57));
		
		System.out.println(b1);
		System.out.println(b2);


	}

}

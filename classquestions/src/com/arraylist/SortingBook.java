package com.arraylist;

import java.util.ArrayList;

public class SortingBook {

	public static void main(String[] args) {

		Author a1= new Author(101,"Shivaji Sawant");
		Author a2=new Author(102,"Abdul kalam");
		Author a3= new Author(103,"jk rowling");

		ArrayList<Book> b=new ArrayList<>();
		b.add(new Book(1,"Chawa",459,a1));
		b.add(new Book(2,"Harry potter",445,a3));
		b.add(new Book(3,"Wings of fire",460,a2));
		
		
		
		

	}

}

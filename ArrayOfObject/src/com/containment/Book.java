package com.containment;

public class Book {

	private int id;
	private String name;
	private float price;
	private Author author;
	
	
	public Book()
	{
		
	}
	public Book(int id, String name, float price,Author author)
	{
		this.id=id;
		this.name=name;
		this.price=price;
		this.author=author;
	}
	
	public void setId(int id)
	{
		this.id=id;
	}
	public int getId()
	{
		return id;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	public void setPrice(float price)
	{
		this.price=price;
	}
	public float getPrice()
	{
		return price;
	}
	public void setAuthor(Author author)
	{
		this.author=author;
	}
	public Author getAuthor()
	{
		return author;
	}
	
	public String toString()
	{
		return "Book:"+id+" "+name+" "+price+" "+author;
	}
}

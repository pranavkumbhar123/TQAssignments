package com.containmentdemo2;

public class Book {

	private int bId;
	private String bName;
	private float bPrice;
	private Author author;
	
	public Book()
	{
		
	}
	public Book(int bId, String bName, float bPrice, Author author)
	{
		this.bId=bId;
		this.bName=bName;
		this.bPrice=bPrice;
		this.author=author;

	}
	public void setBId(int bId)
	{
		this.bId=bId;
	}
	public int getBId()
	{
		return bId;
	}
	public void setBName(String bName)
	{
		this.bName=bName;
	}
	public String getBName()
	{
		return bName;
	}
	public void setBPrice(float bPrice)
	{
		this.bPrice=bPrice;
	}
	public float getBPrice()
	{
		return bPrice;
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
		return "Book Details:"+bName+" "+bName+" "+bPrice+" "+author;
	}
}

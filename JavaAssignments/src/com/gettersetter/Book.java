package com.gettersetter;

public class Book {
	private String bookName;
	private String bookAuthor;
	private int bookId;
	private float Price;
	
	public Book()
	{
		
	}
	public Book(String bookName, String bookAuthor, int bookId, float Price) {
		this.bookName=bookName;
		this.bookAuthor=bookAuthor;
		this.bookId=bookId;
		this.Price=Price;
	}
	
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getBookAuthor() {
		return bookAuthor;
	}
	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}
	
	
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public float getPrice() {
		return Price;
	}
	public void setPrice(float price) {
		Price = price;
	}
	public String toString()
	{
		return "Book+"+bookName+" "+bookAuthor+" "+bookId+" "+Price;
	}
	
	
}

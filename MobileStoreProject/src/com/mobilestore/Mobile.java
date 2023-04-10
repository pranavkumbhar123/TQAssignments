package com.mobilestore;


public class Mobile {

	private int id;
	private String bName;
	private float  price;
	public Mobile()
	{
		
	}
	public Mobile(int id, String bName, float price) {
		this();
		this.id = id;
		this.bName = bName;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getbName() {
		return bName;
	}
	public void setbName(String bName) {
		this.bName = bName;
	}
	public float  getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
	public String toString() {
		return "Mobile [id=" + id + ", bName=" + bName + ", price=" +price + "]";
	}
	
	
	
	
}

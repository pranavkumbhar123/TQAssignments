package com.collections;

public class Order {

	private int orderid;
	private String oname;
	private float price;
	
	public Order()
	{
		
	}

	public Order(int orderid, String oname, float price) {
		super();
		this.orderid = orderid;
		this.oname = oname;
		this.price = price;
	}

	public int getOrderid() {
		return orderid;
	}

	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}

	public String getOname() {
		return oname;
	}

	public void setOname(String oname) {
		this.oname = oname;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Order [orderid=" + orderid + ", oname=" + oname + ", price=" + price + "]";
	}
	
}

package com.supplier;

public class Item {

	private int id;
	private String name;
	private float unitPrice;

	public Item()
	{
		
	}
	public Item(int id, String name, float unitPrice) {
	
		this.id = id;
		this.name = name;
		this.unitPrice = unitPrice;
	
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(float unitPrice) {
		this.unitPrice = unitPrice;
	}

	
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", unitPrice=" + unitPrice+"]" ;
	}
	
	
	
}

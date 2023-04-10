package com.hierarchical1;

public class landLine extends Phone {
	private String connection;
	private float bill;
	
	public landLine()
	{
		
	}
	public landLine(long phoneNo, int id, String connection, float bill)
	{
		super(phoneNo, id);
		this.connection=connection;
		this.bill=bill;
	}
	public String getConnection() {
		return connection;
	}
	public void setConnection(String connection) {
		this.connection = connection;
	}
	public float getBill() {
		return bill;
	}
	public void setBill(float bill) {
		this.bill = bill;
	}
	
	public String toString()
	{
	
		return super.toString()+" "+connection+" "+bill;
	}
}

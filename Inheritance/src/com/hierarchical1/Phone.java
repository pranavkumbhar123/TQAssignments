package com.hierarchical1;

public class Phone {

	private long phoneNo;
	private int id;
	
	public Phone()
	{
		
	}
	public Phone(long phoneNo, int id)
	{
		this.phoneNo=phoneNo;
		this.id=id;
		
	}
	public long getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String toString()
	{
		return "PhoneInfo:"+phoneNo+" "+id;
	}
}

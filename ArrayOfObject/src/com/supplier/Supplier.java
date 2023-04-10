package com.supplier;

import java.util.Arrays;

public class Supplier {

	private int sId;
	private String sName;
	private double phoneNo;
	private Item [] item;
	
	public Supplier()
	{
		
	}
	public Supplier(int sId, String sName, double phoneNo,Item item[])
	{
		this.sId=sId;
		this.sName=sName;
		this.phoneNo=phoneNo;
		this.item=item;
	}
	public int getsId() {
		return sId;
	}
	public void setsId(int sId) {
		this.sId = sId;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public double getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(double phoneNo) {
		this.phoneNo = phoneNo;
	}
	public Item[] getItem() {
		return item;
	}
	public void setItem(Item[] item) {
		this.item = item;
	}

	public String toString() {
		return "Supplier (sId=" + sId + ", sName=" + sName + ", phoneNo=" + phoneNo + ", item=" + Arrays.toString(item)
				+ ")";
	}
	
	
}

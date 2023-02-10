package com.constructor;

public class Supplier {
	private int supplierId;
	private String supplierName;
	private String supplierAddress;
	
	public Supplier()
	{
		System.out.println("In default constructor");
	}
	
	public Supplier(int supplierId,String supplierName,String supplierAddress)
	{
		System.out.println("In para constructor");
		this.supplierId=supplierId;
		this.supplierName=supplierName;
		this.supplierAddress=supplierAddress;
	}
	public String toString() {
		
		return "Supplier Details: "+supplierId+ " "+"supplierName:"+supplierName+" " +"SupplierAddress:"+supplierAddress;
	}
}

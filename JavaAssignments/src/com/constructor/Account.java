package com.constructor;

public class Account {
	public long accountNo;
	public String customerName;

	public Account()
	{
		System.out.println("I am default constructor");
	}
	public Account(long accountNo, String customerName)
	{
		System.out.println("i am para constructor");
		this.accountNo=accountNo;
		this.customerName=customerName;
	}
	
	public String toString()
	{
		return "Account:"+accountNo+" "+customerName;
	}

}

package com.Chaning;

public class Cycle {

	private int accountNo;
	private int wheels;
	
	public Cycle()
	{
		System.out.println("default constructor");
	}
	public Cycle(int accountNo, int wheels)
	
	{
		System.out.println("i am another constructor");
		this.accountNo=accountNo;
		this.wheels=wheels;
		
	}
}

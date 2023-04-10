package com.multilevel;

public class Manager extends Employee {

	private int exp;
	
	Manager()
	{
		
	}
	Manager(int id, String name, float salary, int exp)
	{
		super(id, name, salary);
		System.out.println("In manager constr");
		this.exp=exp;
	}
	public void setExp(int exp)
	{
		this.exp=exp;
	}
	public int getExp()
	{
		return exp;
	}
	public String toString()
	{
		return super.toString() +" "+exp;
	}
}

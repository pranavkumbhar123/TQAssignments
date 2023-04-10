package com.singleinheritance;

public class Manager extends Employee {
	
	private float salary;
	
	public Manager()
	{
		
	}
	public Manager(int id, String name, float salary)
	{
		super(id,name);
		this.salary=salary;
	}
	public void setSalary(float salary)
	{
		this.salary=salary;
	}
	public float getSalary()
	{
		return salary;
	}
	public String toString()
	{
		return super.toString()+"Manager Salary:"+salary;
	}

}

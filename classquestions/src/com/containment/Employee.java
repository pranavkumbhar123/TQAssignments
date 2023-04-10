package com.containment;

public class Employee {
	private int id;
	private String name;
	private float salary;
	private Department dept;
	
	
	
	public Employee()
	{
		
	}
	public Employee(int id, String name, float salary,Department dept)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
		this.dept=dept;
		
		
	}
	public void setId(int id)
	{
		this.id=id;
	}
	public int getId()
	{
		return id;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	public void setSalary(float salary)
	{
		this.salary=salary;
	}
	public float getSalary()
	{
		return salary;
	}
	public void setDept(Department dept)
	{
		this.dept=dept;
	}
	public Department getDept()
	{
		return dept;
	}
	public String toString()
	{
		return "Employee:"+id+" "+name+" "+salary+" "+dept;
	}
	
}

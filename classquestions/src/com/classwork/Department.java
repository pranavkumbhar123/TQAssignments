package com.classwork;

public class Department {

	private int id;
	private String name;
	
	public Department()
	{
		
	}
	public Department(int id, String name)
	{
		this.id=id;
		this.name=name;
		
	}
	public void setId(int id)
	{
		this.id=id;
		
	}
	public int setId()
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
	
	public String toString()
	{
		return "Department:"+id+" "+name;
	}
}

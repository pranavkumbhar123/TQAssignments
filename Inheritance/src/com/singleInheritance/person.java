package com.singleInheritance;

public class person {
	private int id;
	protected String name;
	
	public person()
	{
		
	}
	public person(int id, String name)
	{
		this.id=id;
		this.name=name;
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
	public String toString()
	{
		return "Student:"+id+" "+name;
	}
}



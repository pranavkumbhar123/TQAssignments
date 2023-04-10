package com.containment;

public class Author {

	private int aId;
	private String name;
	
	public Author()
	{
		
	}
	public Author(int aId,String name)
	{
		this.aId=aId;
		this.name=name;
	}
	public void setAId(int aId)
	{
		this.aId=aId;
	}
	public int getAId()
	{
		return aId;
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
		return "Author:"+aId+" "+name;
	}
	
	
}

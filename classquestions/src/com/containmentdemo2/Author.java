package com.containmentdemo2;

public class Author {

	private int aId;
	private String aName;
	
	
	public Author()
	{
		
	}
	public Author(int aId, String aName)
	{
		this.aId=aId;
		this.aName=aName;
		
	}
	public void setAId(int aId)
	{
		this.aId=aId;
	}
	public int getAId()
	{
		return aId;
	}
	public void setAName(String aName)
	{
		this.aName=aName;
	}
	public String getAName()
	{
		return aName;
	}
	
	public String toString()
	{
		return "Author Details:"+aId+" "+aName;
	}
	
}

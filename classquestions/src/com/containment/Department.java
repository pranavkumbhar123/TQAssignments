package com.containment;

public class Department {
	private int id;
	private String dName;
	private String location;
	
	public Department()
	{
		
	}
	public Department(int id,String dName, String location )
	{
		this.id=id;
		this.dName=dName;
		this.location=location;
	}
	
	public void setId(int id)
	{
		this.id=id;
	}
	public int getId()
	{
		return id;
	}
	public void setDName(String dName)
	{
		this.dName=dName;
	}
	public String getDName()
	{
		return dName;
	}
	public void setLocation(String location)
	{
		this.location=location;
	}
	public String getLocation()
	{
		return location;
	}
	
	public String toString()
	{
		return "Department:"+id+" "+dName+" "+location;
	}
	public void setDepartment(Employee e) {
		// TODO Auto-generated method stub
		
	}
}

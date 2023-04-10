package com.singleinheritance;

public class student extends person{
	private String schoolName;
	protected float marks;
	
	public student()
	{
		
	}
	public student(int id, String name, String schoolName,float marks)
	{
		super(id,name);
		this.schoolName=schoolName;
		this.marks=marks;
	}
	public void setSchoolName(String schoolName)
	{
		this.schoolName=schoolName;
	}
	public String getSchoolName()
	{
		return schoolName;
	}
	public void setName(float marks)
	{
		this.marks=marks;
	}
	public float getmarks()
	{
		return marks;
	}
	public String toString()
	{
		return super.toString() +schoolName+" "+marks;
	}
	
		
		
	
}

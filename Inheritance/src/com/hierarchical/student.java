package com.hierarchical;

public class student {

	private int id;
	private String name;
	private float marks;
	private double fees;
	
	public student() {
		
	}
	public student(int id, String name, float marks, double fees)
	{
		this.id= id;
		this.name=name;
		this.marks=marks;
		this.fees=fees;
		
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
	public void setMarks(float marks)
	{
		this.marks=marks;
	}
	public float getMarks()
	{
		return marks;
	}
	public void setFees(double fees)
	{
		this.fees=fees;
	}
	public double getFees() {
		return fees;
	}
	public String toString()
	{
		return "Student Info:"+id+" "+name+" "+marks+" "+fees;
	}
}

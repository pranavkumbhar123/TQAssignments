package com.classwork;

import java.util.Arrays;

public class Student {

	private int id;
	private String name;
	private float [] marks;
	
	
	public Student()
	{
		
	}
	public Student(int id, String name, float [] marks)
	{
		this();
		this.id=id;
		this.name=name;
		this.marks=marks;
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
	public void setMarks(float [] marks)
	{
		this.marks=marks;
	}
	public float [] getMarks()
	{
		return marks;
	}
	

	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + Arrays.toString(marks)+ "]";
	}
	
}

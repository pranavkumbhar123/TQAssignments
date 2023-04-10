package com.protected1;

public class Student {

	private int id;
	protected String name;
	int age;
	public float marks;
	
	private void displayId()
	{
		System.out.println(id);
	}
	protected void displayName()
	{
		System.out.println(name);
		
	}
	void displayAge()
	{
		System.out.println(age);
	}
	public void displayMarks()
	{
		System.out.println(marks);
	}
	public static void main(String args[])
	{
		Student s1=new Student();
		s1.id=101;
		s1.name="pranav";
		s1.age=32;
		s1.marks=98f;
		
		s1.displayId();
		s1.displayName();
		s1.displayAge();
		s1.displayMarks();
	}
}

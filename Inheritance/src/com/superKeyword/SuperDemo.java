package com.superKeyword;

 class Demo {

	int value;
	{
	value =100;
	}
	void display()
	{
		System.out.println("Welcome");
	}
}
class child extends Demo
{
	int value;
	{
		value=10;
	}
	void show()
	{
		System.out.println("Parent:"+super.value);
		System.out.println("child:"+value);
	}
	void display()
	{
		super.display();
		System.out.println("hello");
	}
	public class SuperDemo{
		public static void main(String args[]) {
			child c1=new child();
			c1.show();
			c1.display();
		}
	}
	}
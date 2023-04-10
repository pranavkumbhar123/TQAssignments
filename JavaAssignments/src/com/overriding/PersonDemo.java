package com.overriding;

class Person{
	void readscript()
	{
		System.out.println("i am person");
	}
}
class Actor extends Person{
	void readscript()
	{
		System.out.println("i am actor");
	}
}




public class PersonDemo {

	public static void main(String[] args) {
		Person p1=new Person();
		p1.readscript();
		
		Actor a1=new Actor ();
		a1.readscript();


	}

}

package com.hierarchical1;


 class person{

	protected void display()
	{
		System.out.println("i am a person");
	}
 }

 class employee extends person{
@Override
	public void display()
	{
		System.out.println("i am employee");
	}
 }

 class celebrity extends person{

	public void display()
	{
		System.out.println("i am celebrity");
	}
 }




public class ovearride {

	public static void main(String[] args) {
		person p1= new person();
		p1.display();
		
		employee e1= new employee();
		e1.display();
		celebrity c1= new celebrity();
		c1.display();

	}

}

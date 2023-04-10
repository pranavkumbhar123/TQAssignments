package com.singleinheritance;

public class ManagerTest {

	public static void main(String[] args) {
		Employee e=new Employee(1,"pranav");
		Manager m=new Manager(2,"nilesh",290000);
		

		System.out.println(e);
		System.out.println(m);
	}

}

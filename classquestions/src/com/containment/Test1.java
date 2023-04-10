package com.containment;

public class Test1 {

	public static void main(String[] args) {

		Department d1= new Department(1,"mech","ashta");
		
		Employee e1= new Employee(1,"pranav",50000f,d1);
		System.out.println(e1);

	}

}

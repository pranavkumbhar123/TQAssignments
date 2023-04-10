package com.containment;

import java.util.Scanner;

public class TestEmployee {

	static Scanner sc = new Scanner(System.in);

	public  void enterEmployeeDetails(Employee e) {

		Department de = new Department();

		
		System.out.println("Emp id:");
		e.setId(sc.nextInt());
		System.out.println("Emp name:");
		e.setName(sc.next());
		System.out.println("Emp salary:");
		e.setSalary(sc.nextFloat());
		
		DepartmentDetails(de);
		e.setDept(de);
	}

	public void DepartmentDetails(Department d) {

		System.out.println("dept id:");
		d.setId(sc.nextInt());
		System.out.println("dept name:");
		d.setDName(sc.next());
		System.out.println("dept location:");
		d.setLocation(sc.next());
	}

	public static  void main(String args[]) {
		TestEmployee te= new TestEmployee();
		
		Employee e1 = new Employee();

		te.enterEmployeeDetails(e1);
		System.out.println(e1);

		Employee e2 = new Employee();

		te.enterEmployeeDetails(e2);
		System.out.println(e2);

		Department d1 = new Department();

		te.DepartmentDetails(d1);

	}

}

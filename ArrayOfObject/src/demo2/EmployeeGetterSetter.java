package demo2;

import java.util.Scanner;

public class EmployeeGetterSetter {

	static Scanner sc=new Scanner(System.in);
	public static void enterEmployeeDetails(Employee e)
	{
		System.out.println("Enter employee id");
		e.seteId(sc.nextInt());
		System.out.println("Enter employee name");
		e.setName(sc.next());
		System.out.println("Enter employee salary");
		e.setSalary(sc.nextFloat());
	
		Department d=new Department();
		System.out.println("Enter department id");
		d.setDId(sc.nextInt());
		System.out.println("Enter department name");
		d.setName(sc.next());
	
		e.setEmployee(d);
		
		
		
		
	}
	public static void salarySort(Employee em[])
	{
		Employee e= new Employee();// temporary object
		for(int i=0;i<em.length;i++)
		{
			for(int j=i+1;j<em.length;j++)
			{
				if(em[i].getSalary()>em[j].getSalary())
				{
					e=em[i];
					em[i]=em[j];
					em[j]=e;
				}
			}
		}
		
		
	}
	public static void DepartmentWiseEmployees(Employee[]emp)
	{
		System.out.println("=============");
		String dname=sc.next();
		for(Employee e:emp)
		{
			
			for(Department d:e.getDepartment())
			{
				if(e.getName().equals(dname))
				{
					System.out.println(e.getName());
				}
			}
			System.out.println();
			
		}
	}
	
	public static void highestSalary(Employee []em)
	{
		float highest=Float.MIN_VALUE;
		Employee ehigh=new Employee();
		for(Employee e:em)
		{
			if(e.getSalary()>highest)
			{
				ehigh=e;
				highest=e.getSalary();
			}
		}
		System.out.println("Highest salary");
		System.out.println(ehigh);
	}
	public static void printEmpDetails(Employee em[])
	{
		System.out.println("=================================");
		for(Employee e:em)
		{
			System.out.println(e.geteId()+" "+e.getName()+" "+e.getSalary());
			for(Department dept:e.getDepartment())
			{
				System.out.println(dept);
			}
			System.out.println("====================");
		}
	}
	
	
		
	
			

	
	
	public static void main(String[] args) {
		Employee emp[]=new Employee[3];
		for(int i=0;i<emp.length;i++)
		{
			emp[i]=new Employee();
			enterEmployeeDetails(emp[i]);
		}

		System.out.println("Employee Details");
		printEmpDetails(emp);
		

		highestSalary(emp);
		System.out.println("=======After Sorting=========");
		salarySort(emp);
		printEmpDetails(emp);
		System.out.println("========");
		
	
		DepartmentWiseEmployees(emp);
		
		
	}

}

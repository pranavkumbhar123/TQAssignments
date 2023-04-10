package demo2;

public class EmployeeTest {

	public static void enterDetails(Employee[] em) {

		Department dept[] = new Department[3];

		dept[0] = new Department(1, "technical");
		dept[1] = new Department(2, "Hr");
		dept[2] = new Department(3, "Marketing");

	
		Employee e1[]  = new Employee[10];
		e1[0] = new Employee(1, "pranav", 50000, dept[0]);
		e1[1] = new Employee(2, "nilesh", 40000, dept[1]);
		e1[2] = new Employee(3, "omkar", 60000, dept[2]);
		e1[3] = new Employee(4, "om", 64000, dept[2]);
		e1[4] = new Employee(5, "annya", 58888, dept[0]);
		e1[5] = new Employee(6, "abhi", 67000, dept[0]);
		e1[6] = new Employee(7, "atharv", 40000, dept[1]);
		e1[7] = new Employee(8, "Nikhil", 61000, dept[1]);
		e1[8] = new Employee(9, "vaishnavi", 30000, dept[2]);
		e1[9] = new Employee(10, "shravani", 700000, dept[2]);
	
		
	
		for(Employee emp:e1)
		{
			System.out.println(emp);
		}
	}
	public static void highestSalary(Employee []emp)
	{
		float highest=Float.MIN_VALUE;
		Employee ehigh=new Employee();
		for(Employee e1:emp)
		{
			
		}
	}
	public static void main(String[] args) {

		Employee em[]=new Employee[1];
		System.out.println("Employee details");
		for(int i=0;i<em.length;i++)
		{
			em[i]=new Employee();
			enterDetails(em);
		}
		
		
		
	}

}

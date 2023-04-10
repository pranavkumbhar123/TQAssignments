package demo2;

public class Employee {

	private int eId;
	private String name;
	private float salary;
	private Department department;
	
	public Employee()
	{
		
	}
	public Employee(int eId, String name, float salary, Department department)
	{
		this.eId=eId;
		this.name=name;
		this.salary=salary;
		this.department=department;
	}
	public int geteId() {
		return eId;
	}
	public void seteId(int eId) {
		this.eId = eId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public Department  getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	public String toString()
	{
		return "Employee:"+eId+" "+name+" "+salary+" "+department;
	}
	
}

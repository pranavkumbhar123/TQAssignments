package com.hierarchical;

public class CollegeStudent extends student {

	private String course;
	private int sem;
	
	public CollegeStudent()
	{
		
	}
	CollegeStudent(int id, String name, float marks, double fees, String course,int sem)
	{
		super(id,name,marks,fees);
		this.course=course;
		this.sem=sem;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public int getSem() {
		return sem;
	}
	public void setSem(int sem) {
		this.sem = sem;
	}
	public String toString()
	{
		return super.toString()+" "+course+" "+sem;
	}
}

package com.methodoverride;

public class SchoolStudent extends student {

	private String schoolName;
	private int std;
	
	public SchoolStudent() {
		
	}
	SchoolStudent(int id, String name, float marks, double fees, String schoolName, int std)
	{
		super(id, name, marks,fees);
		this.schoolName=schoolName;
		this.std=std;
	}
	public String getSchoolName() {
		return schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	public int getStd() {
		return std;
	}
	public void setStd(int std) {
		this.std = std;
	}
	@Override
	public void calcFees( double fees)
	{
		System.out.println("Calculating school fees");
		fees=(fees*4)+5000;
		setFees(fees);
	}
	public String toString()
	{
		return super.toString()+" "+schoolName+" "+std;
	}
}

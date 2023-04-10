package com.multilevel;

public class TechManager extends Manager {

	private String tech;
	TechManager()
	{
		super();
		
	}
	TechManager(int id, String name, float salary, int exp, String tech){
		super(id, name, salary, exp);
		this.tech=tech;
	}
	public void setTech(String tech)
	{
		this.tech=tech;
	}
	public String getTech()
	{
		return tech;
	}
	public String toString ()
	{
		return super.toString() +" "+tech;
	}
}

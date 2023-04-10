package com.vaccination;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class Person {
	
	int regId;
	String name;
	Date birthDate;
	int age;
	Date vaccine[];
	
	static SimpleDateFormat f1= new SimpleDateFormat("dd-MM-yyyy");
	
	public Person() {
      
		vaccine= new Date[3];
		     
	}

	public Person(int regId, String name, Date birthDate, int age) {
        this();
		this.regId = regId;
		this.name = name;
		this.birthDate = birthDate;
		this.age = age;
		
	}

	public int getRegId() {
		return regId;
	}

	public void setRegId(int regId) {
		this.regId = regId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Date[] getVaccine() {
		return vaccine;
	}

	public void setVaccine(Date[] vaccine) {
		this.vaccine = vaccine;
			
	}

	@Override
	public String toString() {
		return "Person [regId=" + regId + ", name=" + name + ", birthDate=" + f1.format(birthDate)+ ", age=" + age + ", vaccine="
				+ Arrays.toString(vaccine) + "]";
	}
	
	
	
}

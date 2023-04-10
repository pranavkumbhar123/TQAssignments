package com.Demo;

public class StudentTest {

	public static void main(String[] args) {


		Student st[]=new Student[5];
		st[0]=new Student(1,"pranave",89);
		st[1]=new Student(2,"nilesh",99);
		st[2]=new Student(3,"omkar",90);
		st[3]=new Student(4,"om",95);
		st[4]=new Student(5,"annya",88);
		
		for(Student x:st)
		{
			System.out.println(x);
		}
				

	}

}

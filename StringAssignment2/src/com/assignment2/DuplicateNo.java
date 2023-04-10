package com.assignment2;

import java.util.Scanner;

public class DuplicateNo {

	public static void countDuplicateNo(String s)
	{
		s=s.toLowerCase();
		char ch[]=s.toCharArray();
		int dcount=0;
		int count;
		for(int i=0;i<ch.length;i++)
		{
			count =1;
			if(ch[i]=='\0')
				continue;
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]==ch[j])
				{
					count++;
					ch[j]='\0';
				}
			}
			if(count>1)
			{
				dcount++;
				System.out.println(ch[i]+" : "+count);
			}
		}
		System.out.println("number of duplicate elements:"+dcount);
	}
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string:");
		String st=sc.next();
		countDuplicateNo(st);
		

	}

}

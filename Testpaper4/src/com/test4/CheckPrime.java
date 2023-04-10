package com.test4;

import java.util.Scanner;

public class CheckPrime {
 
	public static void CheckPrimeNo(int num)
	{
		boolean status=true;
		if((num==0)&&(num==1))
		{
			System.out.println(num+" is not a prime number ");
		}
		else
		{
			for(int i=2;i<=num/2;i++)
			{
				if(num%2==0)
				{
					status=false;
					break;
				}
			}
			
			if(status)
			{
				System.out.println(num+" is a prime number");
			}
			else
			{
				System.out.println(num+" is not prime number");
			}
		}
	}
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		CheckPrimeNo(num);
		

	}

}

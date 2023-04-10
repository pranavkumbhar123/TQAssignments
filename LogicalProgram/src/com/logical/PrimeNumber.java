package com.logical;

import java.util.Scanner;

public class PrimeNumber {

	public static void  checkPrime(int num) {
		boolean status=true;
		if((num==0)||(num==1))
		{
			System.out.println(num+"is not a prime number");
		}
		else
		{
			for(int i=2;i<=num/2;i++)
			{
				if(num%i==0)
				{
					status =false;
					break;
				}
			}
			if(status)
			{
				System.out.println(num+" is a prime number");
			}
			else
			{
				System.out.println(num+" is not a prime number");
			}
		}

	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		checkPrime(num);
	}
	

}

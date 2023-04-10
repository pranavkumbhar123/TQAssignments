package com.example;

import java.util.Arrays;

public class PrimeNumber {

	public static void Prime(int ar[])
	{
		for(int i=0;i<ar.length;i++)
		{
			CheckPrime(ar[i]);
		}
	}
	public static void CheckPrime(int num)
	{
		
		boolean status =true;
		if(num==1||num==0)
			status =false;
		
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
				System.out.println("Prime num:"+num);
			}
		
			
		
		
	}
	public static void main(String[] args) {


		int arr[]= {3,4,6,7,11};
		System.out.println(Arrays.toString(arr));
			
		Prime(arr);
	}

}

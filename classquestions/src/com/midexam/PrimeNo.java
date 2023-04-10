package com.midexam;

import java.util.Arrays;

public class PrimeNo {

	public static void check(int ar[]) {
		for(int i=0;i<ar.length;i++)
		{
			PrimeNo(ar[i]);
		}
	}
	public static void PrimeNo(int num)
	{
		
		{
			
			boolean status =true;
			if(num==0||num==1)
				status =false;
			else
			{
				for(int i=2;i<=num/2;i++)
				{
					if(num%i==0)
					status =false;
				}
			}
			if(status)
			{
				System.out.println(num);
			}
			
		}
	}
	public static void main(String[] args) {


		int ar[]= {1,2,9,5,8};
		System.out.println(Arrays.toString(ar));
		
		check(ar);

	}

}

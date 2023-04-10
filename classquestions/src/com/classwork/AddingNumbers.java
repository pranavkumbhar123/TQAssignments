package com.classwork;

import java.util.Arrays;

public class AddingNumbers {
	
	public static void AddingNo(int arr[])
	{
		int num=0;

		for(int a:arr)
		{
			num+=a;
		}
	System.out.println(num);
		int sum=0;
		while(num>0||sum>9)
		{
			
			if(num==0)
			{
				num=sum;
				sum=0;
			}
			sum=sum+num%10;
			num=num/10;
			
		}
		System.out.println(sum);
		
		
	}

	public static void main(String[] args) {
		int ar[]={12,14,20,15,17};
		
		System.out.println(Arrays.toString(ar));
		
		AddingNo(ar);
		
	}

}

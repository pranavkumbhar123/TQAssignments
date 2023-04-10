package com.test4;

import java.util.Scanner;

public class FrequencyNo {
	public static void FrequencyNumber(int num)
	{
		int i,count,digit,temp;
		for(i=0;i<=9;i++)
		{
			count =0;
			temp=num;
		
			while(temp>0)
			{
				digit=temp%10;
				if(digit==i)
				{
					count ++;
				}
				temp=temp/10;
			}
			if(count>0)
			{
				System.out.println(i+" :  "+count);
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		FrequencyNumber(num);
		

	}

}

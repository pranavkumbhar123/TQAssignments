package com.test4;

import java.util.Scanner;

public class ReverseNumber {

	
	public static void ReverseNo(int num)
	{
		int reverse=0;
		while(num!=0)
		{
			int r=num%10;
			reverse=reverse*10+r;
			num=num/10;
		}
		System.out.println("Reverse number is "+reverse);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		ReverseNo(num);
		

	}

}

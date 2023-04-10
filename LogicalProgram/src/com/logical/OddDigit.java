package com.logical;

import java.util.Scanner;

public class OddDigit {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		while(num!=0)
		{
			int r=num%10;
			if(r%2!=0)
			{
			System.out.println(r);	
			}
			num=num/10;
				
			
		}
		

	}

}

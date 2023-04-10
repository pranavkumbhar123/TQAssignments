package com.midexam;

import java.util.Scanner;

public class Pattern3 {

	public static void main(String[] args) {


		Scanner sc=new Scanner(System.in);
		System.out.println("Enter rows:");
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=(n-1);j++)
			{
				System.out.print(" ");
			}
			
			char ch='A';
			for(int j=1;j<=i;j++)
			{
				System.out.print(ch);
				ch++;
			}
			System.out.println();
		}

	}

}

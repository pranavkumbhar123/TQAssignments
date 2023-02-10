package com.NumberPattern;

import java.util.Scanner;

public class Pattern4 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter rows:");
		int n =sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			// for spaces
			for(int j =1;j<=(n-i);j++)
			{
				System.out.print(" ");
			}
			// for numbers
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}

}

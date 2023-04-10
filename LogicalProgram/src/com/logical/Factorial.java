package com.logical;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n, fact=1;
		n=sc.nextInt();
		
		while(n>0)
		{
			fact=fact*n;
		
			n=n-1;
		}
	System.out.println("factors of number"+fact);

	}

}

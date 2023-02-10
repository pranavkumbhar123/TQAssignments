package com.looping;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, fac =1;
		System.out.println("Enter no. to find factorial:");
		n = sc.nextInt();
		
		while(n>0)
		{
			fac = fac*n;
			n = n-1;
		}
		
		System.out.println("Factorial:"+fac);

	}

}

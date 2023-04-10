package com.switchsase;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number");
		int num= sc.nextInt();
		
		switch(num%2)
		{
		case 0:
		System.out.println(num+" number is even ");
		break;
		case 1:
			System.out.println(num+" number is odd ");
			break;
		}

	}

}

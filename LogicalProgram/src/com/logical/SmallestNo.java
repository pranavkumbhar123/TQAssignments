package com.logical;

import java.util.Scanner;

public class SmallestNo {

	public static void main(String[] args) {
		int num1, num2, num3,smallest;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter 1st number");
		num1=sc.nextInt();
		System.out.println("Enter 2nd number");
		num2=sc.nextInt();
		System.out.println("Enter 3rd number");
		num3=sc.nextInt();
		smallest= (num1<num2)?((num1<num3)?num1:num3):((num2<num3)?num2:num3);
		System.out.println("the smallest number is "+smallest);

	}

}

package com.anonymousobject;

public class Addition {

	int num1;
	int num2;
	int num3;
	int num4;

	Addition (int p, int q){
		num1=p;
		num2=q;
		int num1num2=num1+num2;
		System.out.println("Addition of num1 and num2:"+num1num2);
	}
	void addition(int x, int y) {
		num3 = x;
		num4 = y;
		int num3num4 = num3 + num4;
		System.out.println("Addition of num3 and num4:" + num3num4);

	}

	public static void main(String args[]) {
		new Addition(2, 2).addition(1, 5);
		new Addition(4, 10).addition(5, 15);
	}
}

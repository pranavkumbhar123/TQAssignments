package com.dyanamicmethod;

import java.util.Scanner;

class Account {
	void display()
	{
		float amount = 5000;
		System.out.println("enter a amount"+amount);
	}
	
	
	
	
}
class SavingAccount extends Account{
	void display() {
		float amount = amount*3*time;
		System.out.println("amount after 3% interest rate:"+amount);
	}
}

class CurrentAccount extends Account{
	
}





public class Bank {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a amount:");
		float amount = sc.nextFloat();
		
		

	}

}

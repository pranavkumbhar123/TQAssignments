package com.constructor1;

import java.util.Scanner;

public class AccountTest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Account a1=new Account();
		System.out.println("Enter account no");
		a1.setAccountNo(sc.nextLong());
		
		System.out.println("Enter customer Name");
		a1.setCustomerName(sc.next());
		
		System.out.println(a1.getAccountNo()+" "+a1.getCustomerName());
	}

}

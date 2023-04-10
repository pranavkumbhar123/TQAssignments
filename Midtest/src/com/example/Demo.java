package com.example;

public class Demo {

	
	public static void main(String[] args) {
		
		String str="Pranav";
		
		String rev="";
		for(int i=0;i<str.length();i++)
		{
			rev=str.charAt(i)+rev;
			
			
		}
		System.out.println("After reversed:"+rev);
	
		
		
	}

}

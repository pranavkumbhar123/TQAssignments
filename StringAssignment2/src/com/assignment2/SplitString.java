package com.assignment2;

import java.util.Arrays;

public class SplitString {

	public static void main(String[] args) {


		String str="Java is the best language";
		
		String splitstr[]=str.split("\\s");
		
		
		
		System.out.println(Arrays.toString(splitstr));
		
		
	}

}

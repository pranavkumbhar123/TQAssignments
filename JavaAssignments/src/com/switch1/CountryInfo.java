package com.switch1;

import java.util.Scanner;

public class CountryInfo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter country name:");
		String cname = sc.next();
		switch(cname) {
		case "India":System.out.println("pincode:1200, capital= new delhi,area=1357");
		break;
		case "Japan":System.out.println("pincode:1200, capital=tokoyo, area=5553");
		break;
		default:System.out.println("Invalid country name");
		
		}

	}

}

package com.classwork;

public class ShiftOddNo {

	public static void main(String[] args) {


		int a[]={1,2,5,6,3,4,7,8};  
	 
		for(int i=0;i<a.length;i++){  
		if(a[i]%2==0){  
		System.out.println(a[i]);  
		}  
		}  
		 
		for(int i=0;i<a.length;i++){  
		if(a[i]%2!=0){  
		System.out.println(a[i]);  
		}  
		}  
		

	}

}

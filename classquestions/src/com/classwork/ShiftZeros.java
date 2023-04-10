package com.classwork;

import java.util.Arrays;

public class ShiftZeros {

	 public static void SZeros(int array[], int n) {
		   
	      
	      Arrays.sort(array);
	      System.out.println("Elements of array after moving all the zeros to the end of array: ");
	      
	      
	      for (int i = n-1; i >= 0; i--) {
	         System.out.print(array[i] + " ");
	      }
	   }
	
	public static void main(String[] args) {


		  int array[] = {128, 0, 99, 67, 50, 0, 29, 7, 0};
	      
	     
	      int n = array.length;
	      
	     
	      SZeros(array, n);

	}

}

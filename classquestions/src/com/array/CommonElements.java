package com.array;

import java.util.Arrays;

public class CommonElements {

	public static void findCommonElement(int arr1[], int arr2[] )
	{
		System.out.println("common elements are:");
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr2.length;j++)
			{
			
				if(arr1[i]==arr2[j])
				{
					System.out.println(arr1[i]);
				}
			}
		}
	}
	
	
	public static void main(String[] args) {
		int ar1[]= {1,2,3,4,5,6};
		int ar2[]= {7,8,9,2,3};
		System.out.println(Arrays.toString(ar1));
		System.out.println(Arrays.toString(ar2));

		findCommonElement(ar1,ar2);
	}

}

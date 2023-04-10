package com.midexam;

import java.util.Arrays;

public class Frequency {

	public static void countF(int arr[])
	{
		int dcount=0;
		int count;
		for(int i=0;i<arr.length;i++)
		{
			count=1;
			if(arr[i]=='\0')
				continue;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
					arr[j]='\0';
				}
			}
			if(count>1)
			{
				dcount++;
				
				
			
			System.out.println(arr[i]+" : "+count);
			}
			System.out.println("number of d"+dcount);
		}
	}
	public static void main(String[] args) {


		int ar[]= {1,2,2,3,4,5,5,6};
		System.out.println(Arrays.toString(ar));
		countF(ar);
		
		
	}

}

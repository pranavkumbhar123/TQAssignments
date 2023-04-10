package com.alphabate;

public class Pattern3 {

	public static void main(String[] args) {


		int n=0;
		for(int i='E';i<='B';i++)
		{
			for(int j='E';j<=(n-i);j++)
			{
				System.out.print(" ");
			}
			for(int j='E';j<='B';j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}


	}

}

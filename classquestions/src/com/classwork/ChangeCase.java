package com.classwork;

public class ChangeCase {

	public static void ChangeCase1(String st)
	{
		char ch[]=st.toCharArray();
		
		for(int i=0;i<st.length();i++)
		{
			if(ch[i]>=97 && ch[i]<=122)
			{
				ch[i]-=32;
			}
			else
			{
				ch[i]+=32;
			}
			
		
				
			
		}
		System.out.println(ch);
	}
	public static void main(String[] args) {


		String str="PraNAV";
		ChangeCase1(str);

	}

}

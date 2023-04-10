package com.assignment2;

public class replaceV {

	public static void replaceV1(String st)
	{
		st=st.toLowerCase();
		char ch1[]=st.toCharArray();
		for(int i=0;i<ch1.length;i++)
		{
			if((ch1[i]=='a')||(ch1[i]=='e')||(ch1[i]=='i')||(ch1[i]=='o')||(ch1[i]=='u'))
			{
				ch1[i]='#';
			}
		}
		System.out.println(ch1);
	}
	public static void main(String[] args) {


		String str="java";
		System.out.println("Original:"+str);
		
		replaceV1(str);


	}

}

package com.assignment2;

public class FrequencyOfWords {

	public static void freqWords(String st)
	{
		st=st.toLowerCase();
		String splitstr[]=st.split("\\s");
		
		int count;
		
		for(int i=0;i<splitstr.length;i++)
		{
			
			count =1;
			if(splitstr[i].equals("visited"))
				continue;
			for(int j=i+1;j<splitstr.length;j++)
			{
				if(splitstr[i].equals(splitstr[j]))
				{
					count++;
					splitstr[j]="visited";
				}
			}
			
			
			
				System.out.println(splitstr[i]+" : "+count);
				
			
	
		}
	}
	public static void main(String[] args) {


		String str="A big cat is rolling on a big mat";
		freqWords(str);

	}

}

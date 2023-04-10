package com.collection;

import java.util.ArrayList;

public class FreqOfString {

	public static void calFreq(ArrayList<String>al)
	{
		int count;
		for(int i=0;i<al.size();i++)
		{
			count=1;
			
			if(al.get(i).equals("Visited"))
				continue;
			for(int j=i+1;j<al.size();j++)
			{
				if(al.get(i).equals(al.get(j))) 
				{
					al.set(j, "Visited");
					count++;
				}
				
				}
			System.out.println(al.get(i)+" : "+count);
			}
		}
		
	
	public static void main(String[] args) {


		ArrayList<String> s=new ArrayList<>();
		s.add("A");
		s.add("B");
		s.add("C");
		s.add("B");
		s.add("A");
		calFreq(s);

	}

}

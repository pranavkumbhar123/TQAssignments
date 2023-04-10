package com.collections;

import java.util.ArrayList;
import java.util.List;

public class ReplaceDuplicate {

	public static void main(String[] args) {
		
		List l1=new ArrayList<>();
		l1.add("Java");
		l1.add("Python");
		l1.add("C");
		l1.add("Java");
		
		for(int i =0;i<l1.size();i++)
		{
			if(l1.get(i).equals("Java"))
				l1.set(i, "Core Java");
		}
		System.out.println(l1);
	}

}

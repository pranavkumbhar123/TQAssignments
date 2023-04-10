package com.collection;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateElements {

	public static void main(String[] args) {


		 ArrayList<String>l=new ArrayList<>();
	        l.add("Mango");  
	        l.add("Banana");  
	        l.add("Mango");  
	        l.add("Apple");  
	        System.out.println(l.toString());  
	        Set<String> s = new LinkedHashSet<String>(l);  
	        System.out.println(s);  

	}

}

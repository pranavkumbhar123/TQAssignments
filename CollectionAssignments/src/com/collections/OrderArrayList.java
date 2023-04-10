package com.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class OrderArrayList {

	public static void main(String[] args) {


		ArrayList<Order> olist=new ArrayList<>();
		
		olist.add(new Order(1,"Mobile",15000f));
		olist.add(new Order(2,"MemoryCard",500f));
		olist.add(new Order(3,"Charger",1500f));
		olist.add(new Order(4,"Pendrive",500f));
		
		Iterator<Order> itr=olist.iterator();
		
		while (itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		

	}

}

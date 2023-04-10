package com.collections;

import java.util.Map;
import java.util.NavigableSet;
import java.util.TreeMap;

public class CustomerOrderTreeMap {

	
	public static void main(String[] args) {

		TreeMap<Customer,Order> tmap=new TreeMap<>(new NameComparator());
		
		tmap.put(new Customer(1,"Pranav",91727092),new Order(101,"laptop" ,98555f));
		tmap.put(new Customer(3,"nilesh",91737092),new Order(102,"pendrive" ,99555f));
		tmap.put(new Customer(4,"Om",81727092),new Order(104,"CD" ,93455f));
		tmap.put(new Customer(5,"Atharv",91727892),new Order(103,"charger" ,98534f));
		tmap.put(new Customer(2,"Sumit",91727093),new Order(105,"laptop" ,98995f));
		
		for(Map.Entry<Customer, Order> en:tmap.entrySet())
		{
			System.out.println(en.getKey()+"  "+en.getValue());
		}
		
		System.out.println("================");
		NavigableSet<Customer> cs=tmap.navigableKeySet();
		for(Customer c:cs)
		{
			System.out.println(c+" "+tmap.get(c));
		}
		
		

	}

}

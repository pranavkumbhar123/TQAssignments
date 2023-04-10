package com.supplier;

public class SupplierTest {

	public static void main(String[] args) {
		

		Supplier s[]=new Supplier[3];
		Item i1[]=new Item[3];
		i1[0]=new Item(1,"Apple",80);
		i1[1]=new Item(2,"gauva",56);
		i1[2]=new Item(3,"oranges",70);
		
		s[0]=new Supplier(101,"Mr.pranav",82823382,i1);
		
		Item i2[]=new Item[2];
		i2[0]=new Item(1,"pineappler",90);
		i2[1]=new Item(2,"Apple",98);
		
		s[1]=new Supplier(102,"Mr.nilesh",7033838,i2);
		
		Item i3[]=new Item[2];
		i3[0]=new Item(1,"oranges",89);
		i3[1]=new Item(2,"kiwi",80);
		
		s[2]=new Supplier(103,"Mr.omkar",8483938,i3);
		
		for(Supplier st:s)
		{
			System.out.println(st.getsId()+" "+st.getsName()+" "+st.getPhoneNo());
			for(Item i:st.getItem())
			{
				System.out.println(i);
			}
			System.out.println("====================");
		}
	}

}

package com.multicatch;

public class MultiCatch {

	public static void main(String[] args) {
		
		try {
		String s[]= {"pranav","nilehs",null,"omkar"};
		
		for(int i=0;i<=s.length;i++)
		{
			System.out.println(s[i].length());
		}

		}
		catch(NullPointerException | ArrayIndexOutOfBoundsException  e)
		{
			System.out.println(e);
		}
		
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		

	}

}

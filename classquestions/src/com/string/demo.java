package com.string;

public class demo {

	public static void  CountCh(String str)
	{
		  int count = 0;    
          
	        //Counts each character except space    
	        for(int i = 0; i < str.length(); i++) {    
	            if(str.charAt(i) != ' ')    
	                count++;    
	        }    
	            
	        //Displays the total number of characters present in the given string    
	        System.out.println("Total number of characters in a string: " + count);    
	    }    
	

	public static int CountWord(String st)
	{
		
          int count=0;  
      
            char ch[]= new char[st.length()];     
            for(int i=0;i<st.length();i++)  
            {  
                ch[i]= st.charAt(i);  
                if( ((i>0)&&(ch[i]!=' ')&&(ch[i-1]==' ')) || ((ch[0]!=' ')&&(i==0)) )  
                    count++;  
            }  
            return count;  
        }  
	
	public static void main(String[] args) {
		
		String str = "The best of both worlds";    
		CountCh(str);
		System.out.println(CountWord(str) + " words.");   
	}

}


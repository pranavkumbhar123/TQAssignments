package com.string;

public class DuplicateWords {

	public static void DuplicateWord(String st)
	{
		st=st.toLowerCase();
		String splitstr[]=st.split("\\s");
		
		int count;
		int dcount=0;
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
			if(count>1)
			{
				dcount++;
				System.out.println(splitstr[i]+" : "+count);
			}
			
	}
		System.out.println("no. of duplicate words:"+dcount);
				
}
	
	
	public static void main(String[] args) {


		String str= "Big black bug bit a big black dog";
		DuplicateWord(str);

	}

}

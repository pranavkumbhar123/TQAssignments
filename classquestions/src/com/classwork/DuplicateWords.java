package com.classwork;

public class DuplicateWords {

	public static void DuplicateWord(String st)
	{
		st=st.toLowerCase();
		String splitstr[]=st.split("\\s");
		
		int count;
		int dcount=0;
		int maxCount=0;
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
			if(count>maxCount)
			{
				maxCount =count;
				
				dcount++;
				System.out.println(splitstr[i]+" : "+maxCount);
			}
			
	}
		System.out.println("no. of duplicate words:"+dcount);
				
}
	
	
	public static void main(String[] args) {


		String str= "Big black black bug bit a black big black dog";
		DuplicateWord(str);

	}

}

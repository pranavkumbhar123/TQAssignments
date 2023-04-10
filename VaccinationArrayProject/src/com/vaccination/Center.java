package com.vaccination;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Center {
	
	static int pCount=0;
	static Scanner sc= new Scanner(System.in);
	
	static SimpleDateFormat f1= new SimpleDateFormat("dd-MM-yyyy");
	
	public static void addPerson(Person p) throws ParseException
	{
		System.out.println("Enter person registration Id:");
		p.setRegId(sc.nextInt());
		
		System.out.println("Enter name:");
		p.setName(sc.next());
		
		System.out.println("Enter birth date(dd-mm-yyyy):");
		String bdate= sc.next();
		
		p.setBirthDate(f1.parse(bdate));
		
		System.out.println("Enter age:");
		
		p.setAge(sc.nextInt());
		
	
	}
	
	public static void deletePerson(Person[] parr, int rid)
	{
		boolean flag= false;
		
		for(int i=0;i<pCount;i++)
		{
			if(parr[i].getRegId()==rid)
			{
				flag =true;
				
				System.out.println(parr[i].getName());
				
				for(int j=i;j<pCount-1;j++)
				{
					parr[j]=parr[j+1];
					
				}
				parr[pCount-1]=null;
				pCount=pCount-1;						
				System.out.println("Person deleted succesfully");
				break;
								
			}
		}
		
		if(!flag)
			System.out.println("Person not found");
		
	}
	
	public static void updatePerson(Person[] parr, int rid) throws ParseException
	{
       boolean flag= false;
		
		for(int i=0;i<pCount;i++)
		{
			if(parr[i].getRegId()==rid)
			{
				flag =true;
				System.out.println("Person details are:");
				System.out.println(parr[i]);
				
				System.out.println("Enter name:");
				parr[i].setName(sc.next());
				
				System.out.println("Enter birth date(dd-mm-yyyy):");
				String bdate= sc.next();
				
				parr[i].setBirthDate(f1.parse(bdate));
				
				System.out.println("Enter age:");
				
				parr[i].setAge(sc.nextInt());
				
				System.out.println("Person updated succesfully");
				break;
								
			}
		}
		
		if(!flag)
			System.out.println("Person not found");
		
	}
	
	public static void viewPersonById(Person[] parr, int rid) 
	{
       boolean flag= false;
		
		for(int i=0;i<pCount;i++)
		{
			if(parr[i].getRegId()==rid)
			{
				flag =true;
				System.out.println("Person details are:");
				System.out.println(parr[i]);
								
				break;
								
			}
		}
		
		if(!flag)
			System.out.println("Person not found");
		
	}
	
	
	public static void viewAllPerson(Person[] parr)
	{

	System.out.println("================================================");
	System.out.println("--------------Person List-----------------");
	System.out.println("//////////////////////////////////////////////////");
      for(int i=0;i<pCount;i++)
      {
    	  System.out.println(parr[i]);
      }
			
		
	}
	
	public static void goVaccine(Person[] parr, int rid) throws ParseException
	{
       boolean flag= false;
       Date vacc[];
		for(int i=0;i<pCount;i++)
		{
			if(parr[i].getRegId()==rid)
			{
				flag=true;
				System.out.println("Person details are:");
				System.out.println(parr[i]);
				vacc= parr[i].getVaccine();
				if(vacc[0]==null)
				{
					System.out.println("You are welcome for the first dose:");
					System.out.println("Enter date:");
					String vdate= sc.next();
					vacc[0]= f1.parse(vdate);
					parr[i].setVaccine(vacc);
					System.out.println("----------  First Dose Done--------------------------");
					
				}
				else 
					if(vacc[1]==null)
					{
						System.out.println("Second dose of vaccination:");
						System.out.println("Enter date:");
						String vdate= sc.next();
						vacc[1]= f1.parse(vdate);
						parr[i].setVaccine(vacc);
						System.out.println("----------  Second Dose Done--------------------------");
						
					}
					else
						if(vacc[2]==null)
						{
							System.out.println("Booster Dose:");
							System.out.println("Enter date:");
							String vdate= sc.next();
							vacc[2]= f1.parse(vdate);
							parr[i].setVaccine(vacc);
							System.out.println("--------Booster Done--------------------------");
						}
						else
						{
							System.out.println("===================================================");
							System.out.println("Congratulations!! Your vaccination is completed");
							System.out.println("===================================================");
						}
								
				break;
								
			}
		}
		
		if(!flag)
			System.out.println("Person not found");
		
	}

	public static void main(String[] args) throws ParseException {
		
		Person p1[]= new Person[3];
  		 int choice;
  		 String ch;
     do
     {
    	 System.out.println("---------------Vaccination Center-----------------------");
    	 System.out.println("1.Add a person");
    	 System.out.println("2.Delete a person");
    	 System.out.println("3.Update a person");
    	 System.out.println("4.View person by ID");
    	 System.out.println("5.View all persons");
    	 System.out.println("6.Go for the vaccination dose");
    	 System.out.println("0:EXIT");
    	 
    	 choice= sc.nextInt();
    	
    	 switch(choice)
    	 {
    	 case 1:if(pCount<p1.length)
    	        {
    		      p1[pCount]= new Person();
    		      addPerson(p1[pCount]);
    		      pCount++;
    		 
    	          }
    	        else
    	        {
    	    	   System.out.println("No more registrations can be done");
    	        }
      	          break;
      	          
    	 case 2: System.out.println("Enter registration id to be deleted:");
    	         int rid= sc.nextInt();
    	         deletePerson(p1, rid);
    	         break;
    	 case 3:System.out.println("Enter the registration id to be updated:");
    	         rid= sc.nextInt();
    	         updatePerson(p1, rid);
      	         break; 
    	 case 4: System.out.println("Enter the registration id :");
                 rid= sc.nextInt();
                 viewPersonById(p1, rid);
	              break;        
    	 case 5:viewAllPerson(p1);
    	        break; 
    	        
    	 case 6: System.out.println("-------------Vaccination Panel-------------");
    	         System.out.println("Enter your reg id:");
    	         rid= sc.nextInt();
    	         goVaccine(p1, rid);
    	         break;
    		 
    	 }

      System.out.println("Do you want to perform more operation(yes/no)");	
      ch=sc.next();
    	 
     }while(ch.equalsIgnoreCase("yes"));

	}

}

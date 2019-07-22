// Java Core Project : College registration form

import java.util.*;
class Student
{
	String name[]=new String[10];
	String first,middle,last;
	String dob;
	String courses[]={"M.Tech","MBA","MSC","MA","B.tech","BBA","BSC","LLB","BA"};
	String gender[]={"Male","Female","Dont want to specify"};
	long pno,pinno;
	String course;
	String gend;
	String email,city,state,address;
	Scanner ob=new Scanner(System.in);
	void studentdisp()
	{    //--------------------------------------------------

			System.out.println("Courses Available");
			for(int i=0;i<=8;i++)
			{
				System.out.println((i+1)+") "+courses[i]);
			}
			int choice;
			System.out.print("Enter your choice of course:");
			choice=ob.nextInt();
			
			int x=0;
			switch(choice)
			{
			case 1:  System.out.println("Your choice of course is:"+courses[0]);
					 course=courses[0];
					 break;
			case 2:  System.out.println("Your choice of course is:"+courses[1]);		
					 course=courses[1];
					 break;
			case 3:  System.out.println("Your choice of course is:"+courses[2]);
					 course=courses[2];
					 break; 			 
			case 4:  System.out.println("Your choice of course is:"+courses[3]);
					 course=courses[3];
					 break;
			case 5:  System.out.println("Your choice of course is:"+courses[4]);
					 course=courses[4];
					 break; 			 
			case 6:  System.out.println("Your choice of course is:"+courses[5]);
					 course=courses[5];
					 break;		 
			case 7:  System.out.println("Your choice of course is:"+courses[6]);
					 course=courses[6];
					 break;
			case 8:  System.out.println("Your choice of course is:"+courses[7]);
					 course=courses[7];
					 break;		 
			case 9:  System.out.println("Your choice of course is:"+courses[8]);
					 course=courses[8];
					 break;
			default: System.out.println("Your choice of course is not available");
					 x=1;
			}
			
		System.out.println("Enter your name:-");
		System.out.print("  First name:"+" ");
		first=ob.nextLine();
		first=ob.nextLine();
		System.out.print("  Second name:"+" ");
		middle=ob.nextLine();
		System.out.print("  Last name:"+" ");
		last=ob.nextLine();
		   //----------------------------------------------------------------

		   System.out.println("Enter your Date Of Birth:");
		   System.out.print("Format of date: dd/mm/yyyy ->");
		   dob=ob.nextLine();
		   //----------------------------------------------------------------
		   System.out.println("Enter your gender");
		   int y;
		   for(int j=0;j<=2;j++)
		   {
				System.out.println((j+1)+") "+gender[j]);   
		   }   
			y=ob.nextInt();
			if(y==1)
			{
				gend=gender[0];	
			}
			else if(y==2)
			{
				gend=gender[1];
			}
			else if(y==3)
			{
				gend=gender[2];		
			}
		   //----------------------------------------------------------------
		   
		   System.out.print("Enter your residential address : ");
		   address=ob.nextLine();
		   address=ob.nextLine();
		   System.out.print("Enter your City name : ");
		   city=ob.nextLine();
		   System.out.print("Enter your State name : ");
		   state=ob.nextLine();
		   //----------------------------------------------------------------
		   System.out.print("Enter your phone no. : ");
		   pno=ob.nextLong();
		   //----------------------------------------------------------------
		   System.out.print("Enter your pin no :"); 
		   pinno=ob.nextLong();
		   //----------------------------------------------------------------
		   
		   System.out.print("Enter your email address: ");
		   email=ob.nextLine();
		   email=ob.nextLine();
		   //----------------------------------------------------------------
	   
	   
	   
	   }
}


class Parent extends Student
{
		long pno1;
		long pinno1;
		String name1,name2,name3,address1,email1,city1,state1;
		Scanner ob1=new Scanner(System.in);
		void show()
		{
			System.out.println("Fill out your parents detail");


			//-------------------------------------------------------------
			System.out.println("Name of your either Parent :");
			System.out.print("First name:");
			name1=ob1.nextLine();
			System.out.print("Middle name:");
			name2=ob1.nextLine();
			System.out.print("Last name:");
			name3=ob1.nextLine(); 
			//-------------------------------------------------------------

			//-------------------------------------------------------------
			System.out.print("Enter your Parent's address : ");
			address1=ob1.nextLine();
			System.out.print("Enter City name :");
			city1=ob1.nextLine();
			System.out.print("Enter State name :");
			state1=ob1.nextLine();

			//--------------------------------------------------------------

			//--------------------------------------------------------------
			System.out.print("Phone no. of your Parent :");
			pno1=ob1.nextLong();
			//--------------------------------------------------------------

			//--------------------------------------------------------------
			System.out.print("Enter  pin no. :");
			pinno1=ob.nextLong();
			//--------------------------------------------------------------


			//--------------------------------------------------------------
			System.out.print("Email address of your Parent :");
			email1=ob.nextLine();
			email1=ob.nextLine();
			//--------------------------------------------------------------
	}	
}

class Qualification extends Parent
{
		Scanner ob2=new Scanner(System.in);
		char ans;
		int qual;
		double percent[]=new double[10];
		String qualification[]=new String[20];	
		int year[]=new int[20];
		String institute[]=new String[20];
		String category[]={"General","OBC","SC","ST","PWD","Other minority"};
		String chocat;
		void print()
		{
			
		System.out.println("Do you have any previous qualification ? :: Y/N");	
		ans=ob2.next().charAt(0);
		if(ans=='y'||ans=='Y')
		{
			System.out.println("How many qualifications do you want to enter? ")	;
			qual=ob2.nextInt();
			for(int i=1;i<=qual;i++)
			{
				System.out.println();	
				System.out.print("Enter your qualification no. "+i+" :");
				qualification[i]=ob.nextLine();
				qualification[i]=ob.nextLine();
				System.out.print("Enter your qualification year: ");
				year[i]=ob2.nextInt();
				System.out.print("Percentage :");
				percent[i]=ob.nextDouble();
				System.out.print("Institute/School name: "); 
				institute[i]=ob2.nextLine();	
				institute[i]=ob2.nextLine();
			}
			System.out.println("Attach your certificates with the form");
		}
		System.out.println("Mention your category quota");
		for(int i=0;i<=5;i++)
		{
			System.out.println((i+1)+")"+category[i]);
		}
		int n=ob2.nextInt();	
		switch(n)
		{
			case 1:System.out.println("General Category");
				   chocat="General";
				   break;
			case 2:System.out.println("OBC Category");
				   chocat="OBC";
				   break;	   
			case 3:System.out.println("SC Category");
				   chocat="SC";
				   break;
			case 4:System.out.println("ST Category");
				   chocat="ST";
				   break; 
			case 5:System.out.println("PWD Category");
				   chocat="PWD";
				   break;
			case 6:System.out.println("Other Minority Category");
				   chocat="Other Minority";
				   break;	   
			default:System.out.println("Cannot recognize your category");
		}
	}	
}

class Dummy extends Qualification
{
	public static void main(String args[])	
	{
			Dummy d=new Dummy();
		for(int g=0;g<=3;g++)
			System.out.println();
		
		
		//---------------------------------------------------------------------------------------------
		System.out.println("-----------------------------------------------------------------------------");	
		System.out.println("****	Welcome to IERT college				                ****"); //might be changed
		System.out.println("****	Please fill out your details on registration form	        ****");
		System.out.println("****	Please be specific with your form			        ****");	
		System.out.println("-----------------------------------------------------------------------------");	
		d.studentdisp();
		System.out.println();
		System.out.println("*****************************************************");
		d.show();
				System.out.println();
		System.out.println("*****************************************************");
		d.print();
		for(int g=0;g<=3;g++)
			System.out.println();
		d.form();
		}
		//----------------------------------------------------------------------------------------------
	void form()
	{
		Random r=new Random();
		System.out.println("|	******	Welcome to IERT COLLEGE	******");
		System.out.println("|	->Name :"+first+" "+middle+" "+last);
		System.out.println("|	->Course:"+course);
		System.out.println("|	->Date of birth :"+dob);
		System.out.println("|	->Gender:"+gend);
		System.out.println("|	->Resedential address :"+address);
		System.out.println("|	->City :"+city);
		System.out.println("|	->State :"+state);
		System.out.println("|	->Phone no. :"+pno);
		System.out.println("|	->Pin no :"+pinno);
		System.out.println("|	->Email adress :"+email);
		System.out.println("------------------------------------------------------------------");
		System.out.println("|	**********	Parents Detail	**********");
		System.out.println("|	->Parent name: "+name1+" "+name2+" "+name3+" ");
		System.out.println("|	->Parent's address' :"+address1);
		System.out.println("|	->City name :"+city1);
		System.out.println("|	->State name :"+state1);
		System.out.println("|	->Parent's phone no. :"+pno1);
		System.out.println("|	->Pin no :"+pinno1);
		System.out.println("|	->Parent's email :"+email1);
		System.out.println("------------------------------------------------------------------");
		System.out.println("|	******	Qualifications	******");

		for(int h=1;h<=qual;h++)
		{
			System.out.print("|	->Qualification name :");	
			System.out.println("|	"+qualification[h]);
			System.out.print("|	->percentage :");
			System.out.println("|	"+percent[h]);
			System.out.print("|	->Qualification year :");
			System.out.println("|	"+year[h]);
			System.out.print("|	->Institute name :");
			System.out.println("|	"+institute[h]);
		}	
		System.out.print("|	->Category quota:");
		System.out.println(chocat);
		System.out.print("|	Your registration no. is :");
    	System.out.println((r.nextInt(2000)+2000));
      
		for(int i=0;i<=3;i++)
		System.out.println();	
		//-------------------------------------------------------------------------------------------------
	}
} 
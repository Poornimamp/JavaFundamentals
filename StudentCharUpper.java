package additionApp;

import java.util.Scanner;

public class StudentCharUpper {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int NoofSubjects;
		
		System.out.println("Enter the NumberOfSubjects");
		NoofSubjects=scan.nextInt();
		int[] marks=new int[NoofSubjects];
		int totalMarks=0;
		System.out.println("Enter Marks");
		for(int i=0;i< NoofSubjects;i++)
		{
			marks[i]=scan.nextInt();        
		} 
		
		int grade = CalculateGrade(marks,NoofSubjects);
		if(grade==-1) {
			System.out.println("Invalid Input");
		}
		else if(grade==1) {
			System.out.println("First Grade University");}
		else if(grade==2) {
			System.out.println("Second Grade University");
		}
		else {System.out.println("Third- Grade University");}
		
		}

	public static int CalculateGrade(int [] arrmark,int subject) {
		int totalMarks=0;
		int average=0;
		
			    	for(int m:arrmark)
			    	{
			    		totalMarks+=m;
			    	}
			    	
	     average=totalMarks/subject;
	   if(average<0 ||average>99) {
		   return -1;
	   }
	    else if (average>80) {
		   return 1;
	   }
	   else if(average>60 && average<80) {
		  return 2;	   
	   }
	   else {
		   return 3;
	   }
	}

	
	}

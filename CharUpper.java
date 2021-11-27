package additionApp;

import java.util.Scanner;

public class CharUpper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the String");
		String s1=scan.nextLine();
		System.out.println("Enter the index to Uppercase");
		int[] arrindex=new int[3];
		for(int i=0;i<arrindex.length;i++)
		{
			arrindex[i]=Integer.parseInt(scan.nextLine());
		}
		for(int i=0;i<arrindex.length;i++) 
		{
			String first=s1.substring(0,arrindex[i]);
			String last=s1.substring(arrindex[i]+1,s1.length());
			char character=s1.toUpperCase().charAt(arrindex[i]);
			s1=first+character+last;
			System.out.println("Uppercase String\t"+s1);
			
		}
		
	       
		
		
	}

}

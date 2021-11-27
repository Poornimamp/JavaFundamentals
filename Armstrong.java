package additionApp;

import java.util.Arrays;

public class Armstrong {

	public static void main(String[] args) {
		 //TODO Auto-generated method stub
		int [] i= {9,9};
		
		
		//String n=Arrays.toString(i);

		int m1=0;
		int m2=0;
		
		for(int m:i) {
			
			m1 = (int)(m*m);
			
			m2+=m1;
			
		

	}	
		System.out.println("Result"+m2);
		//int num=Integer.parseInt(i);
	
		String s1="99";
		int num=Integer.valueOf(s1);
		if(m2 == num)
		{
			System.out.println("ArmstrongNumber");
		}
		else
		{
			System.out.println("Not Armstrong");
		
		}
			
		
}
}
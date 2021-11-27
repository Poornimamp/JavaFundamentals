package loopingStructure;

import java.util.Scanner;

public class IntAddingEachValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Number");
		i=scan.nextInt();
		String arr=String.valueOf(i);
		int r=0,singleDigit;
		int sum=0;
		for(int m=0;m<arr.length();m++)
		{
		      singleDigit=i%10;
		      sum=sum+singleDigit;
		      i=i/10;
		}
         System.out.println("Adding each digit in Integer"+sum);
         
	}

}

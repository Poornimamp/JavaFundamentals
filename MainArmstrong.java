package additionApp;

import java.util.Scanner;

public class MainArmstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Number");
		num=scan.nextInt();
		int sum=0;
		int temp=num;
		//given input-finding powers
		int power=String.valueOf(num).length();
		System.out.println(power);
		//given input -separate the integers and calculate using power and to find value .
		while(num>0)
		{
			int r=num%10;
			sum=(int)(sum+Math.pow(r, power));
			num=num/10;
		}System.out.println("Value is"+sum);
		//if it is Armstrong r not
		if(temp==sum)
		{
			System.out.println("ArmstrongNumber");
		}
		else
		{
			System.out.println("Not an ArmstrongNumber");
		}
		

	}

}


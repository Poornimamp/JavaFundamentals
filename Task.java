package additionApp;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Finding addition and product of two numbers
		Scanner scan=new Scanner(System.in);
		int sum;
		System.out.println("Enter sum of two values");
		sum=scan.nextInt();
		int product;
		System.out.println("Enter product of two values");
		product=scan.nextInt();
		int x=0;
		int ans=0;
		int y=0;
		
		while(ans!=product)
		{   x++; 
			ans=((sum*x)-(x*x));
		}
		System.out.println("First value"+x);
		y=sum-x;
		System.out.println("Second Value"+y);
		
		
	}

}

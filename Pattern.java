package additionApp;

import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int row;
		System.out.println("Enter row");
		row=scan.nextInt();
		//pattern(row);
		pattern1(row);
		//pattern2(row);
		
		

	}
	public static void pattern(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+" ");
				
			}
			System.out.println(" ");
		}
	}
	public static void pattern1(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(i+" ");
				
			}
			System.out.println("");
		}
	}
	public static void pattern2(int n)
	{ int total=0;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++) {
				System.out.print(j+"  ");
				total+=j;
			    if(total>1) {
					System.out.print(" "+total);
				}  
			}
			
			
			System.out.println("  ");
		}
	}
}


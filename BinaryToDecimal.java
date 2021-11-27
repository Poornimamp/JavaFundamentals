package additionApp;

import java.util.Scanner;

public class BinaryToDecimal {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int power=0;
		
		double temp1=0;
		System.out.println("Enter Binary value");
		int binary=scan.nextInt();
		if(binary<0||binary>11111) {
			System.out.println("Invalid Input");
			System.exit(0);
		}
		else {
			while(binary!=0) {
			int rem,a;
			rem=binary%10;
			a=(int) Math.pow(2,power);			 
			 temp1=temp1+rem*a;
			 power++;
			binary=binary/10; 		
			
		}
			System.out.println(" Total\t"+temp1);
			
			}
		
		
   
	}

}

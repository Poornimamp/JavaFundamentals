package additionApp;

import java.util.Scanner;

public class PrimeClass {

	// TODO Auto-generated method stub

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
  int num;
		 System.out.println("Enter Number:");
		 num=scan.nextInt();
		 boolean flag=false;
		 for(int i=2;i<num/2;i++)
		 {
		 if(num%i==0)
		 {flag=true;
		 break;
		 }}
		 if(flag==false)
		 {
		 System.out.println("Is a Prime Number");}
		 else {
		 System.out.println("Is not a Prime Number");
		 }

	}}	
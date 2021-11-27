package additionApp;

import java.util.Arrays;
import java.util.Scanner;

public class PrimeIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Size");
         int size=scan.nextInt();
         if(size<0) {
        	 System.out.println("Invalid Input");
        	 System.exit(0);
         }
         int arr[]=new int[size];
         System.out.println("Enter Array Element");
         for(int i=0;i<size;i++) {
        	 arr[i]=scan.nextInt();
        	 if(arr[i]<0) {
        		System.out.println("Invalid Input");
        		 System.exit(0);
        	 }
        	 
         }
         System.out.println("Arrays Elements"+Arrays.toString(arr));
         int flag=0;
         int z=0;
         for(int i=0;i<size;i++) {
        	  for(int j=2;j<=arr[i]/2;j++) {
        		 
        	 if(arr[i]%j==0) {
        		 flag=1;
        		 break;
        		 
        		 }
        	 }
        	 
        if (flag==0 && arr[i]!=1) {
        	System.out.println("Is a Prime number");
        	
        		  System.out.println("Index value"+i);
        		  z+=i;
        		  System.out.println("Total index value is"+z);
        		 
        } 
        flag=0;
        	 }
        	
         }
	}



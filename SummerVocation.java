package additionApp;

import java.util.Arrays;
import java.util.Scanner;

public class SummerVocation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter size");
		int size=scan.nextInt();
		System.out.println("Enter Integer number");
		int num[]=new int[size];
		for(int i=0;i<size;i++) {
			num[i]=scan.nextInt();
		}
		int[]result=new int[size];
		int temp=0;
		//int last=num.length-1;
		for(int i=0;i<size;i++) {
			
			for(int j=i+1;j<size;j++) {
			if(num[i]<num[j]) {
				
				 temp=num[i];
				num[i]=num[j];
				num[j]=temp;
			}
			}
		}
				
		System.out.println(Arrays.toString(num));	
		
			
		

}

}

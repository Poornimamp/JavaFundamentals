package additionApp;

import java.util.Arrays;
import java.util.Scanner;

public class arraySwap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the size");
		int size=scan.nextInt();
		int [] arr=new int[size];
		int i;
		for(i=0;i<size;i++)
		{
		arr[i]=scan.nextInt();	
		
		}
		interchange(arr,size);
		
		}
		public static void interchange(int [] arr,int size ) {
			int i=0;
			//int j=(int)(size/2);
			
			for(i=0;i<size/2;i++) {
				
				int temp=0;
				temp=arr[i];
				arr[i]=arr[size-1-i];				
				
				arr[size-1-i]=temp;
				
				System.out.println(+arr[i]+""+arr[size-1-i]);//display swapping values
				
				
			}
			System.out.println(Arrays.toString(arr));//display [3, 2, 1]
				
				}
				
	
			
		}
		



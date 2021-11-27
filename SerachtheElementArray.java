package additionApp;



import java.util.Arrays;
import java.util.Scanner;

public class SerachtheElementArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int size;
		System.out.println("Enter the size");
		size=scan.nextInt();
		int[] arr=new int[size];
		System.out.println("Enter an array element");
		for(int i=0;i<size;i++) {
			arr[i]=scan.nextInt();
			
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("Enter the searching element");
		int newele=scan.nextInt();
		int last=arr.length-1;
		int first=0;
		int mid=(first+last)/2;
		while(first<=last)
		{
			if(arr[mid]==newele) {
				System.out.println("An element index is" +mid);
				break;
			}
			else if(arr[mid]<newele) {
				first=mid+1;				
			}
			 else if(arr[mid]>newele) {
				 last=mid-1;
				 }
			mid=(first+last)/2;
			if(first>last)
			{
				System.out.println("The element not found");
			}
			
		
		}

				
		}
			
			
		}
		

	



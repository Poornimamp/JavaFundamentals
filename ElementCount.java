package additionApp;

import java.util.Scanner;

public class ElementCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter size");
		int size=scan.nextInt();
		if(size<0) {
			System.out.println("Invalid Input");
			System.exit(0);
		}
		int arr[]=new int[size];
		System.out.println("Enter Array Elements");
		for(int i=0;i<size;i++) {
			arr[i]=scan.nextInt();
			if(arr[i]<0) {
				System.out.println("Invalid Input");
				System.exit(0);
			}
		}
		int count=0;
		int search;
		System.out.println("Enter Searching Element");
		search=scan.nextInt();
		for(int i=0;i<size;i++) {
			if(arr[i]==search) {
				count++;
				
			}
		}
		System.out.println("Element Count\t"+count);
		
		
				

	}

}

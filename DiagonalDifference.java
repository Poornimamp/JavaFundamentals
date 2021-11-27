package additionApp;

import java.util.Scanner;

public class DiagonalDifference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int arr[][]=new int[3][3];
		//Get Values
		System.out.println("Enter Matrix value");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				System.out.println(+i+" "+j);
				arr[i][j]=scan.nextInt();
				
			}
		}
           //First Diagonal
		int result1=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if(i==j) {
					result1+=arr[i][j];
					
				}
			}
		}
		System.out.println("1st Diagonal Matrix\t"+result1);
		//Second Diagonal
		int result2=0;
		int n=arr.length;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if((i+j)==(n-1)) {
				result2+=arr[i][j];
				
				
				}
			}
		}
		System.out.println("2nd diagonal Matrix\t "+result2);
		//Find Difference
		int diff=result1-result2;
		System.out.println("Absolute Difference\t"+Math.abs(diff));
		
	}
        
}

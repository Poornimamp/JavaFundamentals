package additionApp;

import java.util.Arrays;
import java.util.Scanner;

public class Array2DMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
		int a[][]=new int[2][2];
		int b[][]=new int[2][2];
		
		System.out.println("Enter 1st matrix");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				System.out.println(i+""+j);
				a[i][j]=scan.nextInt();
				
			}
			
		}
		System.out.println(" 1st matrix");
		System.out.println(Arrays.deepToString(a));
		

		System.out.println("Enter 2nd matrix");
		for(int i=0;i<b.length;i++) {
			for(int j=0;j<b.length;j++) {
				System.out.println(i+""+j);
				b[i][j]=scan.nextInt();
				
			}
			
		}
		System.out.println(" 2nd matrix");
		System.out.println(Arrays.deepToString(b));
		
         int result[][]=new int[2][2];
         System.out.println("Subtraction Matrix Result");
 		for(int i=0;i<result.length;i++) {
 			for(int j=0;j<result.length;j++) {
 				result[i][j]=a[i][j]-b[i][j];
 				//System.out.println(result[i][j]);
 			}
 			
 		}
 		System.out.println(Arrays.deepToString(result));
 	
         
	}

}

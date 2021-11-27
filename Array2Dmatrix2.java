package additionApp;

import java.util.Arrays;
import java.util.Scanner;

public class Array2Dmatrix2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
		int col;
		int row;
		
		System.out.println("Enter row and column for 1st matrix");
		row=scan.nextInt();
		col=scan.nextInt();
		
		int a[][]=new int[row][col];
		
		
		System.out.println("Enter 1st matrix");
		for(int i=0;i<row.length;i++) {
			for(int j=0;j<row.length;j++) {
				System.out.println(i+""+j);
				a[i][j]=scan.nextInt();
				
			}
			
		}
		System.out.println(" 1st matrix");
		System.out.println(Arrays.deepToString(a));
		
		System.out.println("Enter row and column for 2nd matrix");
		int row1=scan.nextInt();
		int col1=scan.nextInt();
		int b[][]=new int[row1][col1];
		System.out.println("Enter 2nd matrix");
		for(int i=0;i<row1.length;i++) {
			for(int j=0;j<row1.length;j++) {
				System.out.println(i+""+j);
				b[i][j]=scan.nextInt();
				
			}
			
		}
		System.out.println(" 2nd matrix");
		System.out.println(Arrays.deepToString(b));
		String opera=scan.nextLine();
		switch(opera) {
		
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

	}

}

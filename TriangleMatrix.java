package additionApp;

import java.util.Arrays;
import java.util.Scanner;

public class TriangleMatrix {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		// TODO Auto-generated method stub
		int a[][]=new int[4][4];
	  
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				System.out.println(+i+" "+j);
				a[i][j]=scan.nextInt();
			}
		}
      System.out.println("Matrix is");
      System.out.println(Arrays.deepToString(a));
      //Diagonal Matrix
      int res=0;
      for(int i=0;i<a.length;i++) {
    	  for(int j=0;j<a.length;j++) {
    		  if(i==j) {
    			  res=res+a[i][j];
    		  }
    	  }
      }
      System.out.println("Diagonal Matrix\t"+res);
     // Upper Traiangle
      int result=0;
      for(int i=0;i<a.length;i++) {
    	  for(int j=1;j<a.length;j++) {
    		  if(i<j) {
    			  result=result+a[i][j];
    			  
    			  
    		  }
    		  
      }
      
	}
      System.out.println("Upper Traiangle value is\t"+result); 
      //Lower Triangle
      int result1=0;
      for(int i=1;i<a.length;i++) {
    	  for(int j=0;j<a.length;j++) {
    		  if(i>j) {
    			  result1=result1+a[i][j];
    			  
    			  
    		  }
    		  
      }
      
	}
      System.out.println("Lower Traiangle value is\t"+result1); 
      
	  }
}

package additionApp;

import java.util.Arrays;
import java.util.Scanner;

public class Test {
	public double[] functionDouble(double arr[]) {
		double resarr[]=new double[4];
	//	double[] resarr1=new double[4];
		for(int i=0;i<resarr.length;i++) {
			
			
			if(i%2==0) {
		   resarr[i]= arr[i]/2;
			}	
			else if(i%2!=0) {
				 resarr[i]= arr[i]/3;
			
			}
					
		}
		
		return resarr;
		

		
  
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		double [] a=new double[4];
		
		System.out.println("Enter Values");
		for(int i=0;i<a.length;i++) {
			a[i]=scan.nextDouble();
		}
		System.out.println("Vales are"+Arrays.toString(a));
		Test testObj=new Test();
		double[] b=new double[4];
		//double[] c=new double[4];
		b=testObj.functionDouble(a);
		//c=testObj.functionDouble(a);
		System.out.println("Even/Odd index array avlues are"+Arrays.toString(b));
		//System.out.println("Odd index array values are"+Arrays.toString(c));

	}

	

}

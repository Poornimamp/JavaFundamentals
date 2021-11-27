package additionApp;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysFindMinimum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter array 1 size");
		int size1=scan.nextInt();
		int [] arr1=new int[size1];
		System.out.println("Enter array 1 elements");
		for(int i=0;i<arr1.length;i++) {
			arr1[i]=scan.nextInt();			
		}
		
//		System.out.println("Enter array 2 size");
//		int size2=scan.nextInt();
//		int [] arr2=new int[size2];
//		System.out.println("Enter array 2 elements");
//		for(int i=0;i<arr2.length;i++) {
//			arr2[i]=scan.nextInt();			
//		}
//		System.out.println("Array1"+Arrays.toString(arr1));
//		System.out.println("Array2"+Arrays.toString(arr2));
//		//Find MINIMUM for array 1
//		int min1=arr1[0];
//		int index1=0;
//		for(int i=1;i<arr1.length;i++)
//		{
//			if(min1>arr1[i]) {
//				
//				min1=arr1[i];
//				index1=i;
//			}
//		}
//		System.out.println("Array1 min value"+min1+ "index1"+index1);
//		//Find MINIMUM for array 2
//				int min2=arr2[0];
//				int index2=0;
//				for(int i=1;i<arr2.length;i++)
//				{
//					if(min2>arr2[i]) {
//						
//						min2=arr2[i];
//						index2=i;
//					}
//				}
//				System.out.println("Array2 min value"+min2 +"index2"+index2);
//				
//				if(index1==index2) {
//					Arrays.sort(arr2);
//					System.out.println("Sum of Two minimum array elements"+(min1+arr2[1]));
//					
//				}
//				else {
//					int minimum=min1+min2;
//					System.out.println("Sum of Two minimum array elements"+minimum);
//				}

        // change position value-Student reorder
		System.out.println("Enter index order");
		int[] index3=new int[size1];
		for(int i=0;i<arr1.length;i++){
			index3[i]=scan.nextInt();
		}
		System.out.println("index position to change"+Arrays.toString(index3));
		int[] resArray=new int[size1];
		for(int i=0;i<arr1.length;i++) {
			int pos=index3[i];
			resArray[pos]=arr1[i];
			
		}
		System.out.println(Arrays.toString(resArray));
		
			
		
	}

}

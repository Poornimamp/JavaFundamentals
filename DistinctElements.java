package additionApp;

import java.util.Arrays;

import java.util.Scanner;

public class DistinctElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int[] arr = new int[5];
		System.out.println("Enter the array elements");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}
        System.out.println("The array is:");
		System.out.println(Arrays.toString(arr));
		//Method 1
		int i,j;
		System.out.println("\n The distinct elements are");
		for( i=0;i<arr.length;i++) {
			for( j=0;j<i;j++) 
				if(arr[i]==arr[j])
				break;
				
				if(i==j)
				{
					System.out.println(arr[i]+" ");
				}
		
		}
		
		//Method 2
//		  HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();   
//          
//	        //use for loop to pull the elements of array to hashmap's key  
//	        for (int j = 0; j < arr.length; j++) {   
//	            hm.put(arr[j], j);   
//	        }   
//	        // use hashmap.keySet() for printing all keys of hashmap using it's keySet() method   
//	        System.out.println(hm.keySet());   
//	    
	}
}

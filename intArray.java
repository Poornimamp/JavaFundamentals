package additionApp;
import java.util.Arrays;

public class intArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Find Maximum  and minimum number in integer array
		int[] arr = { 10, 1, 59, 76, 105 };
		int max = arr[0];
		int min = arr[0];

		for (int i = 0; i < arr.length; i++) {
			// condition for find max num in an array
			if (arr[i] > max) {
				max = arr[i];

			}
			if (arr[i]<min) {
				min = arr[i];
			}
		}
		System.out.println("Maximum num in array\t" + max);
		
		System.out.println("Minimum in array\t" + min);
		Arrays.sort(arr);//Sorting arrays
		//To print the array in sorting order
		for(int i=0;i<arr.length;i++) {
			System.out.println("Sorting Arrays"+arr[i]);
		}
		
		
		
	}

}

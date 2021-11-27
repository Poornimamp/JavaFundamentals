package additionApp;

import java.util.Scanner;

public class Prime2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size;
		System.out.println("Enter size");
		size = sc.nextInt();
		if (size < 0) {
			System.out.println("Invalid Input");
			System.exit(0);
		}
		int[] arr = new int[size];
		System.out.println("Enter array elements");

		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
			if (arr[i] < 0) {
				System.out.println("Invalid Input");
				System.exit(0);
			}
		}
		int result = sumPrime(arr, size);
		System.out.println("sum of prime number" +result);

	}

	public static int sumPrime(int[] arr1, int size) {
		int count = 0;
		int total = 0;
		for (int i = 0; i <size; i++) 
		{
			for (int j = 2; j <= (arr1[i] / 2); j++) 
			{
				System.out.println(arr1[j]+"j"+j);
				if (arr1[i] % j == 0)
				{   
					System.out.println("not a primenumber"+arr1[i]);
					count++;
					break;
				}
			}
			if (count == 0) {
				total = total + arr1[i];
			}
			count = 0;

		}
		return total;

	}
}


	



package loopingStructure;
import java.util.Scanner;
public class loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] arr = { 10, 20, 101, 56, 78 };
		int[]arr=new int[5];
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Int ArrayElements");
		for(int m=0;m<5;m++) {
			arr[m]=scan.nextInt();//Initialize value to each elementofAn Array
		}
// using for loop-Adding array elements
		int sum = 0;
		for (int i = 0; i <= 4; i++) {
			sum += arr[i];

		}
		System.out.println("Adding Int arrays using forLoop" + sum);
		// using while loop-Adding array elements
		int sum1 = 0;
		int i1 = 0;
		while (i1 <= 4) {
			sum1 += arr[i1];

			i1++;
		}
		System.out.println("Adding Int arrays using WhileLoop" + sum1);
		// using dowhile loop-Adding array elements
		int i2 = 0;
		int sum2 = 0;
		do {

			sum2 += arr[i2];

			i2++;

		} while (i2 <= 4);
		System.out.println("Adding Int arrays using doWhileLoop" + sum2);
	}

}

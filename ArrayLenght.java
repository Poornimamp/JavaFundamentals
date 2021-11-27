package additionApp;
import java.util.*;

public class ArrayLenght {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		int []arr=new int[5];
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=45;
		arr[4]=50;
		for(int i=0;i<arr.length;i++) {
			arr[i]+=arr[i];
			System.out.println("Result"+arr[i]);
			
		}
		
	}

}

package additionApp;

import java.util.Arrays;
import java.util.Scanner;

public class String1 {

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		String str;
//		for(int i=0;i<str.length;i++) {
//			str[i]=scan.next();
//		}
//		System.out.println("String "+Arrays.toString(str));
		
		String str1="hel lo";
		System.out.println(str1.substring(0, 4));
		
		String [] data=str1.split(" ");
        System.out.println(Arrays.toString(data));
       
        char[] val=new char[5];
        for(int i=0;i<4;i++)
        {
         str[i]= scan.next().charAt(0);
         }
        System.out.println(val.length);
        
	}

}

package additionApp;

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		String [] str= new String[5];
		System.out.println("Enter Names");
		for(int i=0;i<str.length;i++) {
			str[i]=scan.next();
		}
		System.out.println("String Names are"+Arrays.toString(str));
		String str1 = null;
		int n=str.length-1;
		
		for(int i=0;i<str.length;i++) {
			//To check an each string character
			    if(str[i].length()==4) {
			    	str1=str[i];
			    	System.out.println("String with four characters:"+str1);
			    }
			
		}
		char[] a=new char[4];
		char[] b=new char[4];
		for(int i=0;i<a.length;i++) {
			a[i]=scan.next();
		}
		
			
		}
		
		

	}



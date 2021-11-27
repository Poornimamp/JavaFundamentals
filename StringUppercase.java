package additionApp;

import java.util.Scanner;

public class StringUppercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		char[] ch= {'s','t','r','i','n','g'};	
		String s1=String.valueOf(ch);//convert to char array to String
		System.out.println(s1);
		System.out.println(s1.toUpperCase());//change to uppercase
		String s2="string";
		System.out.println(s1==s2);//check out object equals are not
		System.out.println(s1.equals(s2));//check out content equals are not
		System.out.println("Enter String");
		String s3=scan.nextLine();
		System.out.println(s3.substring(1, 5));
		String s4=s3.substring(3);
		System.out.println(s4.toUpperCase());
	
		
				

	}

}

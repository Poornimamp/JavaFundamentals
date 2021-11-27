package additionApp;

import java.util.Scanner;

public class CentigradeProg {
	
	static float convertToCentigrade(int f) 
	{   
		
		float cent;
		cent=((f-32)/9)*5;
		return cent;	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Fahrenheit");
		int Fahren=scan.nextInt();
		if(Fahren<0) {
			System.out.println("Invalid input");
			System.exit(0);
		}
		else {
		 float centigrade= convertToCentigrade(Fahren);
		 System.out.println("Centigrade Equivalent value");
		 System.out.format("%.2f",centigrade);}

	}

}

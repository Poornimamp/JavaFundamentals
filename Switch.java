package additionApp;
import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		

		char [] colours = { 'R', 'G', 'Y', 'V', 'I', 'B', 'O' };
		char ch=colours[4];// passing 4thindex value to ch(char data type)
		
			
		//Passing ch character into switch statement
		    
			switch (ch) {
			case 'R' :
				
				System.out.println("My fav colour is Red");
			   
				
			case 'G':
				System.out.println("My fav colour is Green");
			break;
				
			case 'Y':
				System.out.println("My fav colour is Yellow");
				break;
				
			case 'V':
				System.out.println("My fav colour is Violet");
				break;
				
			case 'I':
				System.out.println("My fav colour is Indigo");
				break;
			case 'B':
				System.out.println("My fav colour is Blue");
				break;
			case 'O':
				System.out.println("My fav colour is Orange");
				break;

			default:
				System.out.println("this is not rainbow colour");
				
			} 
             //Another Method 
		int i=colours.length; 
		//Passing integer value
		switch (i) {
		case 1 :
			
			System.out.println("My fav colour is Red");
			break;
			
		case 2:
			System.out.println("My fav colour is Green");
			break;
			
		case 3:
			System.out.println("My fav colour is Yellow");
			break;
			
		case 4:
			System.out.println("My fav colour is Violet");
			break;
			
		case 5:
			System.out.println("My fav colour is Indigo");
			break;
		case 6:
			System.out.println("My fav colour is Blue");
			break;
		case 7:
			System.out.println("My fav colour is Orange");
			break;

		default:
			System.out.println("this is not rainbow colour");
			
		} 
		String s1;
		Scanner scan=new Scanner(System.in);
		System.out.println("EnterName");
		String sc1=scan.nextLine();
		
		switch(sc1)
		{
		case "Sarvesh" :
			String s2;
			System.out.println("FullName is\t " +sc1+"waran");
			break;
		case "Debasmitha":
			System.out.println("FullName is\t"+sc1+"Manikandan");
			break;
			default:
				System.out.println("Not our family");
		}
		
	
		
		
	} 
}
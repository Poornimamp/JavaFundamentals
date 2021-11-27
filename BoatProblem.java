package additionApp;

import java.util.Scanner;

public class BoatProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Ideal Boat Speed ");
		int boatspeed;
		boatspeed=scan.nextInt();
		System.out.println("Enter Water flow Speed");
		int waterflowSpeed;
		waterflowSpeed=scan.nextInt();
		if(waterflowSpeed<0) 
		{
			System.out.println("Disfavours");
			System.out.println("Enter Distance");
			int distance1;
			distance1=scan.nextInt();
			int speed1=boatspeed+waterflowSpeed;
			//Time Taken
			int time1;
			time1=(distance1/speed1);
			System.out.println("Time Taken\t"+time1);
			
			
		}
		else if(waterflowSpeed>0) {
		System.out.println("Favours");	
		System.out.println("Enter Distance");
		int distance;
		distance=scan.nextInt();
		int speed=boatspeed+waterflowSpeed;
		//Time Taken
		int time;
		time=(distance/speed);
		System.out.println("Time Taken\t"+time);
		
		}

	}

}

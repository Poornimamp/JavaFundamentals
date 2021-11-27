package additionApp;

import java.util.Scanner;

public class VennDiagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter x1 and y1 values");
		//First values
		int x1=scan.nextInt();
		int y1=scan.nextInt();
		System.out.println("X1 and Y1 values\t"+x1+" "+y1);
		//Second Values
		System.out.println("Enter x2 any y2 values");
		int x2=scan.nextInt();
		int y2=scan.nextInt();
		System.out.println("X2 and Y2 values"+x2+" "+y2);
		//Radius of two circles
		System.out.println("Enter Radius R1 and R2 Values");
		int r1=scan.nextInt();
		int r2=scan.nextInt();
		System.out.println("Radius of two Circles R1 and R2 Value\t"+r1+" "+r2);
		int r=r1+r2;
		System.out.println("Total Radius value\t"+r);
		//Calculate Distance value
		float distance;
		distance=(float) Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
		//distance=(double) Math.sqrt(Math.pow((x2-x1),2)+ Math.pow((y2-y1),2));
		System.out.println("Distance ");
		System.out.format("%.2f",distance);
		if(r>distance) {
			System.out.println("\nThe points Intersect");}
		else if(r<distance) {
			System.out.println("\nThe points Do Not touch");}
		else {
			System.out.println("\nThe points Touches");
				
			}
		}
		

	}



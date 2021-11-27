package loopingStructure;
import java.util.Scanner;
public class PFSalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int salary;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Employee Salary");
		salary=scan.nextInt();
		float pf;
		Scanner scan1=new Scanner(System.in);
		System.out.println("Employee PF");
		pf=scan1.nextFloat();		
		pf=(float)pf/100;
		pf*=salary;
		System.out.println("PF Package per month"+pf);
		pf=(pf*12);
		System.out.println("PF Package per year"+pf);
		pf=(pf*30);
		System.out.println("PF Package 3.5years"+pf);
		pf=(pf*90);
		System.out.println("PF Package 4.10years"+pf);
		

	}

}

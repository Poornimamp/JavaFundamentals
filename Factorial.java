package additionApp;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fact=1;
		for(int i=2;i<=5;i++)			
		{
			System.out.println("Factorial of"+i);
			fact=fact*i;
			System.out.println("Factorial value"+fact);
		}

	}

}

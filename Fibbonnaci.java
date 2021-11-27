package additionApp;

public class Fibbonnaci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 int a=0;
	 int b=1;
	 int c=0;
	 System.out.println("Fibonnaci Series"+a+","+b);
	
	 for(int i=2;i<=5;i++)
	 {
		 c=a+b;
		 a=b;
		 b=c;
		 System.out.println(c);

	 }
		
	}

}

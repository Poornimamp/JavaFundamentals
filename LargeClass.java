package additionApp;

public class LargeClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// find Maximum value
		int a=100;
		int b=25;
		int c=105;
		int d=95;
		if(a>b && a>c&& a>d)
		{System.out.println("Large value is"+a);}
		else if( b>a&&b>c&&b>d)
		{
			System.out.println("Large value is"+b);}
		else if( c>a&&c>b&&c>d)
		{
			System.out.println("Large value is"+c);}
		else {System.out.println("Large value is"+d);}
		//Check if it string is same are not pgm1
		String ch="JAVA";
		String ch1="java";
		boolean same=false;
		same=(ch==ch1)? true:false;//Ternary operator
		System.out.println("String is same\t"+same);
		//Check if it string is same are not - pgm2
		String ch2="JAVA";
		String ch3="java";
		boolean same1=  ch2==ch3;//Ternary operator use like this also		
		System.out.println("String is same\t"+same1);
		// finding Maximum number using float numbers
		float f=6.01f;
		float f1=3.98f;
		float f2=5.65f;
		String max=(f>f1&&f>f2)? "Maximum is f":(f1>f&&f1>f2)?"Maximum is f1":"Maximum is f2";//Nested Ternary operator
		System.out.println("Using Float num\t"+max);
	}
	

}
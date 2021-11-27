package additionApp;

public class Datatypes {

	public static void main(String[] args) {
	//integer datatype
int a=2000000000;
System.out.println(a);
//boolean datatype
 boolean n =true;

 System.out.println(n);
 //double datatype
double a1=34.010012121234444;
System.out.println(a1);
	//Widening(automatic)
//Typecasting 1 float to int
	float m=12.19f;
	int m1=0;
	m1=(int)(m);
	System.out.println(m1);
	//Typecasting 1 byte to short
	byte b=123;
	short s=b;
	System.out.println(s);
	//Typecasting 1 byte to double
	double b1=b;
	System.out.println(b1);
//Narrowing (manually)
	//Typecasting 1 double to float
	double b2=23.000000000000000009;
	System.out.println(b2);
	float f=0;
	f=(float)b2;
	System.out.println(f);
	int i1=89;
	b2=i1;
	System.out.println(b2);
	//typecasting char to int& int to char
	char ch ='2';
	int i5=ch;
	System.out.println(i5);
	//convert int to char
	int i6= -127;
	char ch1=(char)i6;
	System.out.println(ch1);
	//convert string to char
	String s1="Hello";
	char []ch2=s1.toCharArray();
	int e1=ch2[0];// convert char index to int
	System.out.println(ch2[0]);
	
	
	
	}
	

}

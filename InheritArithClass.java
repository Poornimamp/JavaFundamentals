package additionApp;

public class InheritArithClass
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
              // Initialize value to variable
		ArithClass arith=new ArithClass();//Object Creation
		int a=arith.ArithFunc(10,20);//Function Calling
		
		System.out.println("ArithmeticInt\t"+a);
		arith.ArithFuncfloat(2.70f,30.07f);
		arith.ArithFuncdouble(2.75f,30.07f);
        
}}
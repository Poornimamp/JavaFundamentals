package additionApp;

public class Arith {
	void ArithFunc(int m,int n)

	{
		int result=m+n;
		System.out.println("Arithmetic"+result);
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arith arith=new Arith();//Object Creation
		arith.ArithFunc(10,20);//Function Calling
        

	}

}

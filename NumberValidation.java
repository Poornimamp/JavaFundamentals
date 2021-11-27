package additionApp;

public class NumberValidation {
	public static void main(String[] args) {
	  int num=0;
      num=-1;
       num=1;
       // boolean data type declaration
       boolean result =getBoolean(num);
       System.out.println("NumberValidation"+result);
	}
private static  boolean getBoolean(int input)
{
	if(input<=0) {
		return false;
	}
	else {
		return true;
	}
	
	
}

	}




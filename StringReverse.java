package additionApp;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="Chennai";
		char[] arr=name.toCharArray();
		System.out.println("Print array Values");
		
		for( int i=0;i<name.length();i++) {
			System.out.println("characters"+arr[i]);
			
			}
		System.out.println("Reverse array Values");
		
		for( int i1=name.length()-1;i1>=0;i1--) {
			System.out.println("Reverse characters"+arr[i1]);

			}
		//Using String Builder
		StringBuilder content=new StringBuilder();
		content.append(name);
		content.reverse();
		System.out.println("Reverse String\t"+content);
		// Split the strings and print the splited strings
		String line= "Sarvesh,10067843,10008.00";
		String []data=line.split(",");
		String Name=data[0];
		String accNumber=data[1];
		String balance=data[2];
		System.out.println("CustAccNO."+Name);
		System.out.println("CustName."+accNumber);
		
		double balanceAmount=Double.valueOf(balance);
		System.out.println("BalanceAmount"+balanceAmount);
		
		
		
	}

}

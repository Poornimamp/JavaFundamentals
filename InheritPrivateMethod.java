package additionApp;
import java.util.Scanner;

public class InheritPrivateMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           PrivateVariable call=new PrivateVariable();
           Scanner scan=new Scanner(System.in);
          //Get custID
           System.out.println("Enter custID");
           //Get custID storein id
           int id=scan.nextInt();
           //call a function to set id in setID()
            call.setID(id);
            //print custID using getID()
           System.out.println("CustID\t"+call.getID());
           // Get custName
           System.out.println("Enter custName");
           //Get custName store in name1
           String name1=scan.next();
           //call a function to set name in setName()
            call.setName(name1);
            //print custName using getName()
           System.out.println("custName\t"+call.getName());
           
           
           
	}

}

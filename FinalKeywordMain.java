package additionApp;

public class FinalKeywordMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          final String firstName="Sarvesh   ";
          final String lastName=" waran";
          //using class name to call method
          final String fullName=FinalKeywordClass.getfullName(firstName, lastName);
          System.out.println("FullName\t"+fullName);
          //using creating object to invoke method
          FinalKeywordClass finalclass=new FinalKeywordClass();
          finalclass.getfullName(firstName, lastName);
          System.out.println("FullName\t"+fullName);
          //String Utilies
          String Name=firstName.toUpperCase();
          System.out.println("\nuppercase"+Name);
          String Name1=firstName.toLowerCase();
          System.out.println("\nlowercase"+Name1);
          String Name2=firstName.trim();
          System.out.println("\nTrim"+Name2);
          int Name3=(int)firstName.length();
          System.out.println("\nLenght"+Name3);
          boolean Name4=(boolean)firstName.isEmpty();
          System.out.println("\nEmpty"+Name4);
          
          
	}

}


package additionApp;

public class StaticCalling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//New Memory Space allocated for sc&SC1 Object
       StaticClass sc=new StaticClass();
       StaticClass sc1=new StaticClass();
       System.out.println(sc.i);
       System.out.println(sc1.i);
       sc.i=sc.i+1;
       System.out.println(sc.i);
       System.out.println(sc1.i);
       StaticClass.Method1();
	}

}

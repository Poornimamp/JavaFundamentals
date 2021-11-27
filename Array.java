package additionApp;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int [] marks=new int[5];//Size initialize
  //Marks array list
  marks[0]=58;
  marks[1]=89;
  marks[2]=78;
  marks[3]=44;
  marks[4]=90;
  //Display size
  System.out.println("Size"+marks.length);
  //using looping statement
  System.out.println("using looping structure");
  for(int i=0;i<marks.length;i++)
  {
	  int m=marks[i];
	  System.out.println(m);
  }
  // Using foreach loop
  System.out.println("Using Eachloop");
  for( int m1:marks)
  {System.out.println(m1);
	}
  //Finding TotalMarks
  int totalMarks=0;
  System.out.println("TotalMarks:");
  for(int m2:marks) {
	  totalMarks=totalMarks+m2;
	  
	  
  }
  System.out.println(+totalMarks);
  int NoofSubjects=marks.length;
  
  float average=(float)(totalMarks/NoofSubjects);
  System.out.println("Average"+average);

}}

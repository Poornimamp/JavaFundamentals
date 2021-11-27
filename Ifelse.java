package additionApp;

public class Ifelse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// intialize a variable
		int a = 10;
		// check condition
		if (a >= 20) {
			System.out.println("Result" + a);
			// nested if-check condition
		} else if (a <= 10) {
			System.out.println("Result" + (a + 1));
		}
		// otherwise display this statement
		else {
			System.out.println(" a value Result" + a);
		}
		
		
		
		
//initialize variable for checking num1 even or odd
		int num1 = 10;
		if (num1 % 2 == 0) {
			System.out.println("even");

		} else {
			System.out.println("odd");
		}
		// initialize variable mark for checking pass or fail
		int mark = 50;
		if (mark >= 50) {
			System.out.println("Pass");

		} else {
			System.out.println("Fail");
		}
		// initialize variable a1 in float datatype and to diplay it
		float a1 = 1.75f;
		int c;
		c = (int) (a1 + 1);// type casting float to int
		System.out.println("value is" + c);

		// using if condition to call method
		// Using Logical operators
		// check the stud Marks and display in Grade either A or or B or Failed
		// nested elseif
		int studMarks = 50;

		if (studMarks >= 80 && studMarks <= 100) {
			System.out.println("Grade A");
		}
		// Nested if
		else if (studMarks >= 80 && studMarks < 90) {
			System.out.println("Grade B");
		} else if (studMarks >= 50 && studMarks < 80) {
			System.out.println("Grade C");
		} else {
			System.out.println("Failed");

		}
		// Here convert your integer into String
		int marks3 = 20;
		int marks4 = 60;
		// type casting
		String result1 = getMethod(marks3);
		String result2 = getMethod(marks4);
		System.out.println("Result:" + result1 + "marks:" + marks3);
		System.out.println("Result:" + result2 + "marks:" + marks4);
	}
	private static String getMethod(int marks) {
		String result = null;
		if (marks >= 50) {
			result = "passed";

		}

		else {
			result = "Failed";
		}

		return result;
	}

}
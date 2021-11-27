package additionApp;

public class Studpercentage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] mark1 = { 50, 60, 70, 45, 89 };
		int[] mark2 = { 85, 67, 79, 95, 90 };
		int totalMark1 = 0;
		int totalMark = 0;
		for (int m : mark1) {
			totalMark = totalMark + m;

		}
		System.out.println(" Student 1:TotalMark:" + totalMark);
		int stud = (int) (totalMark / 5);
		System.out.println("Totalpercentage:" + stud);
		for (int m1 : mark2) {
			totalMark1 = totalMark1 + m1;

		}
		System.out.println("Student2:TotalMark:" + totalMark1);
		int stud1 = (int) (totalMark1) / 5;
		System.out.println("TotalPercentage:" + stud1);

	}

}

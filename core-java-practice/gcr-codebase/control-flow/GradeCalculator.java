import java.util.Scanner;

public class GradeCalculator
 {

	public static void main(String[] args)
     {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter marks in Physics: ");
		int phy = sc.nextInt();

		System.out.print("Enter marks in Chemistry: ");
		int chem = sc.nextInt();

		System.out.print("Enter marks in Maths: ");
		int maths = sc.nextInt();

		double avg = (phy + chem + maths) / 3.0;
		String grade;
		String rem;

		if (avg >= 80) 
        {
			grade = "A";
			rem = "Level 4, above agency-normalized standards";
		}

         else if (avg >= 70) 
        {
			grade = "B";
			rem = "Level 3, at agency-normalized standards";
		}

         else if (avg >= 60)
         {
			grade = "C";
			rem = "Level 2, below, but approaching agency-normalized standards";
		} 
        
        else if (avg >= 50)
         {
			grade = "D";
			rem = "Level 1, well below agency-normalized standards";
		} 

        else if (avg >= 40) 
        {
			grade = "E";
			rem = "Level 1-, too below agency-normalized standards";
		} 

        else 
        {
			grade = "R";
			rem = "Remedial standards";
		}
		System.out.printf("Average Marks: %.2f%%\n Grade: %s%nRemarks: %s%n", avg, grade, rem);

		sc.close();
	}
}
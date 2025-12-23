import java.util.Scanner;

public class StudentGrades2D 
{
    public static void main(String[] args) 
    {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[][] marks = new int[n][3];
        double[] percentage = new double[n];
        char[] grade = new char[n];

        for (int i = 0; i < n; i++)
         {
            int p = sc.nextInt();
            int c = sc.nextInt();
            int m = sc.nextInt();

            if (p < 0 || c < 0 || m < 0) 
            {
                System.out.println("Enter positive marks");
                i--;
            } 
            else 
            {
                marks[i][0] = p;
                marks[i][1] = c;
                marks[i][2] = m;
            }
        }

        for (int i = 0; i < n; i++) 
        {
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            percentage[i] = total / 3.0;

            if (percentage[i] >= 90)
             {
                grade[i] = 'A';
            }
             else if (percentage[i] >= 75) 
             {
                grade[i] = 'B';
            } 
            else if (percentage[i] >= 60) 
            {
                grade[i] = 'C';
            }
             else if (percentage[i] >= 40)
              {
                grade[i] = 'D';
            } 
            else 
            {
                grade[i] = 'F';
            }
        }

        for (int i = 0; i < n; i++)
         {
            System.out.println("Physics: " + marks[i][0] +
                               " Chemistry: " + marks[i][1] +
                               " Maths: " + marks[i][2] +
                               " Percentage: " + percentage[i] +
                               " Grade: " + grade[i]);
        }

        sc.close();
    }
}
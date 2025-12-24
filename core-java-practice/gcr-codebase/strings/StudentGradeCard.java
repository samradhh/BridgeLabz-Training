import java.util.Scanner;

public class StudentGradeCard 
{

    public static int[][] generatePCM(int n) 
    {
        int[][] pcm = new int[n][3];

        for (int i = 0; i < n; i++) {
            pcm[i][0] = (int) (Math.random() * 100);
            pcm[i][1] = (int) (Math.random() * 100);
            pcm[i][2] = (int) (Math.random() * 100);
        }
        return pcm;
    }

    public static double[][] calculateStats(int[][] pcm) 
    {
        double[][] stats = new double[pcm.length][4];

        for (int i = 0; i < pcm.length; i++) 
        {
            int total = pcm[i][0] + pcm[i][1] + pcm[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            stats[i][0] = total;
            stats[i][1] = Math.round(average * 100.0) / 100.0;
            stats[i][2] = Math.round(percentage * 100.0) / 100.0;
        }
        return stats;
    }

    public static String[][] calculateGrades(double[][] stats) 
    {
        String[][] grades = new String[stats.length][1];

        for (int i = 0; i < stats.length; i++) 
        {
            double percent = stats[i][2];

            if (percent >= 90)
                grades[i][0] = "A+";
            else if (percent >= 80)
                grades[i][0] = "A";
            else if (percent >= 70)
                grades[i][0] = "B";
            else if (percent >= 60)
                grades[i][0] = "C";
            else if (percent >= 50)
                grades[i][0] = "D";
            else
                grades[i][0] = "F";
        }
        return grades;
    }

    public static void displayScoreCard(int[][] pcm, double[][] stats, String[][] grades) 
    {
        System.out.println("\nStu\tPhy\tChem\tMath\tTotal\tAvg\t%\tGrade");
        System.out.println("-------------------------------------------------------------");

        for (int i = 0; i < pcm.length; i++) 
        {
            System.out.println(
                    (i + 1) + "\t" +
                    pcm[i][0] + "\t" +
                    pcm[i][1] + "\t" +
                    pcm[i][2] + "\t" +
                    (int) stats[i][0] + "\t" +
                    stats[i][1] + "\t" +
                    stats[i][2] + "\t" +
                    grades[i][0]
            );
        }
    }

    public static void main(String[] args)
     {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[][] pcm = generatePCM(n);
        double[][] stats = calculateStats(pcm);
        String[][] grades = calculateGrades(stats);

        displayScoreCard(pcm, stats, grades);

        sc.close();
    }
}
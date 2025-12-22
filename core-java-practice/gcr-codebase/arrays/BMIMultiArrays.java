import java.util.Scanner;

public class BMIMultiArrays
 {
    public static void main(String[] args)
     {

        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        double[][] personData = new double[number][3];
        String[] weightStatus = new String[number];

        for (int i = 0; i < number; i++) {
            double w = sc.nextDouble();
            double h = sc.nextDouble();

            if (w <= 0 || h <= 0)
             {
                System.out.println("Enter positive values");
                i--;
            } 
            else
             {
                personData[i][0] = w;
                personData[i][1] = h;
            }
        }

        for (int i = 0; i < number; i++) 
        {
            personData[i][2] = personData[i][0] / (personData[i][1] * personData[i][1]);

            if (personData[i][2] < 18.5) 
            {
                weightStatus[i] = "Underweight";
            } 
            else if (personData[i][2] < 25)
             {
                weightStatus[i] = "Normal";
            } 
            else
             {
                weightStatus[i] = "Overweight";
            }
        }

        for (int i = 0; i < number; i++) {
            System.out.println("Height: " + personData[i][1] +
                               " Weight: " + personData[i][0] +
                               " BMI: " + personData[i][2] +
                               " Status: " + weightStatus[i]);
        }

        sc.close();
    }
}

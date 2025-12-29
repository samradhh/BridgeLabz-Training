import java.util.Scanner;

public class BMICalculator {

    public static void calculateBMI(double[][] data) {
        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];
            double heightCm = data[i][1];
            double heightMeter = heightCm / 100;
            data[i][2] = weight / (heightMeter * heightMeter);
        }
    }

    public static String[] findBMIStatus(double[][] data) {
        String[] status = new String[data.length];

        for (int i = 0; i < data.length; i++) {
            double bmi = data[i][2];

            if (bmi < 18.5) {
                status[i] = "Underweight";
            } else if (bmi >= 18.5 && bmi < 25) {
                status[i] = "Normal";
            } else if (bmi >= 25 && bmi < 30) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }
        return status;
    }

    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);

        double[][] data = new double[10][3];

        for (int i = 0; i < 10; i++) {
            data[i][0] = r.nextDouble();
            data[i][1] = r.nextDouble();
        }

        calculateBMI(data);
        String[] status = findBMIStatus(data);

        for (int i = 0; i < 10; i++) {
            System.out.println("Height: " + data[i][1] +
                    " Weight: " + data[i][0] +
                    " BMI: " + data[i][2] +
                    " Status: " + status[i]);
        }
    }
}
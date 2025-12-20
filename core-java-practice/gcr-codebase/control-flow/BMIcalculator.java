import java.util.Scanner;

public class BMIcalculator 
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter weight in kg: ");
		double w = sc.nextDouble();
		System.out.print("Enter height in cm: ");
		double h = sc.nextDouble();
		double bmi = w / Math.pow(h / 100, 2);
		if (bmi < 18.5)
        {
			System.out.println("Weight Status: Underweight");
	}
         else if (bmi >= 18.5 && bmi < 25)
        {
			System.out.println("Status: Normal weight");
		} 
        else if (bmi >= 25 && bmi < 30) 
        {
			System.out.println("Status: Overweight");
		} 
        else
        {
			System.out.println("Status: Obese");
		}
		sc.close();
	}
}
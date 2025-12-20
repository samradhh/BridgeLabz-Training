import java.util.Scanner;

public class SumCompareNaturalNumber
 {
	public static void main(String[] args)
     {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int i = sc.nextInt();

		if (i < 0)
         {
			System.out.println("Number is not natural");
		} 
        else
         {
			int usingFormula = i * (i + 1) / 2;
			int sum = 0;
			while (i > 0) 
            {
				sum += i;
				i--;
			}
			System.out.printf("Sum after using formula %d and sum after loop %d answer is %s", usingFormula, sum, usingFormula == sum ? "Correct" : "Wrong");

			sc.close();
		}
	}
}
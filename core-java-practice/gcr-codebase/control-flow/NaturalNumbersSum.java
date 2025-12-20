import java.util.Scanner;

public class NaturalNumbersSum 
{

	public static void main(String[] args)
    
     {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int input = sc.nextInt();
		if (input < 0)
         {
			System.out.println("Number is not natural");
		} else
         {
			int Formula = input * (input + 1) / 2;
			int sum = 0;
			for (int i = 1; i <= input; i++) 
            {
				sum += i;
			}
			System.out.printf(" Sum after using formula %d and sum after loop %d answer is %s ", Formula, sum,Formula == sum ? "Correct" : "Wrong");
			
            sc.close();
		}
	}

}
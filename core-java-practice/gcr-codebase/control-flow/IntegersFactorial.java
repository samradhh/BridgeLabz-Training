import java.util.Scanner;

public class IntegersFactorial
 {
	public static void main(String[] args)
     {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number = ");
		int i = sc.nextInt();
		if (i < 0)
         {
			System.out.print("Number is not natural");
		} 
        else
         {
			int fact = 1;
			while (i > 1)
             {
				fact *= i;
				i--;
			}
			System.out.printf("Factorial of number  %d", fact);
		}
		sc.close();
	}
}
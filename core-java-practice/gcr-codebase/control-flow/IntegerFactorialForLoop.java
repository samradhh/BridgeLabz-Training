import java.util.Scanner;

public class IntegerFactorialForLoop
 {
	public static void main(String[] args) 
    {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number = ");
		int input = sc.nextInt();
		if (input < 0) 
        {
			System.out.print("Number is not natural");
		} 
        else 
        {
			int fact = 1;
			System.out.printf("Factorial of number %d is ", input);
			for (; input > 0; input--)
             {
				fact *= input;
			}
			System.out.print(fact);
		}
		sc.close();
	}
}
import java.util.Scanner;

public class Factors
 {
	public static void main(String[] args) 
    {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int input = sc.nextInt();
		if (input < 0)
         {
			System.out.print("Number is negative");
		} 
        else 
        {
			for (int i = 1; i < input; i++)
             {
				if (input % i == 0) {
					System.out.printf("Number %d is divisible by %d%n", input, i);
				}
			}
		}
		sc.close();
	}
}
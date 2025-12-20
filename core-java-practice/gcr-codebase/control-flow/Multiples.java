import java.util.Scanner;

public class Multiples 
{
	public static void main(String[] args) 
    {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a positive number less than 100: ");
		int num = sc.nextInt();
		if (num > 0 && num < 100) 
        {
			for (int i = 100; i > 0; i--)
             {
				if (num % i == 0) 
                {
					System.out.printf("Number %d is multiple of %d%n", i, num);
				}
			}
		} 
        else
         {
			System.out.println("Invalid input! enter a positive number less than 100");
		}
		sc.close();
	}
}
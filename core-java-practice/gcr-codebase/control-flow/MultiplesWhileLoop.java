import java.util.Scanner;

public class MultiplesWhileLoop 
{
	public static void main(String[] args) 
    {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a positive number less than 100: ");
		int num = sc.nextInt();

		if (num > 0 && num < 100)
         {
			int c = num - 1;
			while (c > 0)
             {
				if (num % c == 0)
                 {
					System.out.printf("Number %d is multiple of %d%n", c, num);
				}
				c--;
			}
		} 
        else 
        {
			System.out.println("Invalid input! Please enter a positive number less than 100.");
		}
		sc.close();
	}
}
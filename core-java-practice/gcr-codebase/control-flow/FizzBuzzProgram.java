
import java.util.Scanner;

public class FizzBuzzProgram 
{
	public static void main(String[] args) 
    {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number = ");
		int input = sc.nextInt();
		if (input < 0) {
			System.out.print("Entered number is not positive");
		} else {
			for (int i = 1; i <= input; i++) 
            {
				if (i % 3 == 0 && i % 5 == 0) 
                {
					System.out.println("FizzBuzz");
				} 
                else if (i % 3 == 0)
                 {
					System.out.println("Fizz");
				}
                 else if (i % 5 == 0)
                  {
					System.out.println("Buzz");
				}
                 else
                  {
					System.out.println(i);
				}
			}
		}
		sc.close();
	}
}

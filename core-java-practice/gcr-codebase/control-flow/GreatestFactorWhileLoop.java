import java.util.Scanner;

public class GreatestFactorWhileLoop 
{
	public static void main(String[] args) 
    {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number = ");
		int num = sc.nextInt();
		int greatestFr = 1;
		int i = num - 1;
		while (i > 0)
         {
			if (num % i == 0) 
            {
				greatestFr = i;
				break;
			}
			i--;
		}
		System.out.printf("Greatest Factor for %d is %d", num, greatestFr);

		sc.close();
	}
}
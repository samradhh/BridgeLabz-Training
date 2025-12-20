import java.util.Scanner;

public class GreatestFactor 
{
	public static void main(String[] args) 
    {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the numbrer to find its greatest factor = ");
		int num = sc.nextInt();
		int greatestF = 1;
		for (int i = num - 1; i >= 1; i--) 
        {
			if (num % i == 0)
             {
				greatestF = i;
				break;
			}
		}
		System.out.printf("Greatest Factor for %d is %d", num, greatestF);

		sc.close();
	}
}
import java.util.Scanner;

public class AbundantNumber 
{
	public static void main(String[] args)
     {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number = ");
		int num = sc.nextInt();
		int s = 0;
		for (int i = 1; i < num; i++)
         {
			s += num % i == 0 ? i : 0;
		 }
		System.out.printf("%d is %s Abundant number", num, s> num ? "a" : "not a");
		sc.close();
	}
}
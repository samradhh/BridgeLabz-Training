import java.util.Scanner;

public class HarshadNumber 
{
	public static void main(String[] args) 
    {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number = ");
		int num = sc.nextInt();
		int s = 0;
		int temp = num;
		while (temp != 0) {
			int dig = temp % 10;
			s= s + dig;
			temp = temp / 10;
		}
		System.out.printf("%d is %s Harshad number", num, num % s == 0 ? "a" : "not a");

		sc.close();
	}
}
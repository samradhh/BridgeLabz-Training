import java.util.Scanner;

public class ArmstrongNumber 
{
	public static void main(String[] args) 
    {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number = ");
		int num = sc.nextInt();
		int s = 0;
		int originalnum = num;
		int digit = (int) Math.log10(num) + 1;
		while (originalnum != 0) 
        {
			s += Math.pow(originalnum % 10, digit);
			originalnum = originalnum / 10;
		}
		System.out.printf("%s", s == num ? "Number is Armstrong" : "Number is not Armstrong");
		sc.close();
	}
}
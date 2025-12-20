import java.util.Scanner;

public class CountDown
 {

	public static void main(String[] args)
     {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number to start timer: ");
		int num = sc.nextInt();
		for (; num > 0; num--)
         {
			System.out.println(num);
		}
		System.out.print("Lets start abouve countdown");
		sc.close();
	}

}
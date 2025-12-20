import java.util.Scanner;

public class WhileCountDown
 {

	public static void main(String[] args)
     {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number to start timer: ");
		int num = sc.nextInt();
		while (num != 0)
         {
			System.out.println(num);
			num--;
		}
		System.out.print("Launch");
		sc.close();
	}

}
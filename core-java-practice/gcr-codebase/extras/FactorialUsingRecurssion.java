import java.util.Scanner;
public class FactorialUsingRecurssion {
    public static int factorial(int n) {
        if(n==0){
            return 1;
        } else {
            return n*factorial(n-1);
        }
    }
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        System.out.print("Enter a number to calculate its factorial: ");
        int num=r.nextInt();
        System.out.println("Factorial of "+num+" is: "+factorial(num));
    }
}
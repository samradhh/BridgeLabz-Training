import java.util.*;
public class CheckNumber
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int numbers[]=new int[5];
        for(int i=0;i<5;i++)
        {
            numbers[i]= sc.nextInt();
        }
        for(int i:numbers)
        {
            if(i==0)
            {
                System.out.println("Zero");
                return;
            }
            else if(i<0)
            {
                System.out.println("Negative numbers");
            }
            else
            {
                if(i%2==0)
                {
                    System.out.println("Positive Even numbers");
                }
                else
                {
                    System.out.println("Positive odd numbers");
                }
            }
        }
        if(numbers[0]<numbers[4])
        {
            System.out.println("The first number is smaller than the last number");
        }
       else  if(numbers[0]>numbers[4])
       {
            System.out.println("The first number is greater than the last number");
        }
        else
        {
            System.out.println("Both the numbers are equal");
        }
    }
}
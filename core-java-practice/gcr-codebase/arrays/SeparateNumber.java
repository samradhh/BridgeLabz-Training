import java.util.*;
public class SeparateNumber
 {
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int size=n/2+1;
        int oddArray[]=new int[size];
        int evenArray[]=new int[size];
        int odd=0,even=0;
        for(int i=1;i<=n;i++)
        {
            if(i%2==0)
            {
                evenArray[even++]=i;
            }
            else
            {
                oddArray[odd++]=i;
            }
        }
        System.out.println("Even Arrays Elements are");
        for(int i:evenArray)
        {
            System.out.println(i);
        }
         System.out.println("Odd Arrays Elements are");
        for(int i:oddArray)
        {
            System.out.println(i);
        }
    }
}
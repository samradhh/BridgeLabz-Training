import java.util.*;
public class FactorsArray 
{
    public static void main(String[]args)
    {
        Scanner  sc = new Scanner(System.in);
        int n= sc.nextInt();
        int factors[]=new int[n];
        int k=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                factors[k++]=i;
            }
        }
        System.out.println("the factors are :");
        for(int i:factors)
        {
            if(i==0)
            {
                break;
            }
            else
            {
                System.out.println(i);
            }
        }
    }
}
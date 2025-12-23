import java.util.*;
public class Voting_Eligibility 
{
    public static void main(String[]args)
    {
        Scanner sc =new Scanner (System.in);
        int ages[]=new int[10];
        for(int i=0;i<10;i++){
            ages[i]=sc.nextInt();
        }
        for(int i:ages)
        {
            if(i<=0)
            {
                System.out.println("Invalid Age");
            }
            else if(i>=18)
            {
                System.out.println("The peron with the age "+i+" can vote");
            }
            else
            {
                System.out.println("The peron with the age "+i+" can not vote");
            }
        }
    }
}
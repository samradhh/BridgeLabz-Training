    import java.util.*;
    public class FizzBuzz_Array
     {
        public static void main(String[] args) 
        {
            Scanner sc =new Scanner(System.in);
            int n = sc.nextInt();
            if(n<=0)
            {
                return;
            }
            for(int i=1;i<=n;i++)
            {
                if((i%3==0)&&(i%5==0))
                {
                    System.out.println("Position "+i+" :FizzBuzz");
                }
                else if(i%3==0)
                {
                    System.out.println("Position "+i+" :Fizz");
                }
                else if(i%5==0)
                {
                    System.out.println("Position "+i+" :Buzz");
                }
                else
                {
                    System.out.println("Position "+i+" : "+i);
                }
            }
            sc.close();
        }
    }
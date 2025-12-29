import java.util.*;
public class VoterBooth
 {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int first=0;
        int second=0;
        int third=0;
        while(true){
            System.out.println("Cast Your vote to (1,2 and 3 ) candiadtes");
            int vote=sc.nextInt();
            if(vote==1)
            {
                first++;
            }
            else if(vote==2)
            {
                second++;
            }
            else if(vote==3)
            {
                third++;
            }
            else
            {
                System.out.println("Only  Three candidated are there so vote according to it");
                continue;
            }
            System.out.println("No more Voter are there kindly enter 'Stop' to stopping the vote casting or type anything else");
            String t=sc.next();
            if(t.equalsIgnoreCase("stop"))
            {
                break;
            }
        }
        System.out.println("the votes of candidate for first candidate : "+first);
        System.out.println("the votes of candidate for Second candidate : "+second);
        System.out.println("the votes of candidate for third candidate : "+third);
    }
}
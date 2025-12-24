import java.util.*;
public class TrimTheSpaces
 {
    public static void main(String []args)
    {
        Scanner sc =new Scanner(System.in);
        String text=sc.nextLine();
        String updatedtext="";
        for(char i:text.toCharArray())
        {
            if(i==' ')
            {
                continue;
            }
            else
            {
                updatedtext+=i;
            }
        }
        System.out.println("the updated text is :"+updatedtext);
    }
}
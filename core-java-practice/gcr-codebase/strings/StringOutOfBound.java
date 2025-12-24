import java.util.Scanner;

public class StringOutOfBound 
{
    public static void main(String[] args) 
    {

        Scanner sc = new Scanner(System.in);
        String text = sc.next();

        generateException(text);
        handleException(text);

        sc.close();
    }

    static void generateException(String s)
     {
        
        System.out.println(s.charAt(s.length()));
    }

    static void handleException(String s) 
    {
        try 
        {
            System.out.println(s.charAt(s.length()));
        } 
        catch (StringIndexOutOfBoundsException e)
         {
            System.out.println("Caught StringIndexOutOfBoundsException: " + e.getMessage());
        }
    }
}
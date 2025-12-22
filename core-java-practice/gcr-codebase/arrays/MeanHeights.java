import java.util.*;
public class MeanHeights
 {
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        double ages[]=new double[11];
        for(int i=0;i<11;i++){
            ages[i]=sc.nextDouble();
        }
        double totalage=0.0;
        for(double i:ages)
        {
            totalage+=i;
        }
        System.out.println("The mean height of football team is "+(totalage/11));
    }
}
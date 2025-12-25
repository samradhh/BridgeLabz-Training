import java.util.*;
public class SimpleInterest
 {
    public static int calculate(int p,int r,int t)
    {
        int si=(p*r*t)/100;
        return si;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int principal = sc.nextInt();
        int rate = sc.nextInt();
        int time = sc.nextInt();
        System.out.println("The Simple Interest is"+(calculate(principal,rate,time)));
    }
}
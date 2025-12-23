import java.util.*;
public class Calender
 {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int month=sc.nextInt();
        int year=sc.nextInt();
        int y0=year-(14-month)/12;
        int x=y0+(y0/4)-(y0/100)+(y0/400);
        int m0=month+12*((14-month)/12)-2;
        int d0 = (1 + x + (31*m0)/12) % 7;

        System.out.println(month+" "+year);
        System.out.println("----------------------------------");
        System.out.println("SUN\tMON\tTUE\tWED\tTHU\tFRI\tSAT");
        for(int i=0;i<d0;i++)
        {
            System.out.print("\t");
        }
        int daysInMonth;
        if (month == 2)
         {
            if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0))
             {
                daysInMonth = 29;
            } 
            else 
            {
                daysInMonth = 28;
            }
        } 
        else if (month == 4 || month == 6 || month == 9 || month == 11) {
            daysInMonth = 30;
        }
         else 
         {
            daysInMonth = 31;
        }
        for(int i=1;i<=daysInMonth;i++)
        {
            System.out.print(i + "\t");
            if (((i + d0) % 7 == 0) || (i == daysInMonth)) 
            {
                System.out.println();
            }
        }

    }

}
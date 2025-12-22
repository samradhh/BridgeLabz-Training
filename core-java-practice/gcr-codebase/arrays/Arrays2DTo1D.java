import java.util.*;
public class Arrays2DTo1D 
{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        int columns=sc.nextInt();
        int array2D[][]=new int[rows][columns];
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++)
            {
                array2D[i][j]=sc.nextInt();
            }
        }
        int array1D[]=new int[rows*columns];
        int k=0;
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<columns;j++)
            {
                array1D[k++]=array2D[i][j];
            }
        }
        for(int i:array1D)
        {
            System.out.println(i);
        }
    }
}
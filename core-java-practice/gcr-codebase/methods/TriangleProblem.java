import java.util.*;
public class TriangleProblem {
    public static int perimetercalculator(int first,int second,int third){
        return first+second+third;
    }
    public static int rounds(int distance,int perimeter){
        return distance/perimeter;
    }
    public static void main(String[]args){
        Scanner r=new Scanner(System.in);
        int firstSide=r.nextInt();
        int secondSide=r.nextInt();
        int thirdSide=r.nextInt();
        int total=perimetercalculator(firstSide,secondSide,thirdSide);
        int distance=r.nextInt();
        System.out.print("The one have to run to cover "+distance+" km is "+rounds(distance,total)+" rounds");
    }
}
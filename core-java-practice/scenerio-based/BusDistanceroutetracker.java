import java.util.*;
public class Bus_Distance_Route_Tracker {
    public static void main(String[]args){
        Scanner r=new Scanner(System.in);
        double totalDistance = 0;
        boolean continueRoute = true;

        while(continueRoute) {
            System.out.print("Enter distance to next stop (km): ");
            double distance = r.nextDouble();
            totalDistance += distance;
            
            System.out.print("Does passenger want to get off at this stop? (yes/no): ");
            String response = r.next();
            
            if(response.equalsIgnoreCase("yes")) {
                System.out.println("Total distance traveled: " + totalDistance + " km");
                continueRoute = false;
            }
        }

        r.close();
        
    }
}
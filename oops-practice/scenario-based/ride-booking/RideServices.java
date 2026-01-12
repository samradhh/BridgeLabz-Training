import java.util.*;
public class RideServices implements FareCalculator {
    List<Ride> list_Ride=new ArrayList<>();
    public void createRide(String source, String destination, double distance, double fare){
        Ride r=new Ride(source,destination,distance,fare);
        list_Ride.add(r);
        System.out.print("Ride Created Successfully");
    }
    public double FareCalculator(double d){
        return d*15d;
    }
}
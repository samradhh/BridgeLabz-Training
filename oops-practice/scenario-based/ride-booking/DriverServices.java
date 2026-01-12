import java.util.*;

public class DriverServices {

    private List<Driver> drivers = new ArrayList<>();

    public void createDriver(String name, String license,String vehicle, String location) {
        Driver driver = new Driver(name, license, vehicle, location);
        drivers.add(driver);
        System.out.println("Driver Created Successfully");
    }

    public boolean isDriverAvailable(String location) {
        try{
        for (Driver d : drivers) {
            if (d.location.equals(location)) {
                return true;
            }
        }
        return false;
    }
    catch(NullPointerException e){
        System.out.print(e);
        return false;
    }
    }
    public Driver getAvailableDriver(String location) {
        for (Driver d : drivers) {
            if (d.location.equalsIgnoreCase(location)) {
                return d;
            }
        }
        return null;
    }
}
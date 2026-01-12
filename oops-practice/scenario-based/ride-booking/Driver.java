import java.util.*;
public class Driver {
    String name;
    String licenseNumber;
    String vehicleType;
    String location;
    List<Driver> list_Drivers=new ArrayList<>();
    Driver(String name, String licenseNumber, String vehicleType,String location) {
        this.name = name;
        this.licenseNumber = licenseNumber;
        this.vehicleType = vehicleType;
        this.location=location;
    }

}
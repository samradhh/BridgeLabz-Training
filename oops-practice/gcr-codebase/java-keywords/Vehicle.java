import java.util.Scanner;

public class Vehicle {
    String ownerName;
    String vehicleType;
    final String registrationNumber;
    static double registrationFee = 150.0;

    Vehicle(String ownerName, String vehicleType, String registrationNumber){
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    void displayVehicleDetails(Object obj){
        if(obj instanceof Vehicle){
            System.out.println("Owner Name: " + ownerName);
            System.out.println("Vehicle Type: " + vehicleType);
            System.out.println("Registration Number: " + registrationNumber);
            System.out.println("Registration Fee: $" + registrationFee);
        }
    }

    static void updateRegistrationFee(double fee){
        registrationFee = fee;
    }

    public static void main(String[] args){
        Scanner r = new Scanner(System.in);
        Vehicle v1 = new Vehicle("Honest raj", "Sedan", "ABC123");
        Vehicle v2 = new Vehicle("Price danish", "SUV", "XYZ789");
        Object[] arr = {v1, v2};
        for(Object o : arr){
            if(o instanceof Vehicle){
                ((Vehicle)o).displayVehicleDetails(o);
            }
            else{
                System.out.println("Invalid Object");
            }
        }
    }
}
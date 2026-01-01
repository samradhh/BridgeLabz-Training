import java.util.Scanner;

public class Vehicle {
    String ownerName;
    String vehicleType;
    static double registrationFee = 500.0;

    Vehicle(String ownerName, String vehicleType){
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    void displayVehicleDetails(){
        System.out.println("Owner: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: " + registrationFee);
    }

    static void updateRegistrationFee(double fee){
        registrationFee = fee;
    }

    public static void main(String[] args){
        Scanner r = new Scanner(System.in);
        Vehicle v1 = new Vehicle("Alice", "Car");
        v1.displayVehicleDetails();
        Vehicle.updateRegistrationFee(750);
        v1.displayVehicleDetails();
    }
}
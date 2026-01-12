import java.util.*;
public class Main {
    public static void main(String[]args){
        Scanner r=new Scanner(System.in);
        UserServices user=new UserServices();
        user.createUser("Samradh Srivastava","8923793436","abc@gmail.com");
        DriverServices driver=new DriverServices();
        driver.createDriver("Hariram","123456","98765","delhi");
        System.out.println("Enter the pickup point");
        String source=r.nextLine();
        RideServices rd=new RideServices();
        if(driver.isDriverAvailable(source)){
            System.out.println("Enter the drop point");
            String destination=r.nextLine();
            System.out.println("Enter the Distance");
            double d=r.nextDouble();
            
            rd.createRide(source,destination,d,15d);
            double total=rd.FareCalculator(d);
            System.out.println("Total price during the ride :"+ total);
        }
        else{
            System.out.println("No Driver available at this time ");
        }
    }
}
public class CarRentalSystem {
    private String customerName;
    private String carModel;
    private int rentalDays;
    private double dailyRate = 50.0;
    // Default constructor
    public CarRentalSystem() {
        this.customerName = "Default Customer";
        this.carModel = "Toyota Corolla";
        this.rentalDays = 1;
        this.dailyRate = 50.0;
    }

    // Parameterized constructor
    public CarRentalSystem(String customerName, String carModel, int rentalDays, double dailyRate) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        this.dailyRate = dailyRate;
    }

    public double calculateTotalCost() {
        return rentalDays * dailyRate;
    }

    public void displayRentalDetails() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Daily Rate: $" + dailyRate);
        System.out.println("Total Cost: $" + calculateTotalCost());
        System.out.println("---------------------------");
    }

    public static void main(String[] args) {
        CarRentalSystem defaultRental = new CarRentalSystem();
        CarRentalSystem customRental = new CarRentalSystem("John Doe", "Honda Civic", 3, 60.0);
        defaultRental.displayRentalDetails();
        customRental.displayRentalDetails(); 
    }
}
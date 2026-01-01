
public class MobileDetails {
    String brand;
    String model;
    int price;

    public MobileDetails(String brand, String model, int price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public static void displayMobileDetails(MobileDetails mobile) {
        System.out.println("Mobile Brand: " + mobile.brand);
        System.out.println("Mobile Model: " + mobile.model);
        System.out.println("Mobile Price: " + mobile.price);
        System.out.println("---------------------------");
    }

    public static void main(String[] args) {
        MobileDetails mobile1 = new MobileDetails("Apple", "iPhone 13", 999);
        MobileDetails mobile2 = new MobileDetails("Samsung", "Galaxy S21", 799);
        MobileDetails mobile3 = new MobileDetails("OnePlus", "9 Pro", 969);

        MobileDetails[] mobiles = {mobile1, mobile2, mobile3};

        for (MobileDetails mobile : mobiles) {
            displayMobileDetails(mobile);
        }
    }    
}
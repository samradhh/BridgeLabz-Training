public class Product {
    private String productName;
    private final int productId;
    private double price;
    private int quantity;
    private static int discountPercentage = 10;
    public Product(String productName, int productId, double price, int quantity) {
        this.productName = productName;
        this.productId = productId;
        this.price = price;
        this.quantity = quantity;
    }
    public void applyDiscount() {
        double discountAmount = (price * discountPercentage) / 100;
        price -= discountAmount;
    }
    public void displayProductInfo() {
        if(this instanceof Product) {
            System.out.println("Product Info:");
            System.out.println("Name: " + productName);
            System.out.println("ID: " + productId);
            System.out.println("Discount Percentage: " + discountPercentage + "%");
            System.out.println("Price after discount: " + price);
            System.out.println("Quantity: " + quantity);
            System.out.println("---------------------------");

        } else {
            System.out.println("Invalid product instance:");
        }
    }
    public static void main(String[] args) {
        Product prod1 = new Product("Laptop", 101, 50000, 5);
        Product prod2 = new Product("Smartphone", 102, 20000, 10);
        prod1.applyDiscount();
        prod2.applyDiscount();
        prod1.displayProductInfo();
        prod2.displayProductInfo();

    }
}
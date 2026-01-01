import java.util.Scanner;

public class Product {
    String productName;
    double price;
    static int totalProducts;

    Product(String productName, double price){
        this.productName = productName;
        this.price = price;
        totalProducts++;
    }

    void displayProductDetails(){
        System.out.println("Product Name: " + productName);
        System.out.println("Price: " + price);
    }

    static void displayTotalProducts(){
        System.out.println("Total Products: " + totalProducts);
    }

    public static void main(String[] args){
        Scanner r = new Scanner(System.in);
        Product p1 = new Product("Laptop", 75000);
        Product p2 = new Product("Phone", 20000);
        p1.displayProductDetails();
        p2.displayProductDetails();
        Product.displayTotalProducts();
    }
}
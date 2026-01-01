public class CartItemDemo {
    static class CartItem {
        String itemName;
        double price;
        int quantity;
        CartItem(String name, double price, int qty) {
            this.itemName = name;
            this.price = price; this.quantity = qty;
         }
        void add(int qty) { quantity += qty; System.out.println("Added " + qty + " of " + itemName + " to the cart."); }
        void remove(int qty) { quantity -= qty; if (quantity < 0) quantity = 0; System.out.println("Removed " + qty + " of " + itemName + " from the cart."); }
        void display() { System.out.println("Item: " + itemName + ", Price: $" + price + ", Quantity: " + quantity); }
        void total() { System.out.printf("Total cost: $%.2f%n", price * quantity); }
    }
    public static void main(String[] args) {
        CartItem item = new CartItem("Laptop", 999.99, 1);
        item.display();
        item.add(2);
        item.remove(1);
        item.total();
    }
}
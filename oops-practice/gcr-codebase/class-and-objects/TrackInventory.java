import java.util.*;
public class TrackInventory {
    String itemCode;
    String itemName;
    int price;
    public TrackInventory(String itemCode, String itemName, int price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }
    public static void displayInventoryDetails(TrackInventory item) {
            System.out.println("Item Code: " + item.itemCode);
            System.out.println("Item Name: " + item.itemName);
            System.out.println("Item Price: " + item.price);
            System.out.println("---------------------------");
    }
    public static int totalPrice(List<TrackInventory> items,String itemName,int Quantity) {
        int price=0;
        for (TrackInventory item : items) {
            if(item.itemName.equalsIgnoreCase(itemName)){
                price=Quantity*item.price;
            }
        }
        return price;
    }
    public static void main(String[] args) {
        TrackInventory item1 = new TrackInventory("A101", "Laptop", 50);
        TrackInventory item2 = new TrackInventory("B202", "Smartphone", 150);
        TrackInventory item3 = new TrackInventory("C303", "Tablet", 80);

        List<TrackInventory> inventory = new ArrayList<>();
        inventory.add(item1);
        inventory.add(item2);
        inventory.add(item3);

    for (TrackInventory item : inventory) {
            displayInventoryDetails(item);
        }

         Scanner r = new Scanner(System.in);
            System.out.print("Enter the item name to calculate total price: ");
            String itemName = r.nextLine();
            System.out.print("Enter the quantity: ");   
            int quantity = r.nextInt();
            int total = totalPrice(inventory, itemName, quantity);
            if(total>0){
                System.out.println("Total price for " + quantity + " " + itemName + "(s): " + total);
            }
            else{
                System.out.println("Item not found in inventory.");
            }
    }
}
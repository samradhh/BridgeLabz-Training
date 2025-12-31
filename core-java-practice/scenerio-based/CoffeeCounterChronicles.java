import java.util.*;
class Coffee_Counter_Chronickles {
    public static void main (String[] args){
        Scanner r=new Scanner(System.in);
        int totalbill=0;
        int price = 1;
        while(true){
            System.out.println("What type of Coffee You Want??");
            String coffee = r.nextLine();
        switch (coffee) {
            case "Espresso":
                price = 120;
                break;

            case "Cappuccino":
                price = 150;
                break;

            case "Latte":
                price = 160;
                break;

            case "Americano":
                price = 140;
                break;

            case "Mocha":
                price = 170;
                break;

            default:
                System.out.println("Coffee not available");   
                continue;    
        }
        System.out.println("How Many cup of coffee do you want??");
        int quantity=r.nextInt();
        totalbill+=quantity*price; 
        r.nextLine();
        System.out.println("Do You Want to Give More Order??");
        String status=r.nextLine();
        if(status.equalsIgnoreCase("No")){
            break;
        }  
    }
        double gst=totalbill*0.05;            
        System.out.println("the total bill without GST: "+totalbill);
        System.out.println("the total bill with GST: "+(totalbill+gst));
    }
}
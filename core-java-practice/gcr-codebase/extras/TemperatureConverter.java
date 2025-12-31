import java.util.Scanner;
public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        System.out.print("Enter temperature in Celsius: ");
        double celsius=r.nextDouble();
        double fahrenheit=(celsius*9/5)+32;
        System.out.println(celsius+"°C is equal to "+fahrenheit+"°F");
    }
}
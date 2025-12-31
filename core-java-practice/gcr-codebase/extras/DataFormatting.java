import java.util.Scanner;
public class DataFormatting {
    public static void main(String[] args) {
        java.time.LocalDate currentDate = java.time.LocalDate.now();
        
        java.time.format.DateTimeFormatter format1 = java.time.format.DateTimeFormatter.ofPattern("dd/MM/yyyy");
        java.time.format.DateTimeFormatter format2 = java.time.format.DateTimeFormatter.ofPattern("yyyy-MM-dd");
        java.time.format.DateTimeFormatter format3 = java.time.format.DateTimeFormatter.ofPattern("EEE, MMM dd, yyyy");
        
        System.out.println("Format 1 (dd/MM/yyyy): " + currentDate.format(format1));
        System.out.println("Format 2 (yyyy-MM-dd): " + currentDate.format(format2));
        System.out.println("Format 3 (EEE, MMM dd, yyyy): " + currentDate.format(format3));
    }
}
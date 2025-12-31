import java.time.LocalDate;
public class DataArithmatic {
public static void main(String[] args) {
    LocalDate date = LocalDate.of(2024, 1, 15);
    System.out.println("Original date: " + date);
    
    LocalDate result = date
        .plusDays(7)
        .plusMonths(1)
        .plusYears(2)
        .minusWeeks(3);
    
    System.out.println("After arithmetic operations: " + result);
}
}
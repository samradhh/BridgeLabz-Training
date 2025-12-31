public class SandeepFitnessTracker {
public static void main(String[] args) {
    int[] pushups = {20, 25, 0, 30, 28, 0, 35};
    String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
    
    int total = 0;
    int activeDays = 0;
    
    for (int i = 0; i < pushups.length; i++) {
        if (pushups[i] == 0) {
            continue;       
        }
        total += pushups[i];
        activeDays++;
        System.out.println(days[i] + ": " + pushups[i] + " push-ups");
    }
    
    double average = (activeDays > 0) ? (double) total / activeDays : 0;
    
    System.out.println("\nTotal push-ups: " + total);
    System.out.println("Active days: " + activeDays);
    System.out.println("Average per active day: " + average);
}
}
import java.util.ArrayList;
import java.util.Random;

class EmployeeWages {
    static final int ABSENT = 0;
    static final int FULL_TIME = 1;
    static final int PART_TIME = 2;

    static final int RATE_PER_HOUR = 20;
    static final int FULL_TIME_HOURS = 8;
    static final int PART_TIME_HOURS = 4;

    static final int MAX_DAYS = 20;
    static final int MAX_HOURS = 100;

    Random randomGenerator = new Random();
    ArrayList<Integer> wageRecord = new ArrayList<>();

    public int getAttendanceStatus() {
        return randomGenerator.nextInt(2); 
    }

    public int computeDailySalary(int workType) {
        int workHours;

        if (workType == FULL_TIME) {
            workHours = FULL_TIME_HOURS;
        } else if (workType == PART_TIME) {
            workHours = PART_TIME_HOURS;
        } else {
            workHours = 0;
        }

        return workHours * RATE_PER_HOUR;
    }

    // Calculate total salary for the month
    public void computeMonthlySalary() {
        int dayCount = 0;
        int totalHoursWorked = 0;
        int monthlyPay = 0;

        while (dayCount < MAX_DAYS && totalHoursWorked < MAX_HOURS) {

            dayCount++;
            int employeeType = randomGenerator.nextInt(3); // 0,1,2

            int todaySalary = computeDailySalary(employeeType);
            int todayHours = todaySalary / RATE_PER_HOUR;

            totalHoursWorked += todayHours;
            monthlyPay += todaySalary;

            wageRecord.add(todaySalary);

            System.out.println(
                "Day " + dayCount +
                " | Hours: " + todayHours +
                " | Salary: " + todaySalary
            );
        }

        System.out.println("\nTotal Days Worked: " + dayCount);
        System.out.println("Total Hours Worked: " + totalHoursWorked);
        System.out.println("Total Monthly Salary: " + monthlyPay);
    }

    public static void main(String[] args) {

        System.out.println("Welcome to Employee Salary Computation Program\n");

        EmployeeSalarySystem employee = new EmployeeSalarySystem();

        int status = employee.getAttendanceStatus();
        if (status == 1) {
            System.out.println("Employee is Present");
        } else {
            System.out.println("Employee is Absent");
        }

        System.out.println("\nCalculating Monthly Salary...\n");
        employee.computeMonthlySalary();
    }
}

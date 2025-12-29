import java.util.Scanner;

public class CalenderDisplay {

    static String getMonthName(int m) {
        String[] months = {
                "January","February","March","April","May","June",
                "July","August","September","October","November","December"
        };
        return months[m - 1];
    }

    static boolean isLeapYear(int y) {
        return (y % 400 == 0) || (y % 4 == 0 && y % 100 != 0);
    }

    static int getDaysInMonth(int m, int y) {
        int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};
        if (m == 2 && isLeapYear(y)) {
            return 29;
        }
        return days[m - 1];
    }

    static int getFirstDay(int m, int y) {
        int d = 1;
        if (m < 3) {
            m += 12;
            y--;
        }
        int k = y % 100;
        int j = y / 100;
        int day = (d + (13 * (m + 1)) / 5 + k + k / 4 + j / 4 + 5 * j) % 7;
        return (day + 6) % 7;
    }

    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);

        int month = r.nextInt();
        int year = r.nextInt();

        System.out.println("     " + getMonthName(month) + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        int firstDay = getFirstDay(month, year);
        int totalDays = getDaysInMonth(month, year);

        for (int i = 0; i < firstDay; i++) {
            System.out.printf("%3s", "");
        }

        for (int day = 1; day <= totalDays; day++) {
            System.out.printf("%3d", day);
            if ((day + firstDay) % 7 == 0) {
                System.out.println();
            }
        }
    }
}
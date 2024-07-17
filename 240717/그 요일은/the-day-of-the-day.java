import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();
        String A = sc.next();

        int[] daysInMonth = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        String[] weekdays = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
        int targetDay = 0;
        for (int i = 0; i < weekdays.length; i++) {
            if (weekdays[i].equals(A)) {
                targetDay = i;
                break;
            }
        }

        int startDayOfYear = calculateDayOfYear(m1, d1, daysInMonth);

        int endDayOfYear = calculateDayOfYear(m2, d2, daysInMonth);

        int startWeekday = 0;
        int startWeekdayOffset = (startWeekday + (startDayOfYear - 1)) % 7;

        int count = 0;
        for (int day = startDayOfYear; day <= endDayOfYear; day++) {
            if ((startWeekdayOffset + (day - startDayOfYear)) % 7 == targetDay) {
                count++;
            }
        }

        System.out.println(count);
    }

    private static int calculateDayOfYear(int month, int day, int[] daysInMonth) {
        int dayOfYear = 0;
        for (int i = 1; i < month; i++) {
            dayOfYear += daysInMonth[i];
        }
        dayOfYear += day;
        return dayOfYear;
    }
}
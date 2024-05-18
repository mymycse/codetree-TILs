import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] month = {0,31,28,31,30,31,30,31,31,30,31,30,31};
        String[] day = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};

        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();
        int elapsedDays = 0;
        boolean check = false;

        if ( m1 == m2 ) {
            elapsedDays = Math.abs(d1-d2);

            if (d1 > d2)
                check = true;
        }
        else {
            if ( m1 > m2 ) {
                int temp = m1;
                m1 = m2;
                m2 = temp;
                temp = d1;
                d1 = d2;
                d2 = temp;
                check = true;
            }

            while ( true ) {
                if ( m1 == m2 && d1 == d2 ) {
                    break;
                }

                elapsedDays++;
                d1++;

                if ( d1 > month[m1] ) {
                    d1 = 1;
                    m1++;
                }
            }
        }
        
        elapsedDays %= 7;

        if ( check )
            System.out.println(day[7-elapsedDays]);
        else
            System.out.println(day[elapsedDays]);
    }
}
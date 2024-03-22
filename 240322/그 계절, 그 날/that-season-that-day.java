import java.util.Scanner;

public class Main {
    public static boolean isLeap ( int y ) {
        if ( ( y % 4 == 0 && y % 100 != 0 ) || y % 400 == 0 )
            return true;
        return false;
    }
    public static final int lastDay ( int y , int m ) {
        if ( m == 2 ) {
            if ( isLeap(y) )
                return 29;
            else
                return 28;
        }
        if ( m == 4 || m == 6 || m == 9 || m == 11 )
            return 30;
        return 31;
    }
    public static boolean isExist ( int y , int m , int d ) {
        if ( d <= lastDay(y,m) )
            return true;
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int y = sc.nextInt();
        int m = sc.nextInt();
        int d = sc.nextInt();

        if ( isExist(y,m,d) ) {
            if ( m == 12 || m < 3 )
                System.out.print("Winter");
            else if ( m < 6 )
                System.out.print("Spring");
            else if ( m < 9 )
                System.out.print("Summer");
            else
                System.out.print("Fall");
        }
        else
            System.out.print(-1);
    }
}
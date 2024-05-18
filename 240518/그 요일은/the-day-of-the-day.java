import java.util.Scanner;

public class Main {
    public static int change (String str) {
        if ( str.equals("Mon") )
            return 7;
        if ( str.equals("Tue") )
            return 1;
        if ( str.equals("Wed") )
            return 2;
        if ( str.equals("Thu") )
            return 3;
        if ( str.equals("Fri") )
            return 4;
        if ( str.equals("Sat") )
            return 5;
        return 6; 
    }
    public static int days (int m, int d) {
        int[] month = {0,31,29,31,30,31,30,31,31,30,31,30,31};
        int result = 0;

        for ( int i = 1 ; i < m ; i++ )
            result += month[i];
        
        return (result+d);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();

        int elpasedDays = days(m2,d2) - days(m1,d1);
        int result = elpasedDays/7;

        int p = change(sc.next());
        
        if ( elpasedDays%7 <= p )
            result++;

        System.out.println(result);
    }
}
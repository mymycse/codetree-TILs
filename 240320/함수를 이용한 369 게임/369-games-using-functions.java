import java.util.Scanner;

public class Main {
    public static boolean div( int n ) {
        return n % 3 == 0;
    }
    public static boolean isInt( int n ) {
        int a = n;
        int True = 0;

        for ( ;; ) {
            if ( a % 10 == 3 || a % 10 == 6 || a % 10 == 9 ) {
                True++;
                break;
            }
            else
                a /= 10;
            if ( a == 0 )
                break;
        }
        return True == 1 || div(n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int cnt = 0;

        for ( int i = a ; i <= b ; i++ ) {
            if (isInt(i))
                cnt++;
        }

        System.out.print(cnt);
    }
}
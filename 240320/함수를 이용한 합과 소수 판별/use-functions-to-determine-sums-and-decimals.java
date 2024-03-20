import java.util.Scanner;

public class Main {
    public static boolean isInt( int n ) {
        for ( int i = 2 ; i < n ; i++ )
            if ( n % i == 0 )
                return false;
        return true;
    }
    public static boolean isEven( int n ) {
        int sum = 0;
        int a = n;

        for ( int i = 0 ; i < 2 ; i++ ) {
            sum += a % 10;
            a /= 10;
        }
        return  sum % 2 == 0 && isInt(n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int cnt = 0;

        for ( int i = a ; i <= b ; i++ ) {
            if ( isEven(i) )
                cnt++;
        }

        System.out.print(cnt);
    }
}
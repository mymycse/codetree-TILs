import java.util.Scanner;

public class Main {
    public static void common( int n, int m ) {

        int a = 0, b = 0;
        
        if ( n > m ) {
            a = n;
            b = m;
            }
        else {
            a = m;
            b = n;
        }

        int div = 0;

        for ( int i = b ; i > 0 ; i-- ) {
            if ( n % i == 0 && m % i == 0 ) {
                div = i;
                break;
            }
        }

        System.out.print(n*m/div);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        common(n,m);
    }
}